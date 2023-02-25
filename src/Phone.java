import java.sql.SQLOutput;
import java.util.Scanner;

public class Phone implements PhoneInterface {

    private String brand;
    private long passWord;
    Contact[] contacts;

    public Phone(String brand, long passWord, Contact[] contacts) {
        this.brand = brand;
        this.passWord = passWord;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getPassWord() {
        return passWord;
    }

    public void setPassWord(long passWord) {
        this.passWord = passWord;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public void turnON(long passWord) {
        if (getPassWord() == passWord) {
            System.out.println("ТЕЛЕФОН ВКЛЮЧЕН!");
        } else {
            System.out.println("НЕВЕРНЫЙ ПАРОЛЬ!");

        }
    }

    @Override
    public void callWithNumber(long number) {

        int counter = 0;
        for (Contact c : contacts) {

            if (c.getPhoneNumber() == number) {
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("НЕ ПРАВИЛЬНЫЙ НОМЕР!!");
        } else {

            for (Contact c : contacts) {
                if (c.getPhoneNumber() == number) {
                    System.out.println("ВЫ ЗВОНИТЕ ПО ЭТОМУ НОМЕРУ :" + c.getPhoneNumber() + "  " + c.getFullName());
                }
            }
        }
    }


    @Override
    public void callWithName(String name) {
        int counter = 0;
        for (Contact t : contacts) {
            if (t.getFullName().equals(name)) {
                counter++;
            }
        }
        if (counter == 0)
            System.out.println("НЕ ПРАВИЛЬНОЕ ИМЯ !!");
        else {
            for (Contact c : contacts
            ) {
                if (c.getFullName().equals(name)) {
                    System.out.println("ВЫ ЗВОНИТЕ ЭТОМУ :" + c.getFullName() + "  " + c.getPhoneNumber());
                }
            }
        }
    }

    @Override
    public Contact searchContact(String name) {
        for (Contact c : contacts) {
            if (c.getFullName().equals(name)) {
                return c;

            }

        }
        return null;
    }

    @Override
    public void contactUpdateName(String firstName) {
        for (Contact c : contacts
        ) {
            if (c.getFullName().equals(firstName)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("НАПИШИТЕ НОВОЕ ИМЯ : ");
                String newName = scanner.nextLine();
                c.setFullName(newName);
                System.out.println(newName);
            }

        }
    }


    @Override
    public void getAllContact() {
        for (Contact c : contacts
        ) {
            System.out.println(c.toString());

        }


    }

}

