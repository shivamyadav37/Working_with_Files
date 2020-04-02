import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadinFromFile {
    public static void main(String[] args) throws IOException {

        //Reading from the file that we created previously.
        File file = new File("Output.txt");
        if (file.exists()){
            Scanner inputFile = new Scanner(file);
            System.out.println(inputFile.nextLine());
            inputFile.close();
        }

    }
}
