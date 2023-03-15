import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.HelloWorld;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void testHelloWorld() {
        HelloWorld.main(new String[0]);
        assertEquals("Hello, World!\n", outContent.toString());
    }

}