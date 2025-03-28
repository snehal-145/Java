import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];

        // Input 10 names
        System.out.println("Enter 10 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Sorting names in alphabetical order
        Arrays.sort(names);

        // Display sorted names
        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
