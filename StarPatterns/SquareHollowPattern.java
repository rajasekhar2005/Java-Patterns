package StarPatterns;

public class SquareHollowPattern {
    public void printPattern(int n) {
        System.out.println("Square Hollow Pattern: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == (n-1) || j == (n-1)){ System.out.print("*"); }
                else { System.out.print(" "); }
            }
            System.out.println();
        }System.out.println();
    }
/*
0 1 2 3 4 5 
* * * * * * 0
*         * 1
*         * 2
*         * 3
*         * 4 
* * * * * * 5
*/
}