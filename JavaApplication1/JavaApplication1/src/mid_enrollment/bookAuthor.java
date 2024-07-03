package mid_enrollment;

import java.util.ArrayList;

public class bookAuthor {

    private String aName, aGender, aContact, aEmail, aWebsite;
    ArrayList<Book> authB;

    public bookAuthor(String aName, String aGender, String aContact, String aEmail, String aWebsite) {
        this.aName = aName;
        this.aGender = aGender;
        this.aContact = aContact;
        this.aEmail = aEmail;
        this.aWebsite = aWebsite;
        authB = new ArrayList<>();
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaGender() {
        return aGender;
    }

    public void setaGender(String aGender) {
        this.aGender = aGender;
    }

    public String getaContact() {
        return aContact;
    }

    public void setaContact(String aContact) {
        this.aContact = aContact;
    }

    public String getaEmail() {
        return aEmail;
    }

    public void setaEmail(String aEmail) {
        this.aEmail = aEmail;
    }

    public String getaWebsite() {
        return aWebsite;
    }

    public void setaWebsite(String aWebsite) {
        this.aWebsite = aWebsite;
    }

    public void assignBook(Book b) {
        authB.add(b);
    }

    public void displayAssignedBooks() {

        System.out.println("-----------Book Details of Author------------");
        for (int i = 0; i < authB.size(); i++) {
            System.out.println(authB.get(i));
        }

    }

    @Override
    public String toString() {
        return "Author Name: " + getaName() + "\nAuthor Email: " + getaEmail() + "\nAuthor Contact: " + getaContact() + "\nAuthor Web Address: " + getaWebsite();
    }
}
