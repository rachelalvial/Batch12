package class16;

public class InClassTask2 {
    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters,
        numbers and special characters. Find out how many Alphanumeric characters
        are there in the String.
         */

        String s="12345!@#$%asdfgASDFG";

        System.out.println(s.replaceAll("[^A-Za-z0-9]","").length());
    }
}
