package StarPatterns;

public class HollowHourGlassPattern {
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

        for(int i = 1; i <= n-1; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }System.out.print("* ");
            // if(i == 2) {
            //     System.out.println("* * ");
            // }
            for(int k = 1; k <= i-1 ; k++) {
                System.out.print("  ");
            }System.out.println("*");
        }
        for(int i = 0; i < n+1; i++) {
            System.out.print("* ");
        }
    }
// ij 1 2 3 4 5 6
// 1  * * * * * * 
// 2   *       *
// 3    *     *
// 4     *   *
// 5      * *
// 6       * 
// 7      * *
// 8     *   *
// 9    *     *
// 1   *       *
// 2  * * * * * * 
}
