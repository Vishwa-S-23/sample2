import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Number :");
        int a=scan.nextInt();
        if(a%2==0)
          System.out.println("Even :" +a);
        else
          System.out.println("Odd :" +a);  
    }
}