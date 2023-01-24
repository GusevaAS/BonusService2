import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void testCalcBonus(int amount, boolean registered, int expected) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);
//        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
}