package Ejercicio2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words separated by spaces: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        Set<String> wordSet = new TreeSet<>(Arrays.asList(words));
        System.out.println("\nWords in TreeSet: ");
        for (String word : wordSet) {
            System.out.println(word);
        }

        sc.close();
    }
}
