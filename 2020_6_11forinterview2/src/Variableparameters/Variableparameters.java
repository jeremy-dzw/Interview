package Variableparameters;
/**可变参数
 * (1)可变参数只能在方法参数的最后的位置
 * (2)一个方法只能有一个可变参数
 * (3)可变参数的语法格式：数据类型 ... 变量名
 * (4)把可变参数当作数组来理解即可
 * **/
public class Variableparameters
{
    public static void main(String[] args)
    {
        int a = 2;
        int b = 3;
       double sum = variableparametersxxx.sum(a,b,3.0,5.0,7.0);
        System.out.println(sum);
    }
}
class variableparametersxxx
{
    static double sum(int a,int b ,double...parameters)
    {
        double sum = 0.0;
        for( int i = 0;i<parameters.length;i++)
        {
            sum = sum + parameters[i];
        }
        return a+b+sum;
    }
}