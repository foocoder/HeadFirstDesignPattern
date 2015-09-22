
public class StrategyPattern{
    public StrategyPattern(){

    }
    public static void main(String [] args){
        //MallardDuck duck1 = new MallardDuck();
        //duck1.display();
        //duck1.performFly();
        //duck1.performQuack();
        ModelDuck duck2 = new ModelDuck();
        duck2.display();
        duck2.performQuack();
        duck2.performFly();
        System.out.println("Now Change it!");
        duck2.setFlyBehavior(new FlyRocketPowered());
        duck2.performFly();

    }
}
