import java.util.Scanner;

/** Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, 
 * например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет*/

public class Task4 {
    public static void main(String[] args) {
        // Ввод уравнения.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите уравнение: ");        
        String equation = scanner.nextLine();

        // Замена в уравнении символов "+" и "=" на пробел.
        equation = equation.replace('+', ' ')
                           .replace('=', ' ');

        // Преобразовние уравнени в массив строк, где первые две строки - это слагаемые, а третья - их сумма.
        String [] equationParts = equation.split(" ");

        // Вывод массива строк
        for (String part: equationParts) System.out.println(part);
        // System.out.println(parts.length);
        findDigits(equationParts);
        scanner.close();
    }

    // Метод, который преобразует строку в число. В качестве аргументов метод принимает строку и цифру,
    // на которую нужно заменить символ в строке, если его невозможно перевести в int. Метод возвращает число.
    public static int getNumberFromString(String str, int newNum) {
        int number = 0;
        // int digit = 0;
        char[] charArray = str.toCharArray(); /*Переводим полученную строку в массив символов, чтобы получить итеррируемый объект*/
        for (char simbol: charArray) {
            if (Character.isDigit(simbol)) { /*Проверяем можно ли символ в строке перевести с int*/
                number = number*10 + Integer.parseInt(Character.toString(simbol)); /*Переводим символ в строку, а затем парсим в число*/
            }
            else {/*Если символ нельзя перевести в int, то на место символа подставляется newNum из аргумента метода*/ 
                number = number*10 +newNum;
            }
        }
        return number;
    }  
    
    /*Метод нахождения неизвестных цифр в уравнении.
    
    
    В качестве аргумента метод принимает массив строк, сформированный из введенного уравнения.
    Проходим по каждой строке в массиве строк и пытаемся преобразовать ее в число методом getNumberFromString. 
    В каждой строке симолы, которые  не получается преобразовать в число, подставляем числа от 0 до 9 и 
    проверяем выполнение равенства. Выводится первое найденное решение или утверждение, что решения нет.*/ 


    public static void findDigits (String[] equation) {
        int summandFirst = getNumberFromString(equation[0], 0);
        int summandSecond = getNumberFromString(equation[1], 0);
        int summa = getNumberFromString(equation[2], 0);
        
        // boolean flag0 = true; 
        // while (flag0) {
            outer:
            for (int i = 0; i < 10; i++) {
                summandFirst = getNumberFromString(equation[0], i);
                
                // boolean flag1 = true;
                // while (flag1) {
                    for (int j = 0; j < 10; j++) {
                        summandSecond = getNumberFromString(equation[1], j);
                        
                        // boolean flag2 = true;
                        // while (flag2) {
                            for (int k = 0; k < 10; k++) {
                                summa = getNumberFromString(equation[2], k);
                                if (summandFirst + summandSecond == summa) {
                                    System.out.printf("%d + %d = %d \n", summandFirst, summandSecond, summa);
                                    // flag2 = false;
                                    break outer;
                                }
                            }                    
                        }

                        if (summandFirst + summandSecond == summa) {
                            System.out.printf("%d + %d = %d \n", summandFirst, summandSecond, summa);
                            // flag1 = false;
                            break outer;
                    }
                    if (summandFirst + summandSecond == summa) {
                        System.out.printf("%d + %d = %d \n", summandFirst, summandSecond, summa);
                        // flag0 = false;
                         break outer;
                    }                 
            
            }
            if (summandFirst + summandSecond != summa) System.out.println("Решения нет!");
    }
}




    

