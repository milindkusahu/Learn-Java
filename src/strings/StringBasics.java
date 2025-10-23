package strings;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Milind";
        String sameName = "Milind";

        String newName = new String("Milind");

        System.out.println(name == sameName); // true (both refer to the same string literal in the String pool)
        System.out.println(name == newName); // false (== compares references; new String() creates a new object in heap)

        // How to check if values are equal?
        System.out.println(name.equals(newName)); // true

        // Ignoring Case
        System.out.println(name.equalsIgnoreCase(newName));
    }
}
