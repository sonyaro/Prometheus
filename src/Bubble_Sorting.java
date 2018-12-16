public class Bubble_Sorting {
    public static void main(String[] args) {
        int[] array = {25,234,567,45,68,36,86766,47};
        int length = array.length;
        int kjkj = 0;
        for (int j = 0; j < length - 1 ; j++) {
            for (int i = length - 1; i > 0 ; i--) {
                if (array[i] < array[i - 1]){
                    int swittch = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = swittch;
                    kjkj++;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
