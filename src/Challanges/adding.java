package Challanges;

public class adding {
    public static void main(String []args){
        int A[]={4,6,3,7,9,7};
        int B[]={75,4,37,9,4,1};
        int C[]=new int[A.length];

        System.out.println("A is :");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");

        System.out.println("B is:");
        for(int x:B){
            System.out.print(x+",");
        }
        System.out.println("");

        for(int i=0; i<A.length; i++){
            C[i]=A[i]+B[i];
        }
        System.out.println("C(A[i]+B[i]) =");

        for (int i=0; i<C.length; i++){
            System.out.print(C[i]+",");
        }
        System.out.println("");
    }
}
