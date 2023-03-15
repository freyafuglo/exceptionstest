import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        try
        {
            Scanner input = new Scanner(new File("input.txt"));

            while (input.hasNextLine())
            {
                System.out.println(input.nextLine());
            }

        } catch (FileNotFoundException e)
        {
            //throw new RuntimeException(e);
            System.out.println("Error reading file: " + e);
        }

        //kommentar om kode
        //ny kommentar
    }
}
