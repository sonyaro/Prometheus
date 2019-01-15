public class Binary_Search {
    public static int binarySearch(int[] data, int numberToFind){
        int resyltat;
        if (numberToFind < data[0] || numberToFind > data[data.length - 1]) {
            resyltat = -1;
        }else {
            int medIndex;
            int startIndex = 0;
            int endIndex = data.length - 1;
            if (numberToFind == data[startIndex]) {
                resyltat = startIndex;
            } else if (numberToFind == data[endIndex]) {
                resyltat = endIndex;
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
                resyltat = medIndex;
            }
        }
        return resyltat;
    }
}