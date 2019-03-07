import java.io.File;
//credits to Horky
 
public class Stromecek {
    public static void main(String[] args) {
        printFiles(new File("."), "--");
    }
 
    private static void printFiles(File dir, String indent) {
        File[] files = dir.listFiles();
        for (File f : files) {
            System.out.printf("%s%s\n", indent, f.getName());
            if (f.isDirectory()) {
                printFiles(f, indent + "  ");
            }
        }
    }
}