import java.util.Scanner;

public class SyracuseSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим начальное число
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        // Вычисляем количество шагов
        int steps = calculateSyracuseSteps(n);

        // Выводим результат
        System.out.println("Количество шагов: " + steps);
    }

    // Метод для вычисления количества шагов сиракузской последовательности
    private static int calculateSyracuseSteps(int n) {
        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                // Если число четное, делим его на 2
                n /= 2;
            } else {
                // Если число нечетное, умножаем его на 3 и прибавляем 1
                n = 3 * n + 1;
            }
            steps++;
        }
        return steps;
    }
}