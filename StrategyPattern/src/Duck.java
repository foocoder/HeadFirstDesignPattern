
public abstract class Duck{
    FlyBehavior flyBehave;
    QuackBehavior quackBehave;
    public Duck(){
    }
    public abstract void display();
    public void performFly(){
        flyBehave.fly();
    }
    public void performQuack(){
        quackBehave.quack();
    }
    public void swim(){
        System.out.println("All of the Duck can swim!");
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehave = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehave = qb;
    }
}
