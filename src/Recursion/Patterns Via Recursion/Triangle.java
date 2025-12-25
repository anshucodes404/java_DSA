public class Triangle {
    public static void main(String[] args) {
        // int b = 3;
        // triangle2(0, 0, b);
        triangle2(5, 0);
        triangle3(5, 0);
    }

    // static void triangle(int row, int col) {
    // if (row == 0) {
    // return;
    // }
    // if (col < row) {
    // System.out.print("* ");
    // triangle(row, col + 1);
    // } else {
    // System.out.println();
    // triangle(row - 1, 0);
    // }
    // }

    static void triangle2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("* ");
            triangle2(row, col + 1);
        } else {
            System.out.println();
            triangle2(row - 1, 0);
        }
    }

    static void triangle3(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            triangle3(row, col + 1);
            System.out.print("* ");
        } else {
            triangle3(row - 1, 0);
            System.out.println();
        }
    }
}