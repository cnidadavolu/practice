package arrays;

public class MagicTree {

    public static void main(String[] args) {

        int[][] input = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int[][] input1 = {{3, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        MagicTree m = new MagicTree();
        System.out.println(m.MagicTree(input));
        System.out.println(m.MagicTree(input1));
    }

    public boolean MagicTree(int[][] magicArray) {

        int rowSum = 0, columnSum = 0;
        boolean isRow = false, isColumn = false;
        int len = magicArray.length;
        int mathSum = len * (((len * len) + 1) / 2); // magic constant if matrix is 3x3 then its magic constant = 15

        for (int i = 0; i < len; i++) {
            rowSum = magicArray[i][0] + magicArray[i][1] + magicArray[i][2];
            isRow = rowSum == mathSum;
            if (!isRow) return false;
        }

        for (int i = 0; i < len; i++) {
            columnSum = magicArray[0][i] + magicArray[1][i] + magicArray[2][i];
            isColumn = columnSum == mathSum;
            if (!isColumn) return false;
        }
        return (isRow && isColumn);
    }

    public int calRowSum(int[][] magicArray, int rowNum) {
        int sum = 0;

        for (int i = 0; i < magicArray.length; i++) {
            sum += magicArray[rowNum][i];
        }
        return sum;
    }


}
