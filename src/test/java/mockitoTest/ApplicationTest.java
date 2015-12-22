package mockitoTest;

import org.junit.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
/**
 *
 */
public class ApplicationTest {

    @Test
    public void testGetValue() throws Exception {
        MockInterfaceImpl spy = spy(new MockInterfaceImpl());

        when(spy.getValue()).thenReturn("spied");

        Application app = new Application(spy);

        assert app.getValue().equals("spied");

    }

    @Test
    public void testGetValueWithOverride() throws Exception {
        MockInterfaceImplWithOverride spy = spy(new MockInterfaceImplWithOverride());

        when(spy.getValue()).thenReturn("spied");

        Application app = new Application(spy);

        assert app.getValue().equals("spied");


    }

    private static class MockInterfaceImpl implements DefaultedInterface {

    }

    private static class MockInterfaceImplWithOverride implements DefaultedInterface {

        @Override
        public String getValue() {
            return "default";
        }
    }
}