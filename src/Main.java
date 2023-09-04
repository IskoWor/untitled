import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String MyCarBi;
        String word = "City";
        final int NUM =22;
        MyCarBi= word + NUM ;
        System.out.println(MyCarBi+""+word+""+NUM);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else System.out.println("Вы сохранили ноль");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        System.out.println("Привет,"+name+"!");
    }
}