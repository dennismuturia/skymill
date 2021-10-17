import com.dennis.Rectangle;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void canFall() {
        int[] vals = {4, 4, 2 ,2};
        int[] commands = {1,4,1,3,2,3,2,4,1,0};
        Rectangle shape = new Rectangle(vals);
        for (int i: commands) {
            shape.canFall(i, shape.returnRectangle());
            if(i == 0){
                assertArrayEquals(new int[]{0, 1}, shape.canFall(i, shape.returnRectangle()));
            }
        }

    }
}