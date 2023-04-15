import java.util.HashSet;
import java.util.Set;

public class Main3 {
    public static void printUniqueCharacters(String str) {
        Set<Character> uniqueChars = new HashSet<>(); // Створюємо множину для зберігання унікальних символів
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!uniqueChars.contains(ch)) { // Якщо символ ще не зберігався, то додаємо його до множини та виводимо на екран
                uniqueChars.add(ch);
                System.out.println(ch);
            }
        }
    }
}

