package ThirdParty.RxJava;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Alibaba Group
 *
 * @author 晨烛
 * @project LearnJava
 * @date 2017/8/14
 */
public class TheAsyJava {
    public static void main(String[] args) throws InterruptedException {
        Flowable.just("Hello world").subscribe(System.out::println);
        Flowable.fromCallable(()->{
            Thread.sleep(5000);
            return "Done";
        })
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.single())
            .subscribe(System.out::println, Throwable::printStackTrace);

        Thread.sleep(5500);
    }

}
