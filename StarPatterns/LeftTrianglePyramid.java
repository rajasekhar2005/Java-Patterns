package StarPatterns;

class LeftTrianglePyramid{
    public void printPattern(int n){
        System.out.println("Left Triangle Pyramid: ");
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= n-i; k++){
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
/*
ij 0 1 2 3 4 
0          * 
1        * * 
2      * * * 
3    * * * * 
4  * * * * * 
 */
}