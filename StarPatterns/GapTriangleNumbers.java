package StarPatterns;

class GapTriangleNumbers {
    public void printPattern(int n) {
        System.out.println("Gap Triangle Numbers Pattern: ");
        int temp = n;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for(int k = 1; k <= 2*temp - 2; k++) {
                System.out.print("  ");
            }temp--;

            for(int l = i; l >= 1; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
// 1               1
// 1 2           2 1
// 1 2 3       3 2 1
// 1 2 3 4   4 3 2 1
// 1 2 3 4 5 4 3 2 1  
}
