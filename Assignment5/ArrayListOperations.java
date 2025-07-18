package Assignment5;

import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {
    	
        // Create and add colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("Original List: " + colors);

        // Iterate through elements
        System.out.println("\nIterating through list:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Insert at first position
        colors.add(0, "Purple");
        System.out.println("\nAfter inserting 'Purple' at first position: " + colors);

        // Retrieve element at index 2
        System.out.println("\nElement at index 2: " + colors.get(2));

        // Update specific element
        colors.set(3, "Orange");
        System.out.println("\nAfter updating index 3 with 'Orange': " + colors);

        // Remove 3rd element (index 2)
        colors.remove(2);
        System.out.println("\nAfter removing 3rd element: " + colors);

        // Search element
        String searchColor = "Blue";
        System.out.println("\nIs '" + searchColor + "' present? " + colors.contains(searchColor));

        // Sort list
        Collections.sort(colors);
        System.out.println("\nSorted List: " + colors);

        // Copy list
        ArrayList<String> copiedList = new ArrayList<>(colors);
        System.out.println("\nCopied List: " + copiedList);

        // Shuffle list
        Collections.shuffle(colors);
        System.out.println("\nShuffled List: " + colors);

        // Reverse list
        Collections.reverse(colors);
        System.out.println("\nReversed List: " + colors);

        // Extract sublist (from index 1 to 3)
        List<String> subList = colors.subList(1, 3);
        System.out.println("\nSublist (index 1 to 2): " + subList);

        // Replace second element (index 1)
        colors.set(1, "Black");
        System.out.println("\nAfter replacing 2nd element with 'Black': " + colors);
    }
}
