public class NearestExitfromEntranceinMaze {
    private int min = Integer.MAX_VALUE;
    public int nearestExit(char[][] maze, int[] entrance) {
        min=Integer.MAX_VALUE;
        explore(maze,entrance[0],entrance[1],0,entrance);
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    private void explore(char[][] maze, int i, int j, int count, int[] entrance) {
        int row = maze.length;
        int col = maze[0].length; // Ensure this is based on the first row, not dynamically on 'i'

        // Check if we found an exit that's not the entrance
        if ((i != entrance[0] || j != entrance[1]) && (i == 0 || j == 0 || i == row - 1 || j == col - 1)) {
            min = Math.min(min, count);
            return;
        }

        // Mark the current cell as visited
        maze[i][j] = '+';

        // Explore in four possible directions (up, down, left, right)
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] dir : directions) {
            int ni = i + dir[0];
            int nj = j + dir[1];

            // Continue exploring if within bounds and cell is unvisited ('.')
            if (ni >= 0 && ni < row && nj >= 0 && nj < col && maze[ni][nj] == '.') {
                explore(maze, ni, nj, count + 1, entrance);
            }
        }

        // Unmark the current cell after exploration (backtracking)
        maze[i][j] = '.';
    }
}
