package mid_enrollment;

public class Poet extends bookAuthor{
    private String pName, wStyle;
    private double rating;

    public Poet(String pName, String wStyle, double rating, String aName, String aGender, String aContact, String aEmail, String aWebsite) {
        super(aName, aGender, aContact, aEmail, aWebsite);
        this.pName = pName;
        this.wStyle = wStyle;
        this.rating = rating;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getwStyle() {
        return wStyle;
    }

    public void setwStyle(String wStyle) {
        this.wStyle = wStyle;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public String toString(){
        System.out.println(super.toString());
        return "Author Pen Name: "+getpName()+"\nWriting Style: "+getwStyle()+"\nAuthor Rating: "+getRating();
    }
}
