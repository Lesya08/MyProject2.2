public class Main {
    public static void main(String[] args) {
        int initialAccount = 200;  // сумма изначально на счету
        int amount = 1500;         // сумма пополнения счета

        int bonus;                 // сумма бонусов
        int totalAmount;           // итоговая сумма
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        totalAmount = initialAccount + amount + bonus;
        System.out.println("Количество бонусов за пополнение счета " + bonus + " руб.");
        System.out.println("Итоговая сумма на счету " + totalAmount + " руб.");
    }

}