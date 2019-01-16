import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
      Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int res=0;
         do {
             int number = random.nextInt(9)+1 ;
             System.out.println("Угадайте число");

         for (int i = 0; i <3 ; i++) {
            int number2 = scanner.nextInt();
            if (number == number2){
                System.out.println("Поздравляю вы угдали число");
                break;
            }
            else {
                if ( number2> number){
                    System.out.println("Ваше число больше ");
                }
                else {
                    System.out.println("Ваше число меньше");
                }
            }
        } 
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
         res = scanner.nextInt();
    } while ( res ==1 );


    }
}
