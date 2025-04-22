// by default, all Java classes belong to a package
// a package is basically folder. When a class is public
// other packages can "see it" and "use it"
public class Customer {
    // Data that belongs to a class instance is USUALLY private because of encapsulation
    private String firstName;
    private String lastName;
    private String email;

    // constructors: are special methods
    // make sure the name of the constructor matches that of the class
    // the default constructor has no parameters, therefore 'default'
    public Customer() {
        firstName = "N/A";
        lastName="N/A";
        email = "N/A";
    }

    // the overloaded constructors have parameters
    public Customer(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    // it's possible to have more than one overloaded constructor
    public Customer(String email) {
        setEmail(email);
        firstName = "N/A";
        lastName = "N/A";
    }

    public void setEmail(String newEmailAddress) {
        // cannot be empty string
        // must includes at least one "@" and one "."
        if (newEmailAddress.length() > 0 && newEmailAddress.indexOf('@') > -1 && newEmailAddress.indexOf('.') > -1) {
            email = newEmailAddress;
        }
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 3) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 3) {
            this.lastName = lastName;
        }
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static void main(String args[]) {
        Customer c = new Customer("Mary", "Sue", "mary@gmail.com");
        Customer c1 = new Customer("peter@asd.com");
    }

}