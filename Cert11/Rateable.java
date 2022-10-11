package Cert11;

@FunctionalInterface
public interface Rateable<Z> {
        
    Rating DEFAULT_RATING = Rating.NOT_RATED;

        Z applyRating(Rating rating);

        default Z applyRating(int stars){
            return applyRating(Rateable.convert(stars));
        }
    
        default Rating getRating(){
            return DEFAULT_RATING;
        } 
    
        static Rating convert(int stars){
            return (stars >= 0 && stars <= 5) ? Rating.values()[stars]: DEFAULT_RATING;
        }
}
