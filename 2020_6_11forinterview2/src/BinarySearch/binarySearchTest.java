package BinarySearch;

/**二分法查找的前提必须要保证数组是有序的
 * **/
public class binarySearchTest
{
    public static void main(String[] args)
    {
        int[] a  = new int[]{33,111,7,5,9,-6,99,100};
        selectsort.selectionSortMeth(a);
        for (int j = 0;j < a.length;j++)
        {
            System.out.print(a[j]);
            System.out.print("  ");
        }
        System.out.println();
        binarySearchMethod.binarySearch(111,a);
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
class binarySearchMethod
{
    public static void binarySearch(int key,int[] a )/**传递的参数为数组和要查找的值**/
    {
        int indexMedium;
        int indexMin = 0;
        int indexMax = a.length - 1;
        while(indexMin <= indexMax)
        {
            indexMedium = (indexMin + indexMax)/2;
            if(key < a[indexMedium])
            {
                indexMax = indexMedium -1;/**注意此处的（减1）操作**/
            }
            if(key > a[indexMedium])
            {
                indexMin = indexMedium +1;/**注意此处的（加1）操作**/
            }
            if(key == a[indexMedium])
            {
                System.out.println("the index of key  in  array  is "+indexMedium);
                break;
            }
        }
    }
}