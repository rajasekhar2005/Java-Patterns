package StarPatterns;

public class MirrorImageTrianglePattern{
    public void printPattern(int n){
        System.out.println("Mirror Image Triangle Pattern: ");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i - 1; j++){
                System.out.print(" ");
            }
            for(int k = i; k <= n; k++){
                System.out.print(k + " ");
            }System.out.println();
        }
        for(int i = 2; i <= n; i++){
            for(int j = n-i-1; j >= 0; j--){
                System.out.print(" ");
            }
            for(int k = n-i+1; k <= n; k++){
                System.out.print(k + " ");
            }System.out.println();
        }
    }
/*
ij 1 2 3 4
1  1 2 3 4 
2   2 3 4 
3    3 4 
4     4
5    3 4 
6   2 3 4 
7  1 2 3 4
 */
}