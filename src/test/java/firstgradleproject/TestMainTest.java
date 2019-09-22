package firstgradleproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestMainTest {
    @Mock TestMain testMain;
    
	@Test public void testGetWelcomeMsg() {
		TestMain testMain = new TestMain();
		assertEquals("first gradle project", testMain.getWelcomeMsg());
	}
}
