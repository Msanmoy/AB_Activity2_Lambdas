package Ejercicio9;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashSet<List<Integer>> hashSet = new HashSet<>();

        hashSet.add(Arrays.asList(1, 2, 3));
        hashSet.add(Arrays.asList(4, 5));
        hashSet.add(Arrays.asList(6, 7, 8, 9));
        hashSet.add(Arrays.asList(10, 11, 12));

        Comparator<List<Integer>> lengthWithSumComparator = Comparator.comparingInt((List<Integer> list) -> list.size()).thenComparingInt(list -> list.stream().mapToInt(Integer::intValue).sum());

        Comparator<List<Integer>> sumWithLengthComparator = Comparator.comparingInt((List<Integer> list) -> list.stream().mapToInt(Integer::intValue).sum()).thenComparingInt(List::size);

        TreeSet<List<Integer>> treeSetByLengthWithSum = new TreeSet<>(lengthWithSumComparator);
        treeSetByLengthWithSum.addAll(hashSet);

        TreeSet<List<Integer>> treeSetBySumWithLength = new TreeSet<>(sumWithLengthComparator);
        treeSetBySumWithLength.addAll(hashSet);

        System.out.println("TreeSet ordered by length (with tie-breaking by sum):");
        treeSetByLengthWithSum.forEach(list -> System.out.println(list + " -> Length: " + list.size() + " -> Sum: " + list.stream().mapToInt(Integer::intValue).sum()));

        System.out.println("\nTreeSet ordered by sum (with tie-breaking by length):");
        treeSetBySumWithLength.forEach(list -> System.out.println(list + " -> Sum: " + list.stream().mapToInt(Integer::intValue).sum() + " -> Length: " + list.size()));
    }
}