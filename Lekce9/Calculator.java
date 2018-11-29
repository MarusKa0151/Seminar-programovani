public class Calculator {
    public static void main(String[] args) {
        System.out.printf("%d", adding(args[0]));  
    }
    public static int multiplication(String x)  {
        int mul = 1;
        String[] something = x.split("x");
        for (int j = 0; j < something.length; j++) {
            int y = Integer.parseInt(something[j]);
            mul = mul*y;
        }
        return mul;
    }
    public static int adding(String x) {
        String parts[] = x.split("\\+");
        int sum = 0;
        for (int i = 0; i < parts.length; i++) {
            sum += multiplication(parts[i]);
        }
        return sum;

    }
}