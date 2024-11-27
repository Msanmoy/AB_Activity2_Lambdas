package Ejercicio7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<List<Integer>> hashSet = new HashSet<>();

        hashSet.add(Arrays.asList(1,2,3));
        hashSet.add(Arrays.asList(4,5));
        hashSet.add(Arrays.asList(6,7,8,9));
        hashSet.add(Arrays.asList(10,11,12));

        Comparator<List<Integer>> lengthComparator = Comparator.comparingInt(List::size);

        Comparator<List<Integer>> sumComparator = Comparator.comparingInt(list -> list.stream().mapToInt(Integer::intValue).sum());

        List<Integer> longestList = Collections.max(hashSet, lengthComparator);
        System.out.println("Longest List (by length):" + longestList);

        List<Integer> largestSumList = Collections.max(hashSet, sumComparator);
        System.out.println("List with largest sum:" + largestSumList);

        List<Integer> longestListStream = hashSet.stream()
                .max(Comparator.comparing(List::size))
                .orElse(new ArrayList<>());
        System.out.println("Longest List (by Stream API):" + longestListStream);

        List<Integer> largestSumListStream = hashSet.stream()
                .max(Comparator.comparing(list -> list.stream().mapToInt(Integer::intValue).sum()))
                .orElse(new ArrayList<>());
        System.out.println("List with largest sum (by Stream API): " + largestSumListStream);
    }
}
