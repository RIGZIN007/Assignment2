package HashMap2;

import java.util.HashMap;

public class Assignment2 {
    public static void main(String[] args) {
        HashMap<Integer,String> a=new HashMap<>();
        a.put(10,"Apple");
        a.put(20,"Banana");
        a.put(30,"Mango");
        a.put(40,"Grape");
        System.out.println("HashMap" +a);
        a.put(60,"kiwi");
        a.put(70,"Guava");
        System.out.println("Updated Hashmap" +a);

    }
}
