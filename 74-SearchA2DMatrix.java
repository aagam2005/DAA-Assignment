class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = rows*cols - 1;

        return bS2D(matrix, target, low, high, cols);
    }

    boolean bS2D(int matrix[][], int target, int low, int high, int col_length){
        if (low>high){
            return false;
        }
        int mid = low + (high-low)/2;
        int row = mid/col_length;
        int col = mid%col_length;

        if (matrix[row][col] == target){
            return true;
        } else if(matrix[row][col] < target){
            return bS2D(matrix, target, mid+1, high, col_length);
        } else{
            return bS2D(matrix, target, low, mid-1, col_length);
        }
    }
}
