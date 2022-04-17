public class Movie implements Comparable<Movie>
{
    long percentRating;
    int numberWatched;
    float ratingScore;
    String name;
    int year;
   
    public Movie(long prating, int popularity, float rateScore, String string, int year)
    {
        this.percentRating = prating;
        this.numberWatched = popularity;
        this.ratingScore = rateScore;
        this.name = string;
        this.year = year;
    }
   
    public int compareTo(Movie arg0)
    {
        return (this.name.compareTo(arg0.name));
    }
   
    public String toString()
    {
        return "" + percentRating + "\t" + numberWatched + "\t" + ratingScore + "\t" + name + "\t"
                + year;
    }
}