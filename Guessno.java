import java.util.Scanner;
public class Guessno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int secret = 33;
        int guess;
        do {
            System.out.print("Enter your guess: ");
            guess = in.nextInt();

            if (guess < secret) {
                System.out.println("Guess is smaller");
            }
            else if (guess > secret) {
                System.out.println("Guess is larger");
            }

        } while (guess != secret);
        System.out.println("Guess is correct");
        in.close();
    }
}