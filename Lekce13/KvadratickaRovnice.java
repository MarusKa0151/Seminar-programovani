//package cz.alisma.alej.prog;

/*
public interface QuadraticEquationPrinter {
    public void printHeader(int count);
    public void printEquation(int a, int b, int c, int x1, int x2);
    public void printFooter();
}
*/
import cz.alisma.alej.prog.pg13.QuadraticEquationGenerator;
import cz.alisma.alej.prog.pg13.QuadraticEquationPrinter;

public class KvadratickaRovnice {
    public static void main(String[] args) {
        QuadraticEquationPrinter printer = new HtmlPrinter();
        // QuadraticEquationPrinter printer = new ScreenPrinter();
 
        QuadraticEquationGenerator.generate(10, printer);
    }

    public static class HtmlPrinter implements QuadraticEquationPrinter {
        
    }
    
}