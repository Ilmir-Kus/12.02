import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void TestTen() {
        SQRService service = new SQRService();
        int expected = 4;
        int actual = service.calcSQR(300, 450);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestNineteen() {
        SQRService service = new SQRService();
        int expected = 6;
        int actual = service.calcSQR(100, 230);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestTwentyOne() {
        SQRService service = new SQRService();
        int expected = 19;
        int actual = service.calcSQR(1_000, 2_500);
        Assertions.assertEquals(expected, actual);
    }
}
