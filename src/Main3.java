import java.util.HashSet;

public class Main3 {
    public static void printChars(String str) {
        HashSet<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
                System.out.println(c);
            }
        }
    }
    String str = "Alexx9800";
    printChars(str);
}
