import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AClassWithOneJUnitTest {

    @Test
    @DisplayName("first test to see in Jenkins")
    void demoTestMethod() {
        assertTrue(true);
    }
    @Test
    @DisplayName("second test to see in Jenkins")
    void demoTestMethod2() {
        assertTrue(false,"wrong numbers");
    }
}