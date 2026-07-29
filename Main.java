import java.util.Scanner;
import StarPatterns.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();

        // Example usage of one of the pattern classes
        GapTriangleNumbers pattern = new GapTriangleNumbers();
        pattern.printPattern(n);

        in.close();
    }
}