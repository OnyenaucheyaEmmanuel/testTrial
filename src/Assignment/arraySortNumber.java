package Assignment;

import java.util.Arrays;

public class arraySortNumber
{
    public static void main(String[] args)
    {
        int count;

        int array[] = {12, 45, 1, 0, 4, 56, 23, 89,56, 27};
//        System.out.print("Array elements before sorting: \n");
//        for(count = 0; count < array.length; count++)
//            System.out.println(array[count]);

        sortArray(array, array.length);
        System.out.print("Array elements after sorting: \n");

        for(count = 0; count <array.length; count++)
        {
//            System.out.println(array[count]);
        }
        System.out.println(Arrays.toString(array));
    }

    private static void sortArray(int array[], int n)
    {
        for (int i = 1; i < n; i++)
        {
            int j = i;
            int a = array[i];
            while ((j > 0) && (array[j-1] > a))
            {
                array[j] = array[j-1];
                j--;
            }
            array[j] = a;
        }
    }
}