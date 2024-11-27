package Ejercicio2;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words separated by space: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        Set<String> wordSet = new HashSet<>(Arrays.asList(words));

        System.out.println("\nWords in HashSet: ");
        for (String word : wordSet) {
            System.out.println(word);
        }

        sc.close();
    }
}
