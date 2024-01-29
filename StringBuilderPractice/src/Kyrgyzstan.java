import java.util.Arrays;

public class Kyrgyzstan {

    private Person[]people;

    public Kyrgyzstan(Person[] people) {
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
        return "Kyrgyzstan{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}
