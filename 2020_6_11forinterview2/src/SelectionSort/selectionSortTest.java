package SelectionSort;

public class selectionSortTest
{
    public static void main(String[] args)
    {
        int[] a  = new int[]{33,111,7,5,9,-6,99,100};
        selectsort.selectionSortMeth(a);
        for(int i = 0;i < a.length;i++)
        {
            System.out.print(a[i]);
            System.out.print("  ");
        }
    }
}
class selectsort
{
   public static void selectionSortMeth(int[] a)/**传入的参数是引用数据类型（数组）**/
   {
       int temp;
       for(int i = 0;i < a.length;i++)
           for(int j = 0;j < a.length;j++)
           {
               if(a[i] < a[j])
               {
                   temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
               }
           }
   }
}