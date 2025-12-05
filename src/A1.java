
public class A1 {
    public static void main(String[] args) {
        int A[]=new int[10];
        int B[]={1,2,3,4,5};
        int C[];
        C=new int[10];
        B[2]=15;
        for (int i=0; i<A.length; i++){
            System.out.println(A[i]);
        }
        for (int i=0; i<B.length; i++){  // We can change the element of Arrays like B++
            System.out.println(B[i]);
        }
        for (int x:B){    // We can't change the element of Arrays like B++
            System.out.println(x);
        }

    }
}