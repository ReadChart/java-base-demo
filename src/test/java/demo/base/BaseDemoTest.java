package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_sum_3_and_4() {
        BaseDemo baseDemo = new BaseDemo();
        assertEquals(7, baseDemo.sum(3, 4));
    }

    @Test
    public void should_return_sum_6_and_9999999(){
        BaseDemo baseDemo = new BaseDemo();
        assertEquals(10000005, baseDemo.sum(6, 9999999));
    }
}
