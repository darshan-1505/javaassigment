import java.util.Scanner;
public class pro9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,j,k;
        boolean flag=true;
        int arr[][] = new int[9][9];
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                arr[i][j] = s.nextInt();
            }
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                for(k=0;k<9;k++)
                {
                    if(i!=j && i!=k && j!=k)
                    {
                        if(arr[i][j]==arr[i][k] || arr[i][j]==arr[k][j])
                        {
                            flag=false;
                        }
                    }
                }
            }
        }
        if(flag==false)
        {
            System.out.println("Its not a sudoku!");
        }
        else
        {
            System.out.println("Its a sudoku!");
        }
    }
}