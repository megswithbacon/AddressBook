public class Entry {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    private Entry(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static Entry createNewEntry(String firstName, String lastName, String phoneNumber, String email){
        return new Entry(firstName, lastName, phoneNumber, email);
    }

    public static Entry createBlankEntry(){
        return new Entry("","", "", "");
    }

    @Override
    public String toString() {
        return "************************************" + '\n' +
                "First Name= " + firstName + '\n' +
                "Last Name = " + lastName + '\n' +
                "Phone Number = " + phoneNumber + '\n' +
                "Email = " + email + '\n' +
                "************************************" + '\n';
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String newLastName){
        lastName = newLastName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String newPhoneNumber){
        phoneNumber = newPhoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail){
        email= newEmail;
    }
}
