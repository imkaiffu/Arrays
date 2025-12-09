// Maximum Length;

package Challanges;

public class adding2 {
    public static void main(String[] args){
        int A[]={2,5,6,8,2,34,73,2,2,0};
        int B[]={3,6,7,2,2};
        int maxLength=Math.max(A.length,B.length);
        int C[]=new int[maxLength];

        System.out.println("First Array;");
        for(int x:A){
            System.out.print(x+",");
        }
        System.out.println("");

        System.out.println("Second Array;");
        for(int x:B){
            System.out.print(x+" ");
        }
        System.out.println("");

        for(int i=0; i<maxLength; i++){
            int valueA= (i<A.length) ? A[i]:0;
            int valueB= (i<B.length) ? B[i]:0;
            C[i]=valueA+valueB;
        }

        System.out.println("(First+Second) Array=");
        for(int i=0; i<C.length; i++){
            System.out.print(C[i]+",");
        }
        System.out.println("");

    }
}
