package classAndInterface;
/**
 * 抽象方法与接口的区别：
 * (1)接口中全是抽象方法，而抽象类中既可以有抽象方法，也可以有非抽象方法
 * (2)抽象类中有构造器，但是不能创建对象；接口没有构造器
 * (3)接口中全是常量，而抽象类中可以有常量和变量
 * **/
public class classAndInterfaceDemo
{
    public static void main(String[] args)
    {   //person person = new person();
        haoperson haoperson = new haoperson();
        haoperson.dowork();
        haoperson.dosport();
    }
}
abstract class person
{   abstract void dowork();
    void dosport()
    {
        System.out.println("i  love swimming...");
    }
    int a = 10;//变量
    static final int number = 6;//常量
}
interface human
{   void eat();
    void sleep();
    void work();
    int k = 5;
}
class haoperson extends person
{
    @Override
    void dowork()
    {
        System.out.println("i  want  to  work  during  the  day...");
    }
}