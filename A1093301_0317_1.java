import java.util.Scanner;
public class A1093301_0317_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入n的值：");
        int n = sc.nextInt();
        System.out.print("請輸入m的值：");
        int m = sc.nextInt();
        sc.close();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                a[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] row : a)
        {
            for (int element : row)
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
