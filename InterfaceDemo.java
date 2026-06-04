interface Payment {
    void makePayment(double amount);
}
class PhonePe implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made using PhonePe");
    }
} 
class GPay implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made using GPay");
    }
}
class Paytm implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made using Paytm");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Payment p1 = new PhonePe();
        Payment p2 = new GPay();
        Payment p3 = new Paytm();

        p1.makePayment(500);
        p2.makePayment(1000);
        p3.makePayment(750);
    }
}