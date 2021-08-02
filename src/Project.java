import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12;

        int dollars;
        double roubles;

        Scanner input = new Scanner(System.in);

        // Получить сумму денег в амереканских долларах
        System.out.println("Введите сумму денег в американсих долларах: ");
        dollars = input.nextInt();

        // Конвертировать смму денег в российские рубли
        roubles = ROUBLES_PER_DOLLAR * dollars;

        // Отобразить сумму денег в российских рублях в пользу покпателя
        System.out.println("Она равна: " + (int)(roubles * 100) / 100.0 + " российского рубля."); //Отображение суммы в пользу покупателя

    }
}
