package HashMap2;

import java.util.HashMap;

public class Q3 {
    public static void main(String[] args) {
        HashMap<String,Integer> a=new HashMap<>();

        a.put("Virat Kohli", 100);
        a.put("Rohit Sharma", 75);
        a.put("Steve Smith", 90);
       a.put("Kane Williamson", 80);

        String batsmanName = "Virat Kohli";
        if (a.containsKey(batsmanName)) {
            int score = a.get(batsmanName);
            System.out.println(batsmanName + "'s score: " + score);
        } else {
            System.out.println("Batsman " + batsmanName + " not found in the records.");
        }
    }
}

