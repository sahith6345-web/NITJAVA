import java.util.Scanner;
public class Simple{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int P=sc.nextInt();
        int R=sc.nextInt();
        int T=sc.nextInt();
        int SI=P*R*T/100;
        int A=P*SI;
        System.out.println(SI);
        System.out.println(A);

    }
    
}
