public class overload {
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }
    public int addTwoNumbers(int a, int b, int c) {
        return a + b + c;
    }
    static void change(int x) {
        x = 500;
        System.out.println("Inside method: " + x);
    }
    public static void main(String[] args) {
        int y = 5;
        change(y);
        System.out.println("Outside Method: " + y);
        overload a = new overload();
        System.out.println(a.addTwoNumbers(11, 22, 33));
    }
}