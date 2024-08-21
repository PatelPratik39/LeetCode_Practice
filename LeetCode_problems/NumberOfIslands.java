package LeetCode_problems;

public class NumberOfIslands {
    private static int numberInIslands ( char[][] grid ) {
        int count = 0; //initialize count at 0 first

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid,i, j);
                }
            }
        }
        return count;
    }

    public static void dfs(char[][] grid, int i, int j){

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';
        dfs(grid,i ,j + 1);  // right side
        dfs(grid, i, j -1);  // left side
        dfs(grid, i + 1,j);  // up
        dfs(grid,i - 1, j);  // down
    }

    public static void main ( String[] args ) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int result = numberInIslands(grid);
        System.out.println(result);
    }


}
