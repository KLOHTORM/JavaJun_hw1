import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            nums.add(random.nextInt(10));
        }

        OptionalDouble average = nums.stream()
                .filter(num -> num % 2 == 0)
                .mapToDouble(num -> num)
                .average();

        System.out.println(nums);

        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        } else {
            System.out.println("Нет нечетных чисел, неывозможно выполнить операцию");
        }
    }
}
//Напишите программу, которая использует Stream API для
//обработки списка чисел. Программа должна вывести на
// экран среднее значение всех четных чисел в списке.