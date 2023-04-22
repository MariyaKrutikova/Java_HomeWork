import java.util.Scanner;

/*Реализовать простой калькулятор*/

public class Task3 {
    public static void main(String[] args) throws java.io.IOException{
        System.out.print("Какую опирацию необходимо выполнить над указанными числами (+, -, /, *): \n");
        char operation = (char) System.in.read();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите первое число:");
        int a = scanner.nextInt();
                   
        System.out.print("Введите второе число:");
        int b = scanner.nextInt();
                 
           
        scanner.close();

        if (operation == '+') {
            System.out.printf("Сумма чисел %d + %d = %d \n", a, b, a + b);
        }
        else if (operation == '-') {
            System.out.printf("Разность чисел %d - %d = %d \n", a, b, a - b);
        }
        else if (operation == '/') {
            if (b == 0) {
                System.out.println("Ошибка! Попытка разделить на ноль.");
            }
            else {
                System.out.printf("Отношение чисел %d / %d = %d \n", a, b, a/b);
            }
        }
        else if (operation == '*') {
            System.out.printf("Произведение чисел %d * %d = %d \n", a, b, a*b);
        }
        else {
            System.out.println("Указана некорректная операция. Повторите ввод!");
        }

    }
}

