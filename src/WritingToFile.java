import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class WritingToFile {
    public static void main(String[] args) throws IOException {
        //Create and open the file
        Writer out;
        PrintWriter OutPutFile = new PrintWriter("Output.txt");
        OutPutFile.println("This is Line 1");
        OutPutFile.println("This is Line 2");
        OutPutFile.println("This is Line 3");

        OutPutFile.close();

    }
}
