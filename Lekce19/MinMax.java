import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("cisla.txt");
        Scanner sc = new Scanner(reader);
        int firstNumber = sc.nextInt();
        int min = firstNumber;
        int max = firstNumber;
        
        while (sc.hasNextInt()) {
            int currentNumber = sc.nextInt();
            if (currentNumber < min) {
                min = currentNumber;
            }
            else if (max < currentNumber) {
                max = currentNumber;
            }
        }
        sc.close();
        reader.close();
        System.out.printf("Minimum is %d and maximum is %d", min, max);
    }
}