package guru.springframework.sfgpetclinic.model;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 20/01/2022 - 14:23
 */
public class Person {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;

}
