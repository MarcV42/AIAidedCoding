import AIStuff.FoxtrotBravoCharlie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoxtrotBravoCharlieTest {

    @Test
    public void testBubbleSort() {
        int[] inputArray = {5, 2, 9, 1, 5, 6};
        int[] expectedSortedArray = {1, 2, 5, 5, 6, 9};

        FoxtrotBravoCharlie.golfHotel(inputArray);

        assertArrayEquals(expectedSortedArray, inputArray);
    }}