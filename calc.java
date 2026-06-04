class calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }

}
    public class calc{
    public static void main(String[] args) {
        calculator cals=new calculator();
        System.out.println(cals.add(11,22,33));
        

    }
}