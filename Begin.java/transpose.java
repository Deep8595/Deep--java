public class transpose {
    public static void main(String[] args) {
        System.out.println("Matrix representation");
        int row = 2 , column = 3 ;
        int[][] matrix = {{2,3,4} ,{5,6,7}};
        // display current matrix
        for(int i=0; i<matrix.length; i++){
            for(int j = 0 ; j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // transpose of matrix
        System.out.println("Transpose of matrix");
        int[][] transpose = new int[column][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        // Display transpose matrix
        for(int i=0; i<transpose.length;i++){
            for(int j=0; j<transpose[i].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
