import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File {
     public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String Line = scanner.nextLine();
            System.out.println(Line);
        }
        scanner.close();
    }
}