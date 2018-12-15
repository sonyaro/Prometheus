public class Matrix {
    public static void main(String[] args) {
        int size = 5;
        int number;
        for (int i = 0; i < size; i++) {
            if (i > 0){
                System.out.println();
            }
            for (int j = 0; j < size; j++) {
                if (i == j || i == size - 1 - j){
                    System.out.print(" * ");
                }else {
                    number = i * size + j + 1;
                    if ( number < 10){
                        System.out.print(" " + number + " ");
                    }
                    else
                    System.out.print( number + " ");
                }
            }
        }
    }
}
