import java.io.IOException;
import java.io.PrintWriter;

public class Nasobky {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter("nasobky.txt");
        int column = 0;
        for (int i = 3; i < 1000; i += 3) {
            writer.printf("%d ", i);
            column ++;
            if (column == 10) {
                writer.printf("\n");
                column = 0;
            }      
        }
        writer.close();        
    }
}
