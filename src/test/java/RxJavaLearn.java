import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Alibaba Group
 *
 * @author 晨烛
 * @project LearnJava
 * @date 2017/8/15
 */
public class RxJavaLearn {
    private final Logger logger = LoggerFactory.getLogger(RxJavaLearn.class);

    @Test
    public void d1() {
        Observable.create((ObservableOnSubscribe<Integer>)observableEmitter -> {
            observableEmitter.onNext(1);
            observableEmitter.onNext(2);
            observableEmitter.onNext(3);
            Thread.sleep(3213);
            observableEmitter.onComplete();
        }).subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                logger.info("subscribe");
            }

            @Override
            public void onNext(Integer integer) {
                logger.info("Next:" + integer);
            }

            @Override
            public void onError(Throwable throwable) {
                logger.error(throwable.getMessage());
            }

            @Override
            public void onComplete() {
                logger.info("Complete execution");
            }
        });

        logger.info("AFTER");
    }

    @Test
    public void testOneThread() throws InterruptedException {
        logger.info("Former outer thread is " + Thread.currentThread().getName());

        Observable<Integer> observable = Observable.create(observableEmitter -> {
            logger.info("Ob thread is " + Thread.currentThread().getName());
            observableEmitter.onNext(1);
        });

        Consumer<Integer> consumer = value -> {
            logger.info("Consumer thread is " + Thread.currentThread().getName());
            logger.info("onNext " + value);
        };

        observable
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.single())
            .subscribe(consumer);

        logger.info("Outer thread is " + Thread.currentThread().getName());
        Thread.sleep(9999);
    }


}
