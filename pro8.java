// 21CE019-Darshan Chavda
// The problem is to write a program that will grade multiple-choice tests. 
// Assume there are eight students and ten questions, and the answers are 
// stored in a two-dimensional array. Each row records a student’s answers
//  to the questions, as shown in the following array.Students’ Answers to 
//  the Questions:
//                      0  1  2  3  4  5  6  7  8  9
//              Student 0  A  B  A  C  C  D  E  E  A  D
//              Student 1  D  B  A  B  C  A  E  E  A  D
//              Student 2  E  D  D  A  C  B  E  E  A  D
//              Student 3  C  B  A  E  D  C  E  E  A  D
//              Student 4  A  B  D  C  C  D  E  E  A  D
//              Student 5  B  B  E  C  C  D  E  E  A  D
//              Student 6  B  B  A  C  C  D  E  E  A  D
//              Student 7  E  B  E  C  C  D  E  E  A  D
// The key is stored in a one-dimensional array:
// Key to the Questions:
// 0 1 2 3 4 5 6 7 8 9
// Key D B D C C D A E A D
// Your program grades the test and displays the result. It compares 
// each student’s answers with the key, counts the number of correct 
// answers, and displays it.
import java.util.*;
public class pro8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] ans={"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        String[][] str = new String[8][10];
        System.out.println("Fill in the eigth student's answer to 10 question");
        for(int i=0; i<str.length; i++)
        {
            int count=0;
            for(int j=0; j<str[i].length; j++)
            {
                str[i][j] = sc.next();
                if(str[i][j].equalsIgnoreCase(ans[j]))
                count++;
            }
            System.out.println("Student's "+(i)+" correct answer are "+count);
        }
    }
}
