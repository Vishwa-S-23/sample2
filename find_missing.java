import java.util.Scanner;
public class find_missing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        int total = (n + 1) * (n + 2) / 2;
        int missing = total - sum;
        System.out.println("Missing Number: " + missing); 
    }
}