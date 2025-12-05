// Array Rotation

package Challanges;

public class C6 {
    public static void main(String[] args) {
        int A[] = {4, 5, 6, 3, 6, 7, 36, 75, 35, 75, 3};
        for (int z : A)
            System.out.print(z + ",");
        System.out.println("");
        int temp=A[A.length-1];

        for(int i=A.length-1; i>0; i--){
            A[i]=A[i-1];
        }
        A[0]=temp;
        for(int z:A)
            System.out.print(z+",");
        System.out.println("");
    }
}
