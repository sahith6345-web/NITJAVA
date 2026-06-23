import java.util.Scanner;
public class Character {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char sahith=sc.next().charAt(0);
        if(sahith>= 65 && sahith<=90) {
            System.out.println("upper case");  
        }
        else if(sahith >=97 &&sahith<= 122){
            System.out.println("lower case");
        }
        else if(sahith>= 48 && sahith<=57){
            System.out.println("digits");
        }
        else{
            System.out.println("Special character");
        }

    }
    
}
