package pro.sky.Homework18.model;

public class Employee {

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверка на null
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) obj;
        if (!this.firstName.equals(other.firstName)) {
            return false;
        }
        if (!this.lastName.equals(other.lastName)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result;
        if (firstName == null) {
            result = 0;
        } else {
            result = firstName.hashCode();
        }
        if (lastName != null) {
            result += lastName.hashCode();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Имя:" + firstName + ". Фамилия:" + lastName + ".";
    }

}
