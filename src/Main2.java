public class Main1 {
        public static int sumNumbers(int[] array) {
            int sum = 0;
//метод перебирає елементи масиву та додає їх в змінну sum, якщо вони є парними
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) { //перевірка на парність
                    sum += array[i];
                }
            }
            return sum;
        }

        int[] numbers = {8, 2, 3, 4, 5, 6, 7}; //передаємо масив цілих чисел для виклику методу
        int sumEvenNumbers = sumNumbers(numbers);
                System.out.println(sumEvenNumbers); // 20
}
