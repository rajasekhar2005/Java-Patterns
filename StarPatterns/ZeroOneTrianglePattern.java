package StarPatterns;

public class ZeroOneTrianglePattern{
    public void printPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i % 2 == 0 && j % 2 == 0){
                    System.out.print("1 ");
                } else if(i % 2 != 0 && j % 2 != 0){
                    System.out.print("1 ");
                } else if(i % 2 != 0 && j % 2 == 0){
                    System.out.print("0 ");
                } else if(i % 2 == 0 && j % 2 != 0){
                    System.out.print("0 ");
                }
            }System.out.println();
        }System.out.println();
    }
/*
ij 1 2 3 4 5 
1  1 
2  0 1 
3  1 0 1 
4  0 1 0 1 
5  1 0 1 0 1 

odd odd -> 1
odd even -> 0
even odd -> 0
even even -> 1
 */
}