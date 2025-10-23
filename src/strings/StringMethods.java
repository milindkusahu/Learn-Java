package strings;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String name = " Milind ";

//        System.out.println(name.toUpperCase());

//        System.out.println(name.trim());

//        System.out.println(name.startsWith(" Mil")); // true

//        System.out.println(name.endsWith("d ")); // true

//        System.out.println(name.equals("milind")); // false (case sensitive)

//        .charAt()
//        System.out.println(name.charAt(3)); // l

//        .valueOf()
//        int age = 123;
//        String stringAge = String.valueOf(age);
//
//        System.out.println(age+2); // 125
//        System.out.println(stringAge+2); // 1232

        // .replace()
//        String sentence = "I love Java, Java is a good language";
//
//        String newSentence = sentence.replace("Java", "CPP");
//
//        System.out.println(sentence);
//        System.out.println(newSentence);

        // .contains()
//        System.out.println(sentence.contains("Java")); // true

        // .substring()
//        System.out.println(sentence.substring(2, 5)); // first parameter is inclusive and second is exclusive
//        System.out.println(sentence.substring(2));

        // .split()
//        String words[] = sentence.split(" ");
//        for (String word : words) {
//            System.out.println(word);
//        }

        // .toCharArray()
//        String color = "Brown";
//        char letters[] = color.toCharArray();
//
//        for (char letter : letters) {
//            System.out.println(letter);
//        }

        // isEmpty()
        String animal = "";
        System.out.println(animal.isEmpty()); // true

        // isBlank()
        String tea = "  ";
        System.out.println(tea.isBlank()); // true
    }
}
