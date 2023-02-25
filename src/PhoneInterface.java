public interface PhoneInterface {

    void turnON(long passWord);
    void callWithNumber(long number);
    void callWithName(String name);
    Contact searchContact(String name);
    void contactUpdateName(String firstName);
    void getAllContact();

}
