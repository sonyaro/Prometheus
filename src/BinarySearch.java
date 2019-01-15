public class BinarySearch {
    public static void main(String[] args) {

        int data[] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 10;

        if (numberToFind < data[0] || numberToFind > data[data.length - 1]) {
            System.out.println(-1);
        }
        int medIndex;
        int startIndex = 0;
        int endIndex = data.length - 1;
        if (numberToFind == data[startIndex]) {
            System.out.println(startIndex);
        } else if (numberToFind == data[endIndex]) {
            System.out.println(endIndex);
        } else {
            medIndex = endIndex / 2;
            int medElement = data[medIndex];

            while (numberToFind != medElement) {
                if (numberToFind < medElement) {
                    endIndex = medIndex;

                } else {
                    startIndex = medIndex;
                }
                medIndex = (endIndex - startIndex) / 2 + startIndex;
                medElement = data[medIndex];
            }
            System.out.println(medIndex);
        }


    }
}