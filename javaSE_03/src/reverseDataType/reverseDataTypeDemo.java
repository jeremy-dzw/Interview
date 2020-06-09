package reverseDataType;

import static java.lang.String.valueOf;

/**
 * (1)如何将基本数据转化为字符串：调用String中的valueOf()方法
 * (2)如何将字符串转化为基本数据类型
 * **/
public class reverseDataTypeDemo
{
    public static void main(String[] args)
    {
        double d = 3.14;
        String s = valueOf(d);
        System.out.println(s+"jeremy");
    }

}
