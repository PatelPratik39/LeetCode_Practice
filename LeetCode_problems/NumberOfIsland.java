/**
 * 200. Number of Islands
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * Output: 1
 * Example 2:
 *
 * Input: grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * Output: 3
 */

package LeetCode_problems;

public class NumberOfIsland {
    private static int numberInIsland ( char[][] grid ) {
        int count = 0;
        for(int i =0; i < grid.length; i++){
            for(int j =0; j < grid[i].length; j++){
                 if(grid[i][j] == '1'){
                     count++;
                     callDFS(grid,i,j);
                 }
            }
        }
        return count;

    }
    private static void callDFS ( char[][] grid, int row, int col ) {
        if( row < 0 || col < 0 || row >= grid.length || col >= grid[row].length || grid[row][col] == '0'){
            return;
        }
        grid[row][col] = '0';

        callDFS(grid, row, col+1);
        callDFS(grid, row, col-1);
        callDFS(grid,row+1, col);
        callDFS(grid,row-1,col);
    }


    public static void main ( String[] args ) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int result = numberInIsland(grid);
        System.out.println(result);
    }
}
