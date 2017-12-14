import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
      int a=scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Вы ввели четное  число");
        } else {
            System.out.println("Вы ввели нечетное чило");
        }

    }
}

