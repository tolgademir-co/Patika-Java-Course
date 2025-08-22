package patika_4_oop._2_banking_system;

import java.util.Scanner;

public class BankingSystem {

    private static Customer[] customers = new Customer[10];

    public static void main(String[] args) {

        Customer customer = new Customer("Elif", "Ak", "12345678", "12345678911");
        customers[0] = customer;
        menu();

    }

    private static void menu() {

        Scanner scanner = new Scanner(System.in);

        volidatePassword(scanner);

        int choise;

        do {
            printMenu();

            choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    createBankAccount(scanner);
                    break;
                case 2:
                    customers[0].listAccounts();
                    break;
                case 3:
                    customers[0].listAccounts();
                    System.out.print("İşlem Yapmak istediğiniz hesabı seçiniz: ");
                    int selectedIndex = scanner.nextInt();
                    BankAccount selectedBankAccount = customers[0].getBankAccounts()[selectedIndex];
                    int subChoise;

                    do {

                        System.out.println("---" + selectedBankAccount.getAccountNumber() + " hesabı için işlem yapıyorsunuz!");
                        System.out.println("1 - Bakiye görüntüle");
                        System.out.println("2 - Para yatır");
                        System.out.println("3 - Para çek");
                        System.out.println("4 - Ana Meneüye dön");

                        subChoise = scanner.nextInt();

                        switch (subChoise) {
                            case 1:
                                System.out.println(selectedBankAccount.getAccountNumber() + " " + selectedBankAccount.getBalance() + " " + selectedBankAccount.getCurrencyType().getSymbol());
                                break;
                            case 2:
                                System.out.println("Yatırmak istediğiniz miktarı girin: ");
                                double amount = scanner.nextDouble();
                                selectedBankAccount.deposit(amount);
                                break;
                            case 3:
                                System.out.println("Çekmek istediğiniz miktarı girin: ");
                                double drawAmount = scanner.nextDouble();
                                selectedBankAccount.withDraw(drawAmount);
                                break;
                            case 4:
                                System.out.println("Ana Menüye Aktarılıyorsunuz...");
                                break;

                                default:
                                    System.out.println("Yanlış seçim yaptınız!");

                        }

                    } while (subChoise != 4);
                    break;

                case 4:
                    System.out.println("Çıkış yapılıyor ...");
                    break;

                default:
                    System.out.println("Geçersiz Seçim yaptınız.");
            }

        } while (choise != 4);

        System.out.println("Teşekkürler!! Bankamızı Seçtiğiniz için");

    }

    private static void printMenu() {
        System.out.println("---- Bankacılık İşlemleri ----");
        System.out.println("1 - Yeni Hesap Aç");
        System.out.println("2 - Hesaplarını Listele");
        System.out.println("3 - Hesap Seç ve İşlem Yap");
        System.out.println("4 - Çıkış Yap");
        System.out.print("5 - Seçiminizi Yapın: ");
    }

    private static void createBankAccount(Scanner scanner) {
        System.out.println("Başlangıç bakiyesi girin: ");
        double amount = scanner.nextDouble();
        System.out.println("Para birimi seçiniz? 1 - TL | 2 - Dolar | 3 - Euro | 4 - Altın");
        int currencyChoise = scanner.nextInt();

        CurrencyType currencyType = switch (currencyChoise) {
            case 1 -> CurrencyType.TL;
            case 2 -> CurrencyType.DOLAR;
            case 3 -> CurrencyType.EURO;
            case 4 -> CurrencyType.GOLD;
            default -> {
                System.out.println("Geçersiz birim seçtiniz!");
                yield CurrencyType.TL;
            }
        };

        String customerName = customers[0].getName();
        String accountNumber = customerName.charAt(0) + "-" + customerName.length() + currencyChoise;

        BankAccount bankAccount = new BankAccount(accountNumber, amount, currencyType);

        customers[0].addAccount(bankAccount);
    }

    private static void volidatePassword(Scanner scanner) {

        System.out.println("Merhaba! " + customers[0].getName());
        int wrondPasswordCounter = 0;

        do {
            System.out.print("Şifrenizi giriniz: ");
            String password = scanner.nextLine();

            if (!customers[0].getPassword().equals(password)) {
                System.out.println("Yanlış şifre girdiniz!");
                wrondPasswordCounter++;
            } else {
                System.out.println("Doğru şifre girdiniz. Bankacılık Menüsüne aktarılıyorsunuz.");
                break;
            }

        } while (wrondPasswordCounter < 4);


    }
}
