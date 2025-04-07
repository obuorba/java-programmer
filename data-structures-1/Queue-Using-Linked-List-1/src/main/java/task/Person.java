package task;

public class Person {

    public static final String DEFAULT_NAME = "Batman";

    private int age = 0;
    private String firstName = DEFAULT_NAME;
    private String lastName = DEFAULT_NAME;

    public Person(int age) {
        this.age = age;
    }

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(obj instanceof Person) {
            Person other = (Person)obj;
            return (this.age == other.age)
                    && this.firstName.equals(other.firstName)
                    && this.lastName.equals(other.lastName);
        } else {
            return false;
        }
    }
}
