package brothersOfString;
/**String 、StringBuffer、StringBuilder三者的区别
 * (1)String是不可变字符序列，而StringBuffer和StringBuilder是可变字符序列
 * (2)String是重写了Object类中的hashCode()和equals()方法，而StringBuffer和StringBuilder则没有
 * (3)StringBuffer是线程安全的，效率低；StringBuilder是线程不安全的，效率高
 * 注意：对象值相同，则hashCode值一定相同；反之则不成立
 * **/
public class brotherOfStringDemo
{
    public static void main(String[] args)
    {   //StringBuffer没有重写equals()方法，所以比较的是对象的地址
        StringBuffer stringBuffer1 = new StringBuffer("abc");
        StringBuffer stringBuffer2 = new StringBuffer("abc");
        System.out.println(stringBuffer1.equals(stringBuffer2));
        String s1 = new String("xxx");
        String s2 = new String("xxx");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

    }
}
