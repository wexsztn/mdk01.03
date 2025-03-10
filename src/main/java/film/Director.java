package film;

public class Director {
    private String name;
    private int code;
    private int rating;

    public Director(String name, int code, int rating) {
        this.name = name;
        this.code = code;
        this.rating = rating;
    }

    public Director(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
