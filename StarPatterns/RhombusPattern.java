package StarPatterns;

class RhombusPattern {
    public void printPattern(int n) {
        System.out.println("Rhombus Pattern: ");
        for(int i = 0; i < n; i++) {
            for(int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }System.out.println();
        }System.out.println();
    }
/*
ij 0 1 2 3 4 5
0  * * * * * *
1   * * * * * *
2    * * * * * *
3     * * * * * *
4
5
 */
}