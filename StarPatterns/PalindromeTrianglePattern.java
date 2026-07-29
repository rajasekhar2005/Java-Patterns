package StarPatterns;

public class PalindromeTrianglePattern {
    public void printPattern(int n) {
        System.out.println("Palindrome Triangle Pattern: ");
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= n-i; k++){
                System.out.print("  ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
/*
ij 1 2 3 4 5 6 7 8 9 10 11
1            1 
2          2 1 2 
3        3 2 1 2 3 
4      4 3 2 1 2 3 4 
5    5 4 3 2 1 2 3 4 5 
6  6 5 4 3 2 1 2 3 4 5 6 
 */
}