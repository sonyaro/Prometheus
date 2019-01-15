import org.junit.BeforeClass;
import org.junit.Test;

import static java.util.Arrays.binarySearch;

public class BinarySearchTest {

    public static int[] data;

    @BeforeClass
    public static void testArray(){
        int minLength = 5;
        int maxLength = 100;
        int maxInc =20;
        int length = (int)(5 + Math.random() * 95);
        data = new int[length];
        data [0] =  (int) (Math.random()* 10);
        for (int i = 1; i < length ; i++) {
            data[i] = data[i-1] + ((int)(Math.random() * maxInc)) ;
        }
    }

    @Test
    public void testBsearch() {

        int index = (int)(Math.random() * data.length);
        int gurlamurla = binarySearch(data, data[index]);
        assert (index == gurlamurla);
    }

}
