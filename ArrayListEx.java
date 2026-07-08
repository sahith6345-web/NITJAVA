import java.util.*;
public class ArrayListEx {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(50);
        tree.add(60);
        tree.add(70);
        System.out.println("Elements in theTree set:");
        for(int i : tree){
            System.out.println(i);
        }
        // Hashset hs=new Hashset();
        // hs.add(10);
        // hs.add(20);
        // hs.add(30);
        // hs.add(40);
        // for(int i : hs){
        //     System.err.println(i);
        // }
        // List <Integer> list=new ArrayList<>();
        // System.err.println(list.size());
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.set(1,15);
        // list.remove(2);
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // for(int i:list){
        //     System.out.print(i+" ");
        // }
        // System.out.println(list.size());

    }
}
