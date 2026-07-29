package StarPatterns;

public class ReverseLeftTrianglePyramid{
    public void printPattern(int n){
        System.out.println("Reverse Left Triangle Pyramid: ");
        for(int i = n; i >= 1; i--){
            for(int k = 0; k < n-i; k++){
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
/*
ij 0 1 2 3 4 
0  * * * * * 
1    * * * * 
2      * * * 
3        * * 
4          * 
 */
}