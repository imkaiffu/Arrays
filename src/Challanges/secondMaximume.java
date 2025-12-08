// Second Largest Value;

package Challanges;

public class secondMaximume {
    public static void main(String []args){
        int A[]={2,53,6,23,7,9,24};
        int max1,max2;
        max1=max2=A[0];
        for(int i=0; i<A.length; i++){
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2){
                max2=A[i];
            }
        }
        System.out.println("Second Largest value is ="+max2);
    }
}
