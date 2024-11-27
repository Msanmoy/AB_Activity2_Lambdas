package Ejercicio8;
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        HashSet<List<Integer>> hashSet = new HashSet<>();

        hashSet.add(Arrays.asList(1, 2, 3));
        hashSet.add(Arrays.asList(4, 5));
        hashSet.add(Arrays.asList(6, 7, 8, 9));
        hashSet.add(Arrays.asList(10, 11, 12));

        Comparator<List<Integer>> lengthComparator = Comparator.comparingInt(List::size);
        Comparator<List<Integer>> sumComparator = Comparator.comparingInt(list -> list.stream().mapToInt(Integer::intValue).sum());

        TreeSet<List<Integer>> treeSetBySum = new TreeSet<>(sumComparator);
        treeSetBySum.addAll(hashSet);

        TreeSet<List<Integer>> treeSetByLength = new TreeSet<>(lengthComparator);
        treeSetByLength.addAll(hashSet);

        System.out.println("TreeSet ordered by sum of integers:");
        treeSetBySum.forEach(list -> System.out.println(list + " -> Sum: " + list.stream().mapToInt(Integer::intValue).sum()));

        System.out.println("\nTreeSet ordered by length of lists:");
        treeSetByLength.forEach(list -> System.out.println(list + " -> Length: " + list.size()));
    }
}
