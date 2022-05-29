import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите стоимость вашего перелета");
        double price = scanner.nextDouble();
        int priceForBonus = (int) price;
        int bonus;
        bonus=priceForBonus/20;
        System.out.println("Поздравляем! Вам начислено "+ bonus + " бонусных миль.");

    }
}
