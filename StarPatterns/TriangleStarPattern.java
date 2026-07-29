package StarPatterns;

class TriangleStarPattern{
    public void printPattern(int n){
        System.out.println("Triangle Star Pattern: ");
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= n - i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
/*
ij 1 2 3 4 5 6  
1       * 
2      * * 
3     * * * 
4    * * * * 
5   * * * * * 
6  * * * * * *
 */
}