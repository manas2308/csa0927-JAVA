import java.io.File;
import java.util.Scanner;

public class File_not_found {
    public static void main(String[] args) {
        try {
            File myFile = new File("test.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("there is an exception "+e);

        }
    }
}