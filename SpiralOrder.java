public class Main{
public static int a[][] = new int[][]{ {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
              };
 
public static int n = 5, m = 5;
public static void main(String[] args)
{
 
    int rowStrt = 0, rowEnd = n-1;
    int colStrt = 0, colEnd = m-1;
 System.out.println(String.format("\nrowStrt = %d, rowEnd = %d\n", rowStrt, rowEnd));
    while (rowStrt <= rowEnd) {
        if (rowStrt == rowEnd) {      /// Only 1 row
            for (int j=colStrt; j<=colEnd; j++)
                System.out.println(String.format("%d ", a[rowStrt][j]));
            break;
        }
 
        if (colStrt == colEnd) {     /// Only 1 col
            for (int i=rowStrt; i<=rowEnd; i++)
                System.out.println(String.format("%d ", a[i][colStrt]));
            break;
        }
 
        for (int j=colStrt; j<colEnd; j++)
            System.out.println(String.format("%d ", a[rowStrt][j]));
        for (int i=rowStrt; icolStrt;j--)
            System.out.println(String.format("%d ", a[rowEnd][j]));
        for (int i=rowEnd; i>rowStrt; i--)
            System.out.println(String.format("%d ", a[i][colStrt]));
 
        colStrt++; colEnd--;
        rowStrt++; rowEnd--;
        
    }
 
}
}