package test;

import org.junit.Test;
import sample.Controller;

public class ControllerTest {

    @Test
    public void trimDecZeroesTest() {
        String s = Controller.trimDecZeroes("51.250");
        assert s.equals("51.25");
    }

}
