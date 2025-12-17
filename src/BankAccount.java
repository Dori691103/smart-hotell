import java.time.LocalDateTime;
// Создание Полей и Класса
public class BankAccount {
    String name;
    int age;
    LocalDateTime time;
    boolean OpenClose;
    int balance;
    int balance2;

    public BankAccount(String name, int age, LocalDateTime time, Boolean OpenClose) {
        this.name = name;
        this.age = age;
        this.time = time;
        this.OpenClose = OpenClose;
        this.balance = 0;
        this.balance2 = 0;
    }
    // Метод пополнения
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Счёт пополнен на: " + amount + " руб.");
            System.out.println("Новый баланс: " + balance + " руб.");
        } else {
            System.out.println("Ошибка: сумма депозита должна быть положительной!");
        }
    }
    // Метод Списания
    public void Withdraw(int amount) {
        if (amount < 0) {
            balance += amount;
            System.out.println("Счёт уменьшен на: " + amount + " руб.");
            System.out.println("Новый баланс: " + balance + " руб.");
        } else {
            System.out.println("Ошибка: сумма списания должна быть отрицательной!");
        }
    }

    // Метод для просмотра баланса
    public void showBalance() {
        System.out.println("Текущий баланс: " + balance + " руб.");
    }
    // Метод для просмотра второго баланса
    public void showBalance2() {
        System.out.println("Текущий баланс: " + balance2 + " руб.");
    }
    // Перевод
    public void Transfer(int amount) {
        balance = balance + amount;
        if (balance >= 0) {
            System.out.println("Счёт уменьшен на: " + amount + " руб.");
            System.out.println("Новый баланс: " + balance + " руб.");
            balance2 = balance2 - amount;
            System.out.println("Новый баланс второго счета " + balance2 + " руб.");
        } else {
            System.out.println("Ошибка: сумма перевода должна быть положительной!");
        }
    }

    // Начало
    public static void main(String[] args) {
        //объект BankAccount
        BankAccount account = new BankAccount(
                "Мишка",
                21,
                LocalDateTime.now(),
                true
        );
        //информацию о счёте
        System.out.println("\nИнформация о счёте:");
        System.out.println("Владелец счёта: " + account.name);
        System.out.println("Возраст: " + account.age);
        System.out.println("Время " + account.time);

        //метод депозита
        System.out.println("\n--- Операции по счёту пополнения ---");
        account.showBalance();
        account.deposit(2000);
        System.out.println(account.OpenClose);
        //Метод Списания
        System.out.println("\n--- Операции по счёту списания ---");
        account.showBalance();
        account.Withdraw(-500);
        System.out.println(account.OpenClose);
        // Метод Перевода
        System.out.println("\n--- Операции по счёту перевода ---");
        account.Transfer(-500);
        System.out.println(account.OpenClose);
    }
}
