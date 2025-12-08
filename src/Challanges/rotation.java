// Rotation Of an Array

package Challanges;

public class rotation {
    public static void main(String args[]){
        int A[]={3,6,7,4,8,3,65,24,976,43};
        for(int x:A)
            System.out.print(x+",");
        System.out.println("");
        int temp=A[0];

        for(int i=1; i<A.length; i++){
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;

        for(int x:A)
            System.out.print(x+",");
        System.out.println("");
    }
}
