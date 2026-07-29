package StarPatterns;

class SquareFillPattern{
    public void printPattern(int n){
        System.out.println("Square Fill Pattern: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }System.out.println();
        }System.out.println();
    }
}