package charactorReverse;

public class charactorReverse
{
    public static void main(String[] args)
    {   charactorReverse.reverse("123456");


    }
    public static String reverse(String originStr)
    {
        if(originStr == null || originStr.length() <= 1)
            return originStr;
        System.out.println(originStr);
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
}
