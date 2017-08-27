package polymorphism;

/**
 * Created by hugansen on 2016/8/1.
 */
interface Actor {
    public void act();
}

class SadActor implements Actor {
    @Override
    public void act() {
        System.out.println("SadActor");
    }
}

class HappyActor implements Actor {
    @Override
    public void act() {
        System.out.println("HappyActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();

    public void changeActor() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }
}

public class DynamicTransform {

    public static void main(String... args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.changeActor();
        stage.performPlay();
    }
}
