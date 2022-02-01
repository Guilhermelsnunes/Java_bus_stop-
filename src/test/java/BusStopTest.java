import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop();
        person = new Person();
    }

    @Test
    public void canAddPassenger(){
        busStop.addPassenger(person);
        assertEquals(1, busStop.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        busStop.addPassenger(person);
        busStop.addPassenger(person);
        busStop.removePassenger();
        assertEquals(1, busStop.passengerCount());
    }

}
