public class Main1 {
    public static int sumNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {  //перевірка елементу на парність
                sum += array[i];  //додаємо його до суми
            }
        }
        return sum;
    }
}

