import java.lang.*;
public class Wrapper{
    public static void main (String[] args){
        String s="456";
        int x=Integer.parseInt(s);
        System.out.println(x);
        int n=100;
        Integer i=Integer.valueOf(n);
        i=200;
        int a =i.intValue();
        int b=i;
        System.out.println(b);
    }
}