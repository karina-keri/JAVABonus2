//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double balance = 100; // Начальная сумма на счёте клиента
        double amount = 900; // Сумма пополнения

        int bonuses = 0;

        // Проверяем, если сумма пополнения больше 1000 рублей
        if (amount > 1000) {
            // Начисляем 1 рубль за каждые полные 100 рублей
            bonuses = (int) (amount / 100);
        } else {
            // Если сумма пополнения меньше или равна 1000 рублей, бонус не начисляется
            bonuses = 0;
        }
        double result = balance + amount + bonuses;

        System.out.println("Итоговая сумма на счёте: " + result + " рублей.");
        System.out.println("Количество бонусных рублей: " + bonuses + " рублей.");
    }
}