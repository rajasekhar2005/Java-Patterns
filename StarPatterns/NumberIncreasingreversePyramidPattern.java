package StarPatterns;

class NumberIncreasingreversePyramidPattern {
    public void printPattern(int n) {
        System.out.println("Number-increasing reverse Pyramid Pattern: ");
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }System.out.println();
        }System.out.println();
    }
/*
ij 1 2 3 4 5 6
6  1 2 3 4 5 6 
5  1 2 3 4 5 
4  1 2 3 4 
3  1 2 3  
2  1 2 
1  1 
*/
}