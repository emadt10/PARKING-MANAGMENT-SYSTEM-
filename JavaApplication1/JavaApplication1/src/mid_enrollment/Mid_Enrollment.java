package mid_enrollment;

public class Mid_Enrollment {

    public static void main(String[] args) {
        Genre g1= new Genre("Fiction");
        Genre g2= new Genre("Political");
        productionHouse pH1=new productionHouse("Kawish Groups", "kawish@gmail.com", "0300-11122233", "www.kawish.com.pk");
        productionHouse pH2=new productionHouse("Alpha Bravo", "ab@gmail.com", "0345-33322233", "www.alphaBravo.com.pk");
       Book b1 = new Book("In The Line Of Fire", 500, 735, 52752, g2, pH1);
       Book b2 = new Book("Harry Potter", 1200, 1050, 52763, g1, pH2);
       Novelist bA1 = new Novelist("President House Pen", "Blunt", 7.5,"Pervez Musharraf", "Male", "0311-9115526", "musharraf@gmail.com", "musharraf.com.pk");
       Poet bA2 = new Poet("Famous Pen","Sci-Fi",9.2,"JK. Rowling", "Male", "0311-9115526", "jkR@gmail.com", "jwrowling.com.uk");
       bA1.assignBook(b1);
       bA2.assignBook(b2);
        System.out.println("---------------------------Author 1---------------------------");
        System.out.println(bA1.toString());
        bA1.displayAssignedBooks();
        System.out.println("---------------------------Author 2---------------------------");
        System.out.println(bA2.toString());
        bA2.displayAssignedBooks();
    }
}

