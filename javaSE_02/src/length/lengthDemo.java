package length;
/**
 * (1)数组中有length属性，可以得到数组的长度(与其中的数据多少无关)
 * (2)字符串中有length()方法，可以得到字符串的长度(空格也算)
 * **/
public class lengthDemo
{
    public static void main(String[] args)
    {
        int[] a = new int[10];//定义一个长度为10的整型数组
        System.out.println(a.length);
        String s = "my name is jeremy";
        System.out.println(s.length());
    }
}
