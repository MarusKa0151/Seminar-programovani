//package cz.alisma.alej.prog;

/*
public interface QuadraticEquationPrinter {
    public void printHeader(int count);
    public void printEquation(int a, int b, int c, int x1, int x2);
    public void printFooter();
}
*/
import java.util.Random;

import cz.alisma.alej.prog.pg13.QuadraticEquationGenerator;
import cz.alisma.alej.prog.pg13.QuadraticEquationPrinter;

public class KvadratickaRovnice {
    public static void main(String[] args) {
        if (agrs[0] == "screen") {
            QuadraticEquationPrinter printer = new ScreenPrinter();
        }
        else if (args[0] == "html") {
            QuadraticEquationPrinter printer = new HtmlPrinter();
        }
       QuadraticEquationGenerator.generate(10, printer);
    }

    public static class HtmlPrinter implements QuadraticEquationPrinter {
        public void printHeader(int count) {
            System.out.print("<html>\n<body>\n");

        }
        public void printEquation(int a, int b, int c, int x1, int x2) {
            Random rand = new Random();
            a = rand.nextInt();
            b = rand.nextInt();
            c = rand.nextInt();
            x1 = rand.nextInt();
        }
        public void printFooter() {
            System.out.printf("\n</body>\n</html>");
        }

    }

    public static class ScreenPrinter implements QuadraticEquationPrinter {

    }
    
}