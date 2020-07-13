public class TransposeMatrix {

    public static void main(String[] args) {

        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        TransposeMatrix transposeMatrix = new TransposeMatrix();
        transposeMatrix.transpose(A);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.println(A[i][j]);
            }
        }
    }

    public int[][] transpose(int[][] A) {

        int rows = A.length;
        int columns = A[0].length;
        int temp;

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                temp = A[i][j];
                A[j][i] = A[i][j];
                A[i][j] = temp;
            }
        }
        return A;
    }
}
