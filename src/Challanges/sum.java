// Sum of element;

package Challanges;

public class sum {
    public static void main(String[]args){

        int A[]={2,3,6,4,8,8,21,7};
        int sum=0;
        for (int i=0; i<A.length; i++){
            sum=sum+A[i];
            System.out.print(sum+" ");
        }
        System.out.println("\nsum is "+sum);


        int B[]={4,5,2,6,67,36,34};
        int sum1=0;
        for(int x:B){
            sum1=sum+x;
        }
        System.out.println("Sum is = "+sum1);
    }
}
