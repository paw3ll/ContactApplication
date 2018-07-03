import java.lang.reflect.Type;
import java.text.MessageFormat;

public class Main
{
    public static void main( String [] args )
    {
        int i = 0;
        ContactsManager myContactManager = new ContactsManager();
        Contact firstContact = new Contact();
        Contact secondContact = new Contact();
        Contact thirdContact = new Contact();
        Contact fourthContact = new Contact();

        firstContact.name = "Hayden";
        firstContact.email = "example0@gmail.com";
        firstContact.phoneNumber = "555-555-4321";

        secondContact.name = "Andrew";
        secondContact.email = "example1@gmail.com";
        secondContact.phoneNumber = "555-554-2315";

        thirdContact.name = "Russell";
        thirdContact.email = "example2@gmail.com";
        thirdContact.phoneNumber = "555-534-1367";

        fourthContact.name = "Amanda";
        fourthContact.email = "example3@gmail.com";
        fourthContact.phoneNumber = "554-754-6871";

        myContactManager.addContact(firstContact);
        myContactManager.addContact(secondContact);
        myContactManager.addContact(thirdContact);
        myContactManager.addContact(fourthContact);


        for (Contact c : myContactManager.myFriends)
        {
            if (c == null) break;
            String string = String.format("My friend %s's phone number is %s and email is %s.",c.name, c.phoneNumber, c.email);
            System.out.println(string);
            i++;
        }
    }
}

