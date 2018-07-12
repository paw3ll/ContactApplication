import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileOps
{
    void ReadFile()
    {
        File file = new File("contactlist.txt");
        try
        {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}

