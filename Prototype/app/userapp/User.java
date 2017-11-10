package userapp;

public class User implements Prototype {

    private String firstName;

    private String lastname;

    private int age;

    public User(String firstName, String lastname, int age) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
    }

    public Object copy() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("First name: ").append(firstName);
        stringBuilder.append("\nLast name: ").append(lastname);
        stringBuilder.append("\nAge: ").append(age);
        stringBuilder.append("\nHASH CODE: ").append(hashCode());

        return stringBuilder.toString();
    }
}
