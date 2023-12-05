import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.untitledHome.services.CalcServices;

public class CalcServicesTest {

    @Test
    public void testCountUnderLimit() {
        CalcServices service = new CalcServices();

        int income;
        int expenses;
        int threshold;
        int expected = 0;
        int actual = service.CalcServices(income = 0, expenses = 3_000, threshold = 20_000);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCount() {
        CalcServices service = new CalcServices();

        int income;
        int expenses;
        int threshold;
        int expected = 3;
        int actual = service.CalcServices(income = 10_000, expenses = 3_000, threshold = 20_000);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountOverLimit() {
        CalcServices service = new CalcServices();

        int income;
        int expenses;
        int threshold;
        int expected = 12;
        int actual = service.CalcServices(income = 10_000, expenses = 0, threshold = 0);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountMoth() {
        CalcServices service = new CalcServices();

        int income;
        int expenses;
        int threshold;
        int expected = 2;
        int actual = service.CalcServices(income = 100_000, expenses = 60_000, threshold = 150_000);


        Assertions.assertEquals(expected, actual);
    }
}
