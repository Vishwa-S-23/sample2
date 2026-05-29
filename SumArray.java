import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the N value:");
        int n=in.nextInt();
       System.out.println("Enter the M value:");
        int m=in.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Matrix:");
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
        }
            System.out.println(sum+" ");
        }
    }
}