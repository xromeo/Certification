package Cert11;

public class Review {
    private Rating rating;
    private String comments;

    

    public Rating getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }

    public Review(Rating rating, String comments) {
        this.rating = rating;
        this.comments = comments;
    }

}
