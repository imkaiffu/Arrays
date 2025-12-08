// Searching an Element;

package Challanges;

import java.util.Scanner;

public class searching {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int A[]={3,54,6,2,62,2,7,73,8};
        int key;
        System.out.println("Enter a Key ");
        key=sc.nextInt();
        for(int i=0; i<A.length; i++){
            if(key==A[i]){
                System.out.println("Element Found at:"+i);
                System.exit(0);
            }
        }
        System.out.println("Element not Found");
    }
}
