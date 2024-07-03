package mid_enrollment;

public class productionHouse {
public String pName, pEmail, pContact, pWebAdress;

    public productionHouse(String pName, String pEmail, String pContact, String pWebAdress) {
        this.pName = pName;
        this.pEmail = pEmail;
        this.pContact = pContact;
        this.pWebAdress = pWebAdress;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpEmail() {
        return pEmail;
    }

    public void setpEmail(String pEmail) {
        this.pEmail = pEmail;
    }

    public String getpContact() {
        return pContact;
    }

    public void setpContact(String pContact) {
        this.pContact = pContact;
    }

    public String getpWebAdress() {
        return pWebAdress;
    }

    public void setpWebAdress(String pWebAdress) {
        this.pWebAdress = pWebAdress;
    }
@Override
    public String toString()
    {
        return "Production House Details: \n"
                + "Name: "+getpName()+"    Contact: "+getpContact()+"     Email and Web Address: "+getpEmail()+"  "+getpWebAdress();
    }
}