// Coping element from A to B;

package Questions;

public class CopiningElement {
    public static void main(String []args){
        int A[]={2,4,43,45,7,6,6,6345,3,66,33,22,6};
        int B[]=new int[13];
        System.out.println("Original Array!");

        for(int i=0; i<A.length; i++)
            System.out.print(A[i]+",");
        System.out.println("");

        System.out.println("Copied Array!");
        for(int i=0; i<A.length; i++){
            B[i]=A[i];
        System.out.print(B[i]+",");
        }
        System.out.println("");
    }
}
