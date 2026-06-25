public class While {
    public static void main(String[]args){
        int n=2344;
        int sum=0;
        while(n>0){
            int didgit=n%10;
            sum+=didgit;
            n=n/10;
        }
        System.out.println(sum);
    }
}
