package Array2D.Challenges;

public class addition {
    public static void main(String []args){
        int A[][]={{4,64,343,6,4,34},{23,54,6,3,3,5},{54,34,64,523,23,23}};
        int B[][]={{32,54,3,5,6,45},{7,55,34,2,43,23},{2,43,21,54,32,2}};
        int C[][]=new int[3][6];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for(int x[]:C) {
            for(int y:x){
            System.out.print(y + ",");
            }
        System.out.println("");
        }
    }
}
