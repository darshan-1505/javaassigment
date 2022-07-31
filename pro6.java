// 21CE019-Darshan Chavda
// Given an array of strings, return a new array without the strings 
// that are equal to the target string. One approach is to count the 
// occurrences of the target string, make a new array of the correct 
// length, and then copy over the correct strings.
// wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
// wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
// wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
import java.util.Scanner;
public class pro6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = {"a","b","c","a"};
        String[] arr2 = {"a","b","c","a"};
        String[] arr3 = {"a","b","c","a"};
        
        for(int i=0;i<4;i++)
        {
            if(arr1[i]!="a")
            {
                System.out.print(arr1[i]);
            }
        }
        System.out.println();
        for(int j=0;j<4;j++)
        {
            if(arr2[j]!="b")
            {
                System.out.print(arr2[j]);
            }
        }
        System.out.println();
        for(int k=0;k<4;k++)
        {
            if(arr3[k]!="c")
            {
                System.out.print(arr3[k]);
            }
        }
    }   
}