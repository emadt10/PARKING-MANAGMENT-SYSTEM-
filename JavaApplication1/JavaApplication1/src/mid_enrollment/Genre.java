package mid_enrollment;

public class Genre {
    private String gName;

    public Genre(String gName) {
        this.gName = gName;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }
    @Override
    public String toString(){
        return "Genre: "+getgName();
    }
}
