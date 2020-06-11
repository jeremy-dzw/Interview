package 多态的演示;

public class test
{
    public static void main(String[] args)
    {
        Animal a = new Dog();
        a.eat();
        a.play();
    }
}
class  Animal
{
     void eat()
     {}
     void play()
     {}
}
class Dog extends  Animal
{
    void eat()
    {
        System.out.println("狗狗要吃骨头.....");
    }
}
class Cat extends Animal
{
    void eat()
    {
        System.out.println("猫咪要吃鱼摆摆.....");
    }
}