import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n/2;i++){
            int temp=nums[i];
            nums[i]=nums[n-1-i];
            nums[n-1-i]=temp;
        }
        for(int num:nums){
            System.out.println(num+" ");

        }
    }
    
}
