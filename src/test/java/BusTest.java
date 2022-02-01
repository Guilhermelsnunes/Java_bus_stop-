import jdk.jfr.StackTrace;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;


    @Before
    public void before(){
        bus = new Bus("Glasgow", 4);
        busStop = new BusStop();
        busStop.addPassenger(person);
        busStop.addPassenger(person);

    }

    @Test
    public void busHasDestination(){
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void getPassengerCount(){
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1,bus.getPassengerCount());
    }

    @Test
    public void cannotAddPassengerTooFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(4, bus.getPassengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void canAddPersonFromBusStop(){
        bus.addPassengerFromBusStop(busStop);
        assertEquals(1, bus.getPassengerCount());
        assertEquals(1, busStop.passengerCount());
    }


}
