import java.lang.reflect.Type;
import java.text.MessageFormat;
import java.util.Scanner;
import java.io.File;

public class Main
{
    public static void main( String [] args )
    {
        ContactsManager myContactManager = new ContactsManager();
        System.out.println("Welcome to Colton's contact manager. Please chose an option:");
        System.out.println("1: Add Contact via text file");
        System.out.println("2: Add Contact via hand");
        System.out.println("3: Search Contact");
        System.out.println("4: List All Contact");
        Scanner scannerInput = new Scanner(System.in);
        int option = scannerInput.nextInt();
        switch (option)
        {
            case 1:
                File file = new File("contactlist.txt");
                Scanner scanner = new Scanner(file);

                break;
            case 2:
                System.out.println("Add Contact: Enter name, email and phone number as comma separated list.");
                scannerInput = new Scanner(System.in);
                String inputContact = scannerInput.nextLine();
                String delims = "[,]";
                String[] contactTokens = inputContact.split(delims);
                Contact contact = new Contact(contactTokens[0],contactTokens[1],contactTokens[2]);
                myContactManager.addContact(contact);
                break;

            case 3:
                break;

            case 4:
                int i = 0;
                for (Contact c : myContactManager.myFriends)
                {
                    if (c == null) break;
                    String string = String.format("My friend %s's phone number is %s and email is %s.",c.name, c.phoneNumber, c.email);
                    System.out.println(string);
                    i++;
                }
                break;
        }




    }
}

