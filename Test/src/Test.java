import java.util.ArrayList;

public class Test {
    private static final int MAZE_SIZE = 10;
    private static int[][] maze = { // Initial maze
            {0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 0, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 1, 1, 1, 1},
            {1, 0, 1, 1, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 1, 0, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, -1}
    };
    
    public static void main(String[] args) {
        if (findPath(0, 0)) {
            printMaze();
        } else {
            System.out.println("No path found.");
        }
    }

    public static boolean findPath(int x, int y) {
        if (x < 0 || x >= MAZE_SIZE || y < 0 || y >= MAZE_SIZE || maze[y][x] == 1 || maze[y][x] == -2) {
            return false;
        }

        if (maze[y][x] == -1) {
            return true;  // Found the exit
        }

        maze[y][x] = -2;  // Mark the cell as visited

        if (findPath(x, y - 1) || findPath(x - 1, y) || findPath(x + 1, y) || findPath(x, y + 1)) {
            return true;
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
