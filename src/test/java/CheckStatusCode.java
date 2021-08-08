import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckStatusCode extends BaseTest {

    @Test
    public void StatusCodeTest() {
       Assert.assertEquals(response.getStatusCode(), 200, "Status code is not 200");
    }
}
