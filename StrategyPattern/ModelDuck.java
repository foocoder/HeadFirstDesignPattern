
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehave = new FlyNoWay();
        quackBehave = new MuteQuack();
    }
    public void display(){
        System.out.println("This is a Model Duck, it cant say anything");
    }
}
