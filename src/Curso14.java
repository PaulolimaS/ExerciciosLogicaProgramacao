import java.util.Locale;

public class Curso14 {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2,9);
        String s06 = original.replace('a','x');
        String s07 = original.replace("abc","xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("original:  -" + original + "-");
        System.out.println("ToloweCase: -" + s01 + "-");
        System.out.println("ToUpperCase: -" + s02 + "-");
        System.out.println("Trim:  -" + s03 + "-");
        System.out.println("substring (2): -" + s04 + "-");
        System.out.println("substring (2,9): -"+ s05 + "-");
        System.out.println("replace ('a' for 'x'): -" + s06 + "-");
        System.out.println("replace ('abc' for 'xy'): - " + s07 + "-");
        System.out.println("index of 'bc " + i);
        System.out.println("last index of 'bc" + j);


    }
}
