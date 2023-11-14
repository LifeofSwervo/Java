import java.util.ArrayList;

public class Test {
    private static final int MAZE_SIZE = 10;
    private static int[][] maze = { // Initial maze
            {0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, // Walls Marked 1, Exit marked -1, Open spots marked 0
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 0, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 1, 1, 1, 1},
            {1, 0, 1, 1, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 1, 0, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, -1} // (Goal of maze can be changed and maze should still work)
    };
    
    public static void main(String[] args) {
        if (findPath(0, 0)) {
            printMaze();
        } else {
            System.out.println("No path found.");
        }
    }

    public static boolean findPath(int x, int y) {
        if (x < 0 || x >= MAZE_SIZE || y < 0 || y >= MAZE_SIZE // If cell is outside the maze.
                || maze[y][x] == 1 || maze[y][x] == -2) { // Checks rather cell is an obstacle or already visited.
            return false; // Return false if any of these occur to indicate invalid path.
        }

        if (maze[y][x] == -1) { // If current cell is the exit, return true
            return true;
        }

        maze[y][x] = -2;  // Mark the current cell as being visited

        if (findPath(x, y - 1) // Check if up is valid and not visited
                || findPath(x - 1, y) // Check if left is valid and not visited, and we haven't found an exit yet
                || findPath(x + 1, y) // Check if right is valid and not visited, and we haven't found an exit yet
                || findPath(x, y + 1)) { // Check if down is valid and not visited, and we haven't found an exit yet
            return true; // Returns true if a valid path has been found
        }

        maze[y][x] = 0;  // Mark the cell as unvisited
        return false;
    }

    public static void printMaze() {
        for (int[] row : maze) {
            for (int cell : row) {
                if (cell == 1) {
                    System.out.print("* ");
                } else if (cell == -2) {
                    System.out.print("@ ");
                } else if (cell == -1) {
                    System.out.print("X "); // Change to "@" or other character if desired
                } else {
                    System.out.print("  "); // Two spaces for open paths
                }
            }
            System.out.println();
        }
    }
}
