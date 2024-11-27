package Ejercicio5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Set<Integer>> listOfSets = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines of text (enter an empty line to finish):");

        while(true) {
            String line = sc.nextLine().trim();

            if (line.isEmpty()){
                break;
            }

            Set<Integer> set = Arrays.stream(line.split("\\s+"))
                    .filter(s -> s.matches("-?\\d+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toSet());

            listOfSets.add(set);
        }

        System.out.println("\nContents of the List of Sets:");
        listOfSets.forEach(integers -> {
            System.out.println("Set: ");
            integers.forEach(integer -> System.out.println(integer + " "));
                    System.out.println();
        });

        System.out.println("\nContents of the List of Sets (as Set objects):");
        listOfSets.forEach(set -> System.out.println(set));
    }
}
