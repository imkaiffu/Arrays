// minimum Length;

package Challanges;

public class adding1 {
    public static void main(String[] args){
        int A[]={2,5,6,8,2,34,73,2,2,0};
        int B[]={3,6,7,2,2};
        int minLength=Math.min(A.length,B.length);
        int C[]=new int[minLength];

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

        System.out.println("(First+Second) Array=");
        for(int i=0; i<minLength; i++){
            C[i]=A[i]+B[i];
            System.out.print(C[i]+",");
        }
        System.out.println("");
    }

}
