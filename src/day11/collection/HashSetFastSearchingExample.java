package day11.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

public class HashSetFastSearchingExample {

    public static void main(String[] args) {

        ArrayList<String> hugeListOfString = new ArrayList<>();
        HashSet<String> hugeSetOfString = new HashSet<>();
        String uuid = "";
        
        for (int i = 0; i < 1_000_000; i++) {
            uuid = UUID.randomUUID().toString();
            hugeListOfString.add(uuid);
            hugeSetOfString.add(uuid);
        }
        
        long startSearch = System.currentTimeMillis();
        hugeListOfString.contains(uuid);
        long endSearch = System.currentTimeMillis();
        long duration = endSearch - startSearch;
        System.out.println("List Search Duration : " + duration + "ms");
        
        startSearch = System.currentTimeMillis();
        hugeSetOfString.contains(uuid);
        endSearch = System.currentTimeMillis();
        duration = endSearch - startSearch;
        System.out.println("List Search Duration : " + duration + "ms");
        
        HashSet<String> convertListToSet = new HashSet<>(hugeListOfString);
    }
}