// 21CE019-Darshan Chavda
// Given an array of int , return true if the sequence of numbers
//  1, 2, 3 appears in the array somewhere.
// array123([1, 1, 2, 3, 1]) → true
// array123([1, 1, 2, 4, 1]) → false
// array123([1, 1, 2, 1, 2, 3]) → true

import java.util.*;
public class pro4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean flag = true;
        int[] arr = new int[100];
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n - 2; j++) 
        {
            if (arr[j] == 1) 
            {
                if (arr[j + 1] == 2) 
                {
                    if (arr[j + 2] == 3) 
                    {
                        flag = false;
                    }
                }
            }
        }
        if (flag == false) 
        {
            System.out.println("Yes, in sequence");
        } else 
        {
            System.out.println("Not in sequence");
        }
    }
}
