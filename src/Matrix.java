public class Matrix {
    public static void main(String[] args) {
        int columns = 5;
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                if (i == j || i == 4 - j){
                    System.out.print("* ");
                }else {
                    System.out.print(i * columns + j + 1 + " ");
                }
            }
        }
    }
}
