package constructor;
/**
 * 方法重写发生在继承关系中，而构造器不能被继承，所以，构造器不能被重写
 * 构造器可以发生方法的重载：要求是方法参数的个数，顺序，类型不同即可
 * **/
public class constructorDemo
{
    public static void main(String[] args)
    {
        person person = new person();
        person.sum(1);
        person.sum(1,2);
        person.sum(1,2,3);
    }
}
class person
{
    person()
    {
        System.out.println(666);
    }
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    void sum(int a)
    {
        System.out.println(a);
    }




}