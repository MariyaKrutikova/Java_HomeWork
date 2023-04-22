/** Вывести все простые числа от 1 до 1000*/

public class Task2 {
    public static void main(String[] args) {
        for (int number = 2; number < 20; number++) {

            Boolean flag = true;
            int j = 2;

            while (flag && j*j <= number) {
                if (number % j == 0) {
                    flag = false;
                }
                else {
                    j++;
                }           
            }

            if (flag == true) {
            System.out.println(number);
        }         
  
    }
    }
}

    

