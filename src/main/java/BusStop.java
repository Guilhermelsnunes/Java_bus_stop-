import java.util.ArrayList;

public class BusStop {

    private ArrayList<Person> queue;

    public BusStop(){
        this.queue = new ArrayList<Person>();
    }


    public void addPassenger(Person person) {
        this.queue.add(person);
    }

    public int passengerCount() {
        return this.queue.size();
    }

    public Person removePassenger() {
        return this.queue.remove(0);

    }
}
