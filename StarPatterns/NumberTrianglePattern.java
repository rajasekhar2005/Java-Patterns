package StarPatterns;

class NumberTrianglePattern {
    public void printPattern(int n) {
        System.out.println("Number Triangle Pattern: ");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++ ) {
                System.out.print(i + " ");
            }System.out.println();
        }System.out.println();
    }
/*            i
       1      0
      2 2     1
     3 3 3    2
    4 4 4 4   3
   5 5 5 5 5  4
  6 6 6 6 6 6 5
j 0 1 2 3 4 5  
*/

// print every number with a space next to it
// number of spaces = n - i(row number, i.e., i)

/*


 5 5 5 5 5
6 6 6 6 6 6
 */
}