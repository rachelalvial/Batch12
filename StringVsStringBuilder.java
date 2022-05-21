package class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String s="Asghar is Great";
        System.out.println(s.replace("",""));
        System.out.println(s);

        StringBuilder stringBuilder=new StringBuilder("Asghar Is Great");

        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder);




    }
}
