package StarPatterns;

class NumberChangingPyramidPattern {
    public void printPattern(int n) {
        System.out.println("Number-changing Pyramid Pattern: ");
        int k = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }System.out.println();
        }System.out.println();
    }
/*
ij 1 2 3 4 5 6 
1  1
2  2 3 
3  4 5 6 
4  7 8 9 10
5  11 12 13 14 15
6  16 17 18 19 20 21
 */
}