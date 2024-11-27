package Ejercicio4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<List<Integer>> HashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lines of integers (enter an empty line to finish):");

        while (true) {
            String line = sc.nextLine().trim();

            if (line.isEmpty()) {
                break;
            }

            List<Integer> list = Arrays.stream(line.split("\\s+"))
                            .filter(s -> s.matches("-?\\d+"))
                                    .map(Integer::parseInt)
                                            .collect(Collectors.toList());

            HashSet.add(list);
        }

        System.out.println("\nContents of HashSet:");
        HashSet.forEach(hashSetList -> {
            System.out.println("List: ");
            hashSetList.forEach(integer -> System.out.println(integer + " "));
            System.out.println();
        });

        System.out.println("\nContents of the HashSet (as List objects):");
        HashSet.forEach(System.out::println);
    }
}
