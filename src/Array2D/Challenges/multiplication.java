package Array2D.Challenges;

public class multiplication {
    public static void main(String[]args) {

        int A[][] = {{4, 1, 3}, {2, 4, 6}, {4, 1, 3}};
        int B[][] = {{2, 4, 3}, {3, 5, 3}, {2, 3, 1}};
        int C[][] = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                C[i][j]=0;
                for(int k=0; k<3; k++){
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        for(int x[]:C){

            for(int y:x)
            {
                System.out.print(y+",");
            }
        System.out.println("");
        }
    }
}
