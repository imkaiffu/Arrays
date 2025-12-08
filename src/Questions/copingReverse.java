// Coping reverse element from A to B;

package Questions;

public class copingReverse {
    public static void main(String args[]) {
        int A[] = {3, 5, 6, 3, 6, 3, 6, 34, 64, 24, 6};
        int B[]=new int[A.length];
        System.out.println("Original Array!");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");

        System.out.println("Reversed Array!");

        for(int i=A.length-1, j=0;i>=0; i--, j++){
            B[j]=A[i];
            System.out.print(B[j]+",");
        }
        System.out.println("");


    }
}
