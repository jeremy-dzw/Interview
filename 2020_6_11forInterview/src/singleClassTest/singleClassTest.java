package singleClassTest;

import org.omg.CORBA.PRIVATE_MEMBER;

/**演示单例模式**/
public class singleClassTest
{
    public static void main(String[] args)
    {
        System.out.println(person.getInstance());
        System.out.println(student.getstudent());
    }
}
/**饿汉式创建单例对象，类一加载就会创建对象，线程安全**/
class person
{
    private person(){}//构造器必须私有化，防止外界随意调用
    static person  instance = new person();//创建一个静态的person对象
    public static person getInstance()
    {
        return  instance;
    }
}
/**懒汉式创建单例对象，用到的时候再创建对象，线程不安全**/
class student
{
    private  student(){}
    private static student instance = null;
    public  static student getstudent()
    {
        if (instance == null)
            instance = new student();
            return  instance;
    }
}