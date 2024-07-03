package mid_enrollment;

public class Book {

    private String bTitle;
    private double bPrice;
    private int bPages, bSerialNum;
    Genre g;
    productionHouse pH;

    public Book(String bTitle, double bPrice, int bPages, int bSerialNum, Genre g, productionHouse pH) {
        this.bTitle = bTitle;
        this.bPrice = bPrice;
        this.bPages = bPages;
        this.bSerialNum = bSerialNum;
        this.g = g;
        this.pH = pH;
    }

    public String getbTitle() {
        return bTitle;
    }

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }

    public double getbPrice() {
        return bPrice;
    }

    public void setbPrice(double bPrice) {
        this.bPrice = bPrice;
    }

    public int getbPages() {
        return bPages;
    }

    public void setbPages(int bPages) {
        this.bPages = bPages;
    }

    public int getbSerialNum() {
        return bSerialNum;
    }

    public void setbSerialNum(int bSerialNum) {
        this.bSerialNum = bSerialNum;
    }

    public String toString() {
        return "Book Title: " + getbTitle() + "\nBook Pages: " + getbPages() + "\nBook Price:Rs " + getbPrice() + "\nBook Serial Number: " + getbSerialNum()+ "\n" + g.toString()+ "\n" + pH.toString();
    }
}
