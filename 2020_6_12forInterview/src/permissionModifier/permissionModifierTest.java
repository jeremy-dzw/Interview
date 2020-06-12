package permissionModifier;

import com.sun.org.apache.xerces.internal.dom.AttrNSImpl;

/**
 * 主要演示  protected  和  缺省的权限修饰符
 * protected:  在本包中可以使用；在不同类之间可以使用；在有继承关系的子类中可以使用
 * 缺省：在本包中可以使用；在不同类之间可以使用
 * **/
public class permissionModifierTest
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.eat();
        Animal animal = new Animal();
        animal.eat();
    }
}
class  Animal
{
    protected  void  eat()
    {
        System.out.println("动物要吃肉...");
    }
}
class Dog extends Animal
{

}