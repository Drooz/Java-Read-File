import java.io.File;
import java.util.Scanner;


public class HowToReadAFile 
{
    public static void main(String[] args) 
    {
        try
        {
            File f  = new File("C:/Users/TuX/Desktop/numbers.txt");
            Scanner reader = new Scanner(f, "UTF-8");
            
            // Read File Line By Line
            /*
            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                System.out.println(line);
            }*/
            
            int sum  = 0, cnt = 0;
            while (reader.hasNextInt())
            {
                cnt++;
                sum += reader.nextInt();
            }
            System.out.println("Total Of "+cnt+" Numbers Is "+sum);            
// Close The Reader
            reader.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
