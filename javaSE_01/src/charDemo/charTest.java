package charDemo;
import static java.lang.Integer.compare;
/**(1)char类型是可以支持中文的
 * (2)java中的数据类型转换有隐式转换和强制转换----->隐式转换是从小到大byte、short、char转化为int
 *                                                  强制转化是从大到小int --->byte
 *(3)java中的小数，默认都是double类型的；不能直接将一个小数赋值给float类型的变量
 *(4)String不是基本数据类型
 *(5)Math类中的三大取整方法：Math.ceil  /   Math.floor    /    Math.round(四舍五入的时候不要看正负数，小数部分>5才进；小于等于5都舍弃)
 *(6)== 与 equals()的用法和区别：java中的数据类型包括基本数据类型和引用数据类型，当判断基本数据类型时，只能用==来判断他们的值是否相等；若是判断引用数据类型时，在一些类没有
 * 重写equals()的情况下，equals()与==的比较结果是一样的，都是判断对象在内存中的地址；但是String这个类就重写了Object类中的equals()方法。所以，当用字符串调用equals()方法时，
 * 判断的是对象的内容，而不是地址，与==就有所差别了。
 *(7)java 中的引用变量与对象的区别和联系：例如int a = 1;   final person p = new person();
 *                                  a---变量   1---值  ；  p---引用变量      new  person()---对象
 * **/
public class charTest
{
    public static void main(String[] args)
    {
//        char c = '伟';//该变量占用两个字节
//        short s1 = 1;
//        s1 = (short) (s1 +1);
//        System.out.println(c);
////        System.out.println(0x31 & 0x0f);
//        System.out.println(Math.round(-11.6));
//        System.out.println(Math.round(-11.1));
//        System.out.println(compare(1,3));
//        person person = new person();
//        person.dowork();
        String s1 = "abc",s2 = "abc";//在内存中只有一份
        String s3,s4;
        s3 = new String("abc");
        s4 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        String d = new String("hello");
        String f = new String("hello");
    }
}
class person
{
    public void dowork()
    {
        System.out.println("i  can  do  what  i  want...");
    }
}