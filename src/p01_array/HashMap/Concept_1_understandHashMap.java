package p01_array.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Concept_1_understandHashMap {
    public static void main(String[] args) {
        // function 1
      //  hashmapBasic();
        
        // functions 2
      //  iteration();

        // function 3
        hashmapUnderstanding();
    }
    // hashmap basic must know
    static void hashmapBasic(){
        HashMap<Integer, Integer> map = new HashMap<>();
        // Syntax: HashMap<KeyType, ValueType> mapName = new HashMap<>();
        // the above is the syntax of hashmap
        /*
        NOTE : KEY MUST BE UNIQE , IF YOU WANT TO PUT() ANOTHER VALUE WITH SAME KEY
        THEN SAME KEY VALUE WOULD BE OVERWRITTEN
        // FOR DIFFERENT KEYS VALUES CAN BE SAME , BUT KEY MUST BE UNIQE
         */
        // Q1. put any value inside the hashmap : TIME COMPLEXITY : O(1)
        map.put(1 , 100);
        map.put(2, 500);
        map.put(6,500);
        // here key must be unique but value can be same
        map.put(7, 300);
        map.put(8,300);
        map.put(9,300); //
        // if you want to update any value so just put the same key value and put updated value
        map.put(9,400); // here if key is same now value is overwrite
        System.out.println( map);

        // Q2. map.get(PUT KEY ) : just put the value of key and find it value : SEARCHING ANY VALUE : TC O(1)
        System.out.println(map.get(9)); //400
        System.out.println(map.get(7)); // 300

        //Q3. map.containsKey(put key), it just checks whether key is present or not
        //return type is boolean : time complexity is : O(1)
        System.out.println(map.containsKey(9)); // true
        System.out.println(map.containsKey(10)); // false

        //Q4. map.containsValue(put value) : it checks whether value is present or not
        // TIME COMPLEXITY IS : O(N)-> CHECKING VLAUE TAKE O N TIMES
        System.out.println(map.containsValue(400)); // true;

        //Q5. map.getOrDefault(key , def) here you can assign key and assign a default value
        // remember it is only use to find the value of any key
        // use1 : if value of key already present then it doesn't return default value , it only return existed key
        // use2 if key is not present then it only return default value that you set like 0 or 1
        map.getOrDefault(7 , 0);//
        // remember getOrDefault() only returns value ,doesn't add key into a hashmap
        System.out.println(map.getOrDefault(7 , 0)); // 300 , bcz in hashmap 7 key exist and it value
        // also existed hence it returns existed vlaue that is 300

        System.out.println(map.getOrDefault(11,0));// o/p is 0 , bcz key doesn't exist


    }
    // understand iteration on hashmap
    static void iteration(){
        HashMap<Integer, String> detail = new HashMap<>();
        detail.put(1,"ram");
        detail.put(2, "shyam");
        detail.put(3, "kavita");
        detail.put(4, "aoashi");
        detail.put(5 , "aman");
        // iterate through detail map
        for(Map.Entry<Integer,String> entry : detail.entrySet()){
            int rollNum  = entry.getKey();
            String studentName = entry.getValue();
            System.out.println(rollNum+" "+"--->"+" "+studentName);
        }


        // iterating only key
        for(Integer i : detail.keySet()){
            System.out.print(i +" ");
        }
        // iterating only values
        System.out.println();
        for(String s : detail.values()){
            System.out.print(s +" ");
        }
    }
    // understand more hashmap
    static void hashmapUnderstanding(){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(1,1);
        hashMap.put(2,3);
        hashMap.put(4,6);
        hashMap.put(5,6);

        System.out.println(hashMap.values());
    }
}
