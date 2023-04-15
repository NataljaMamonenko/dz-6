import java.util.*;
//те, що робили на лекції
public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"мама", "тато", "їж їжак желе"};
        Set<Character> uniqueChars = solver(words);
        System.out.println(uniqueChars);
    }
    public static Set<Character> solver(String[] words) {
        Set<Character> uniqueChars = new HashSet<>();

        for (String word : words) {
            Map<Character, Integer> charCount = new HashMap<>();
            for (char ch : word.toCharArray()) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }

            boolean isRightWord = true;
            for (int count : charCount.values()) {
                if (count % 2 != 0) {
                    isRightWord = false;
                    break;
                }
            }

            if (isRightWord) {
                for (char ch : word.toCharArray()) {
                    uniqueChars.add(ch);
                }
            }
        }

        return uniqueChars;
    }
}

