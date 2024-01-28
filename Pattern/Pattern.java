package Pattern;

public class Pattern {
    public static void main(String[] args) {
        /*int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0 && j % 2 == 1) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }*/


        int rows = 10;
        int cols = 10;

        int[][] binaryMatrix = generateBinaryRectangularPattern(rows, cols);

        for (int[] row : binaryMatrix) {
            for (int value : row) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static int[][] generateBinaryRectangularPattern(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int layer = 0; layer < Math.min(rows, cols) / 2 + Math.min(rows, cols) % 2; layer++) {
            int value = (layer % 2 == 0) ? 1 : 0;
            int lastRow = rows - 1 - layer;
            int lastCol = cols - 1 - layer;

            for (int col = layer; col <= lastCol; col++) {
                matrix[layer][col] = value;
                matrix[lastRow][col] = value;
            }
            for (int row = layer + 1; row < lastRow; row++) {
                matrix[row][layer] = value;
                matrix[row][lastCol] = value;
            }
        }

        return matrix;

    }
}
