public class Strex{
    public static void main(String[] args) {
       String s1="Hello";
       s1=s1.concat("world");
       StringBuilder sb=new StringBuilder("Java");
       sb.append("programming");
       System.out.println(sb.charAt(6));
       System.out.println(sb.reverse());
       String a="Hello";
       String b=new String("Hello");
       System.out.println(a==b);
       System.out.println(a.equals(b));
       for(int i=0;i<a.length();i++)
       {
        System.out.print(a.charAt(i));
       }
       for(char c:a.toCharArray()){
        System.out.print(c+" ");
       }
    }
}