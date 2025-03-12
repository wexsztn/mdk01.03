package film;

public class Film {
    private String name;
    private Director director;
    private int code;
    private int rating;

    public Film(String name, Director director, int code, int rating) {
        this.name = name;
        this.director = director;
        this.code = code;
        this.rating = rating;
    }

    public Film(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
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
