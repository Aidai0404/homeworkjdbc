import java.util.Arrays;

public class Russia {

    private  Person[]people;

    public Russia(Person[] people) {
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Russia{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}
