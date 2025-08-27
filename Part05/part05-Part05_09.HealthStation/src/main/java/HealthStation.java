
import java.util.Set;


public class HealthStation {
    private int weighings;
    
    public HealthStation(int count) {
        weighings = count;
    }
    
    public HealthStation() {
        this(0);
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return weighings;
    }
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighings++;
        return person.getWeight();
    }

}
