
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehave = new Quack();
        flyBehave   = new FlyWithWing();
    }
    public void display(){
        System.out.println("I am a Mallard Duck");
    }
}
