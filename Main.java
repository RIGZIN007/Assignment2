package HashMap2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> a=new HashMap<>();
             if (a.isEmpty()) {
                    System.out.println("HashMap is empty.");
                } else {
                    System.out.println("HashMap is not empty.");
                }
                a.put( 10,"apple");
                a.put(20,"Banana");
                if (a.isEmpty()) {
                    System.out.println("HashMap is empty.");
                } else {
                    System.out.println("HashMap is not empty.");
                }
            }
        }


