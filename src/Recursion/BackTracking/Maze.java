import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        maze[1][1] = true;
        System.out.println(maze(3, 3));
        System.out.println(mazeList("", 3, 3));
        System.out.println(mazeListDiagonal("", 3, 3));
        mazeObstacle("", maze, 0, 0);
    }

    static int maze(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int count = 0;
        int left = maze(row - 1, col);
        int right = maze(row, col - 1);
        count = left + right;
        return count;
    }

    static ArrayList<String> mazeList(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1) {
            list.addAll(mazeList(p + "V", row - 1, col));
        }
        if (col > 1) {
            list.addAll(mazeList(p + "H", row, col - 1));
        }

        return list;
    }

    static ArrayList<String> mazeListDiagonal(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1) {
            list.addAll(mazeListDiagonal(p + "V", row - 1, col));
        }
        if (col > 1) {
            list.addAll(mazeListDiagonal(p + "H", row, col - 1));
        }
        if (row > 1 && col > 1) {
            list.addAll(mazeListDiagonal(p + "D", row - 1, col - 1));
        }

        return list;
    }

    static void mazeObstacle(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (maze[row][col]) {
            return;
        }
        if (row < maze.length - 1) {
            mazeObstacle(p + "V", maze, row + 1, col);
        }
        if (col < maze.length - 1) {
            mazeObstacle(p + "H", maze, row, col + 1);
        }
    }

}
