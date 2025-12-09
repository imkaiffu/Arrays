package Questions;

public class incresingSizeOfArray {
    public static void main(String args[]){
        int A[]={2,5,6,45,7};
        int B[]=new int[2*A.length];
        System.out.println("Original Array!");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");

        for(int i=0; i<=A.length-1; i++){
            B[i]=A[i];
            System.out.print(B[i]+",");
        }
        System.out.println("");
        System.out.println(B.length);
    }
}
