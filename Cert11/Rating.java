package Cert11;

public enum Rating {
    NOT_RATED(0),
    ONE(1),
    TWO(2),
    THREEE(1),
    FOUR(2),
    FIVE(5);

    int stars;

    private Rating(int stars) {
        this.stars = stars;
    }

    int getStars(){
        return stars;
    }
}
