public class Sahi {
    public static void main(String[] args) {
        System.out.println("Program started");
        try{
            int result=10/10;
            System.out.println(result);
            int[] arr={1,2,3,4};
            System.out.println(arr[5]);

        }
        catch(ArrayIndexOutOfBoundsExceptionException e){
            System.out.println("Index value greater than array");
        }
        finally{
            System.out.println("ended");
        }
        
    }
    
}

