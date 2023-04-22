import java.util.Scanner;

/**Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)*/

class Task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите, пожалуйста, число: ");
        int number = scanner.nextInt();
        int triangularNumber = 0;
        for (int i = 0; i <= number; i++) {
            triangularNumber = triangularNumber + i;
            // System.out.println(triangularNumber);
        }
        System.out.println(triangularNumber);
        scanner.close();
    }
}