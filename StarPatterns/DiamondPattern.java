package StarPatterns;

class DiamondPattern{
    public void printPattern(int n){
        int temp1 = n - 1;
        int temp2 = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= temp1; j++){
                System.out.print(" ");
            }temp1--;
            for(int k = 1; k <= temp2; k++){
                System.out.print('*' + " ");
            }temp2++;
            System.out.println();
        }
        // System.out.println(temp2);
        temp2 = temp2 - 2;
        temp1 = 1;
        for(int i = 1; i <= n - 1; i++){
            for(int j = 1; j <= temp1; j++){
                System.out.print(" ");
            }temp1++;
            for(int k = temp2; k >= 1; k--){
                System.out.print('*' + " ");
            }temp2--;
            System.out.println();
        }System.out.println();

        // Alternative code for the above one but more simple than the one on the top
        // for(int i = 0; i < n; i++){
        //     for(int k = 0; k < n-i; k++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j < i; j++){
        //         System.out.print("* ");
        //     }System.out.println();
        // }
        // for(int i = n-2; i >= 1; i--){
        //     for(int k = 0; k < n-i; k++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j < i; j++){
        //         System.out.print("* ");
        //     }System.out.println();
        // }
    }
/*
ij 0 1 2 
0    * 
1   * * 
2  * * * 
3   * * 
4    * 
ij 0 1 2 3 
0     * 
1    * * 
2   * * * 
3  * * * * 
4   * * * 
5    * * 
6     * 
*/
}