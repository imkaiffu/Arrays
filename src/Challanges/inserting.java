// Inserting the Element;
// at index 2;

package Challanges;

public class inserting {
    public static void main(String []args){
        int A[]=new int[10];
        A[0]=1; A[1]=5; A[2]=32;A[3]=8; A[4]=7; int n=5;

        for(int i=0;i<n;i++) {
            System.out.print(A[i] + ",");
        }
            System.out.println("");
        int x=20;
        int index=2;
        for(int i=n; i>index; i--){
            A[i]=A[i-1];
        }
            A[index]=x;
        for(int i=0;i<n;i++) {
            System.out.print(A[i] + ",");
        }
            System.out.println("");
    }
}
