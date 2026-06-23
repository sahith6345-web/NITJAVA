import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sowmi=new Scanner(System.in);
        int a=sowmi.nextInt();
        int b=sowmi.nextInt();
        char ch=sowmi.next().charAt(0);
        switch(ch){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid value");                
        }
        
    }
    
}
