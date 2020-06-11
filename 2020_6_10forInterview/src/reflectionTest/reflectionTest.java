package reflectionTest;

public class reflectionTest
{
    public static void main(String[] args)
    {   person p1 = new person();
        person p2 = new person();
        Class class1 = p1.getClass();
        System.out.println(p1.getClass().getName());
        Class class2 = p2.getClass();
        System.out.println(class1==class2);
    }
}
class  person
{

}