package StarPatterns;

class PascalsTrianglePattern{
    public static void printPattern(int n){
        System.out.println("Pascal's Triangle Pattern: ");
        // for(int i = 1; i <= n; i++){
        //     if(n == 1){
        //         System.out.println(n);
        //         break;
        //     }
        //     for(int j = 1; j <= n-i; j++){
        //         //prints out the spaces
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k <= i; k++){
        //         //prints out the numbers
        //         System.out.print(k + " ");
        //     }
        //     for(int k = i-1; k == 1; k--){
        //         System.out.print(k + " ");
        //     }System.out.println();
        // }
        for(int i = 1; i <= n; i++){
            if(n == 1){
                System.out.println(1);
                break;
            }
            // printing spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i/2; k++){

            }
        }
    }
/*
ij 1 2 3 4 5 
1      1 
2     1 1 
3    1 2 1 
4   1 2 2 1 
5  1 2 3 2 1 
 */
}