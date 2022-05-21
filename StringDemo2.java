package class16;

public class StringDemo2 {
    public static void main(String[] args) {
        String str="12345!@#$%^&asdfghjkASGHKH";
        System.out.println(str.replaceAll("[0-9]","#"));
        System.out.println(str.replaceAll("[a-z]",""));
        System.out.println(str.replaceAll("[A-Z]",""));
        System.out.println(str.replaceAll("[!-/]",""));
    }
}
