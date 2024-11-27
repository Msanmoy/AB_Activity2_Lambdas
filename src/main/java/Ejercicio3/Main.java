package Ejercicio3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<List<Integer>> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lines of integers (enter an empty line to finish):");

        while (true) {
            String line = sc.nextLine().trim();

            if (line.isEmpty()) {
                break;
            }

            String[] tokens = line.split("\\s+");
            List<Integer> list = new ArrayList<>();
            for (String token : tokens) {
                list.add(Integer.parseInt(token));
            }

            hashSet.add(list);
        }

        System.out.println("\nContents of HashSet:");
        hashSet.forEach(hashSetList -> {
            System.out.println("List: ");
            hashSetList.forEach(integer -> System.out.println(integer + " "));
            System.out.println();
        });

        System.out.println("\nContents of the HashSet (as List objects):");
        hashSet.forEach(System.out::println);
    }
}
