package StarPatterns;

class KPattern{
    public void printPattern(int n){
        System.out.println("K Pattern: ");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("* ");
            }System.out.println();
        }
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
/*
ij 1 2 3 4 5 
1  * * * * * 
2  * * * * 
3  * * * 
4  * * 
5  *
2  * * 
3  * * * 
4  * * * * 
5  * * * * * 
 */
}