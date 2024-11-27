package Ejercicio1;
import java.util.*;

public class ClosestComparatorExample {
    public static void main(String[] args) {
        final int reference = 25;

        Comparator<Integer> closestComparator = (a,b) -> {
          int diffA = Math.abs(a - reference);
          int diffB = Math.abs(b - reference);
          return Integer.compare(diffA, diffB);
        };

        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(22,30,28,40,18));
        System.out.println("Before sorting ArrayList: " + numbersList);
        numbersList.sort(closestComparator);
        System.out.println("After sorting ArrayList: " + numbersList);

        TreeSet<Integer> numberSet = new TreeSet<>(closestComparator);
        numberSet.addAll(Arrays.asList(22,30,28,40,18));
        System.out.println("TreeSet ordered by closeness: " + numberSet);

        List<Integer> sortedStreamList = Arrays.asList(22,30,28,40,18).stream()
                .sorted(closestComparator)
                .toList();
        System.out.println("Stream sorted by closeness: " + sortedStreamList);
    }
}
