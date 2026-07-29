import java.util.Scanner;
import StarPatterns.ZeroOneTrianglePattern;

class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();
        ZeroOneTrianglePattern pattern = new ZeroOneTrianglePattern();
        pattern.printPattern(n);

        in.close();

    }
}