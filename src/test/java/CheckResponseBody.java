import org.hamcrest.core.Is;
import org.testng.annotations.Test;

public class CheckResponseBody extends BaseTest {

    @Test
    public void checkResponseBodyTest() {
        response.then().assertThat().body("size()", Is.is(10));
    }
}
