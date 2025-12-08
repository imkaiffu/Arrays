// Deleting Element;

package Challanges;

public class deleting {
    public static void main(String []args){
        int A[]=new int[10]; A[0]=2; A[1]=44; A[2]=32; A[3]=43; A[4]=6; A[5]=80;
        int n=10;
        for(int i=0; i<n; i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");

        int index=2;
        for(int i=index; i<n-1; i++){
            A[i]=A[i+1];
        }
        n--;

        for (int i=0; i<n; i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");
    }
}
