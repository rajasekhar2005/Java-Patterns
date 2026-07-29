package StarPatterns;

class RightTrianglePyramid{
    public void printPattern(int n){
        System.out.println("Right Triangle Pyramid: ");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
/*
ij 0 1 2 3 4 
0  * 
1  * * 
2  * * * 
3  * * * * 
4  * * * * * 
 */
}