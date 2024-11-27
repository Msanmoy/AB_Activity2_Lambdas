package Ejercicio6;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static List<Integer> getLongestListFromSet(HashSet<Set<Integer>> HashSet) {
        return HashSet.stream()
                .reduce((set1,set2) -> set1.size() > set2.size() ? set1 : set2)
                .map(ArrayList::new)
                .orElse(new ArrayList<>());
    }

    public static void main(String[] args) {
        HashSet<Set<Integer>> HashSet = new HashSet<>();

        HashSet.add(new HashSet<>(Arrays.asList(1, 2, 3)));
        HashSet.add(new HashSet<>(Arrays.asList(4, 5)));
        HashSet.add(new HashSet<>(Arrays.asList(6, 7, 8, 9)));
        HashSet.add(new HashSet<>(Arrays.asList(10, 11, 12)));

        List<Integer> longestList = getLongestListFromSet(HashSet);

        System.out.println("Longest List: " + longestList);
    }
}
