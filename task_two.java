// Вывести все простые числа от 1 до 1000


public class task_two {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                } 
            }
            if ((i % 1 == 0) && (i % i == 0) && (count == 2)) {
                System.out.println(i);
            }
        }
    }
}
