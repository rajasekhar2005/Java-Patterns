package StarPatterns;

class ReverseNumberTrianglePattern{
    public void printPattern(int n){
        System.out.println("Reverse Number Triangle Pattern");
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= i - 1; k++){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                System.out.print(j + " ");
            }System.out.println();
        }
    }
/*
ij 1 2 3 4 
1  1 2 3 4 
2   2 3 4
3    3 4
4     4
*/
}