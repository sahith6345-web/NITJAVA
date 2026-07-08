import java.util.HashMap;
import java.util.Map;

public class Mapex {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"Sowmi");
        map.put(102,"Sahith");
        map.put(103,"ath");
        map.put(104,"Sh");
        map.put(105,"S");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get(102));

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            if(entry.getKey() %2 == 0){
                System.out.println(entry.getKey() +" -> " + entry.getValue());
            }
        }

        //Frequency of ann Array
        int[] arr = {1,2,1,2,3,8,4};
        Map<Integer,Integer> map1 = new HashMap<>();
        for(int i : arr){
            if(map1.containsKey(i)){
                map1.put(i, map1.get(i)+1);
            }
            else{
                map1.put(i, 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map1.entrySet()){
            System.out.println(entry.getKey() +" -> " + entry.getValue());
        }
        

        //Frequency of the String
        String[] str = {"frequency"};
        Map<Character,Integer> map2 = new HashMap<>();
        for(String wrd : str){
            for(char s: wrd.toCharArray()){
                Character charObj = Character.valueOf(s);
                if(map2.containsKey(charObj)){
                    map2.put(charObj, Integer.valueOf(map2.get(charObj).intValue() + 1));
                else{
                    map2.put(charObj, Integer.valueOf(1));
                }
            }
        }

        for(Map.Entry<Character,Integer> entry : map2.entrySet()){
            System.out.println(entry.getKey() +" -> " + entry.getValue());
        }

    }
    
}
