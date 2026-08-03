package StarPatterns;

public class HollowReverseTrianglePattern {
    public void printPattern(int n) {
        for(int i = 0; i < n+1; i++) {
            System.out.print("* ");
        }System.out.println();
        for(int i = n-1; i >= 1; i--) {
            for(int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }System.out.print("* ");

            for(int k = i-1; k >= 1; k--) {
                System.out.print("  ");
            }System.out.println("*");
        }

        for(int i = 0; i < n; i++) {
            System.out.print(" ");
        } System.out.println("* ");
    }
// ij 1 2 3 4 5 6     
// 1  * * * * * * 
// 2   *       *
// 3    *     *
// 4     *   *
// 5      * *
// 6       * 
}
