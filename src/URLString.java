import java.lang.reflect.Array;

public class URLString {
    public static void main(String[] args) {
        String str = "https://metanit.com/java/tutorial?start=4&end=8";
        printArray(getParamFromURL(str));
    }

    private static void printArray(String[] printArray) {

        for (int i = 0; i < printArray.length; i++) {

            String element = printArray[i];

            element = element.substring(0,element.indexOf('='));

            System.out.println( element);

        }
    }

    private static String[] getParamFromURL(String url) {
        String substring = url.substring(url.indexOf('?') + 1);
        String[] words = substring.split("&");
        return words;
    }
}
