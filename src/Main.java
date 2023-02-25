import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {

            Contact contact = new Contact(333565678, "Ruslan ");
            Contact contact2 = new Contact(333343456, "Manas baike");
            Contact contact3 = new Contact(333232354, "Momun");
            Contact[] contacts = {contact, contact2, contact3};

            Phone phone = new Phone("Iphone", 121234, contacts);
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("НАПИШИТЕ ПАРОЛЬ :");
            phone.turnON(scanner.nextLong());
            System.out.println("НАПИШИТЕ НОМЕР КОНТАКТА :");
            phone.callWithNumber(scanner1.nextLong());
            System.out.println("НАПИШИТЕ ИМЯ  КОНТАКТА :");
            phone.callWithName(scanner2.nextLine());
            System.out.println("НАПИШИТЕ ИМЯ  КОНТАКТА :");
            System.out.println(phone.searchContact(scanner3.nextLine()));
            System.out.println("НАПИШИТЕ ИМЯ КОНТАКТА ,КОТОРУЮ ХОТИТЕ ИЗМЕНИТЬ  :");
            phone.contactUpdateName(scanner4.nextLine());
            phone.getAllContact();
        }
    }
}