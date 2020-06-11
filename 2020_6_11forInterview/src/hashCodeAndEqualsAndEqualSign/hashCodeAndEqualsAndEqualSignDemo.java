package hashCodeAndEqualsAndEqualSign;
/**hashCode()、equals()、== 的综合测试
 *1、字符串的字面值相等，则hashCode()值相等
 *2、String重写了equals()方法，调用equals方法，也是直接比较的字面值
 *3、字符串调用==，比较的是地址
 * **/
public class hashCodeAndEqualsAndEqualSignDemo
{
    public static void main(String[] args)
    {
        /**String类重写了equals()和hashCode()方法**/
        String name1 = "jeremy";
        String name2 = "jeremy";
        String name4 = new String("jeremy");
        String name3 = "lucy";
        System.out.println(name1==name2);//true
        System.out.println(name1==name4);//false
        System.out.println(name1.equals(name4));//true
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());
        System.out.println(name4.hashCode());
    }
}
