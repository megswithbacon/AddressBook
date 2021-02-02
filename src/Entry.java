public class Entry {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;

    public Entry(String firstName, String lastName, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String newLastName){
        lastName = newLastName;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(int newPhoneNumber){
        phoneNumber = newPhoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail){
        email= newEmail;
    }

}
