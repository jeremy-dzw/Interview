package BubbleSortTest;

public class BubbleSortDemo
{
    public static void main(String[] args)
    {
        int[] a = new int[]{9,8,7,6,5,4,3,2,1};
        bubbleSort.bubblesortxxx(a);
        for (int j = 0;j < a.length;j++)
        {
            System.out.print(a[j]);
            System.out.print("  ");
        }
    }
}
class  bubbleSort
{
    /**传递引用数据类型（数组）,将数据从小到大进行排序**/
    public static  void bubblesortxxx(int[] a)
    {
        int temp;
        for(int i = 0;i < a.length;i++)
            for(int j = 0;j < a.length-1;j++)/**注意此处j的取值是比数组的长度小1**/
            {
                if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
    }
}