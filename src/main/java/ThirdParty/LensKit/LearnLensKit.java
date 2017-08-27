package ThirdParty.LensKit;

import org.grouplens.lenskit.ItemRecommender;
import org.grouplens.lenskit.ItemScorer;
import org.grouplens.lenskit.RecommenderBuildException;
import org.grouplens.lenskit.baseline.BaselineScorer;
import org.grouplens.lenskit.baseline.ItemMeanRatingItemScorer;
import org.grouplens.lenskit.baseline.UserMeanBaseline;
import org.grouplens.lenskit.baseline.UserMeanItemScorer;
import org.grouplens.lenskit.core.LenskitConfiguration;
import org.grouplens.lenskit.core.LenskitRecommender;
import org.grouplens.lenskit.data.dao.EventDAO;
import org.grouplens.lenskit.data.sql.BasicSQLStatementFactory;
import org.grouplens.lenskit.data.sql.JDBCRatingDAO;
import org.grouplens.lenskit.knn.item.ItemItemScorer;
import org.grouplens.lenskit.scored.ScoredId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * Project: LearnJava
 * Package: ThirdParty.LensKit
 * Author:  Novemser
 * 2017/6/4
 */
public class LearnLensKit {
    private static final Logger logger = LoggerFactory.getLogger(LearnLensKit.class);

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        String connectionString =
                "jdbc:sqlserver://localhost:1433;"
                        + "database=AmazonProductRec;"
                        + "user=sa;"
                        + "password=1234;"
                        + "loginTimeout=30;";
//        String connectionString = "jdbc:mysql://localhost:3306/bi?user=root&password=1234&useSSL=false";

        logger.info("Start program at " + new Date().toString());
        try {
            Connection connection = DriverManager.getConnection(connectionString);
//            TextEventDAO textEventDAO = TextEventDAO.create(new File(""), new DelimitedColumnEventFormat(new RatingEventType()));
            BasicSQLStatementFactory statementFactory = new BasicSQLStatementFactory();
            statementFactory.setTableName("rating");
            statementFactory.setRatingColumn("rating");
            statementFactory.setItemColumn("itemId");
            statementFactory.setUserColumn("userId");
            statementFactory.setTimestampColumn(null);
//            statementFactory.set
            JDBCRatingDAO dao = new JDBCRatingDAO(connection, statementFactory);

            LenskitConfiguration config = new LenskitConfiguration();
            // Use item-item CF to score items
            config.bind(ItemScorer.class)
                    .to(ItemItemScorer.class);
            // let's use personalized mean rating as the baseline/fallback predictor.
            // 2-step process:
            // First, use the user mean rating as the baseline scorer
            config.bind(BaselineScorer.class, ItemScorer.class)
                    .to(UserMeanItemScorer.class);
            // Second, use the item mean rating as the base for user means
            config.bind(UserMeanBaseline.class, ItemScorer.class)
                    .to(ItemMeanRatingItemScorer.class);

//            config.bind(RuntimeUpdate.class, FunkSVDUpdateRule.class).to(FunkSVDUpdateRule.class);
            // and normalize ratings by baseline prior to computing similarities
//            config.bind(UserVectorNormalizer.class)
//                    .to(BaselineSubtractingUserVectorNormalizer.class);
//            config.set(FeatureCount.class).to(25);
//            config.set(IterationCount.class).to(125);

//            config.set(DeviationDamping.class).to(0.0d);

            config.bind(EventDAO.class).to(dao);

            logger.info("Start building at " + new Date().toString());
            LenskitRecommender recommender = LenskitRecommender.build(config);
            logger.info("Finished building at " + new Date().toString());
            logger.info("Start getRecommender at " + new Date().toString());
            ItemRecommender itemRecommender = recommender.getItemRecommender();


            logger.info("Finished getRecommender at " + new Date().toString());
            logger.info("Start recommending for user 5187 at " + new Date().toString());
            List<ScoredId> scoredIdList = itemRecommender.recommend(5187, 5);
            logger.info("Finished recommending for user 5187 at " + new Date().toString());

            for (ScoredId id : scoredIdList) {
                System.out.println(id.getId() + " : " + id.getScore());
            }

        } catch (SQLException | RecommenderBuildException e) {
            e.printStackTrace();
        }


    }
}
