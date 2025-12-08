// Maximum Element;

package Challanges;

public class maximume {
    public static void main(String[]args){
        int A[]={3,5,6,3,67,4,8};
        int max=0;
        for(int i=0; i<A.length; i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println(max);
    }
}
