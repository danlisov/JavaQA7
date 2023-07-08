import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.JavaQA7.service.StatisticsService;

public class StatisticsServiceTest {

    @Test

    void findMaxInFirstMonth() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {7, 11, 15, 6, 4, 8, 18, 6, 14, 20, 14};
        long expected = 20;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);

    }

}
