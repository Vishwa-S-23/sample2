public class sample4 {
    public static void main(String[] args) {
        int signal = yellow;
        switch(signal)
        {
            case red:
              System.out.println("stop");
              break;
            case yellow:
              System.out.println("go");
              break;
            case green:
              System.out.println("go");
              break;
            default:
              System.out.println("no colour existing");
              break;
        }    
    }
}