package Graph;
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;

                    // Subtract edges for each adjacent land cell
                    if (i > 0 && grid[i - 1][j] == 1) { // Check top cell
                        perimeter -= 2;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) { // Check left cell
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
}
