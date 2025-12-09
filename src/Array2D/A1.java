// Types of way to create 2D Array;

package Array2D;

public class A1 {
    public static void main(String[]args){
        int A[][]=new int[5][5];

        int B[][]={{1,2,3,4,5},{1,2,3,4,5},{2,3,4,5,6}};

        int C[][];
        C=new int[5][5];

        int []D[]=new int[5][5];

        int[]E,F[];

        // For B;

        for(int i=0; i<B.length; i++){
            for(int j=0; j<B[0].length; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("\n2nd Method\n");
        for(int x[]:B){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }

    }
}
