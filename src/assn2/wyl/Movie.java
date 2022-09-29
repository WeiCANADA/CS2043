package assn2.wyl;

public class Movie implements Cloneable {

    private final String title;
    private String rate;

    public Movie(String titleIn) {
        title = titleIn;
        rate = null;
    }

    public String getRate() {
        return rate;

    }

    public void setRate(double rating) {
        if (0 <= rating && rating < 6.0) {
            if (rate == null)
                rate = String.valueOf(rating);
            else {
                double d = Double.parseDouble(this.rate);

                this.rate = String.valueOf((d + rating) / 2);
            }
        }

    }

    public void clearRatings() {
        this.rate = null;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        if (rate == null)
            return title + ", Ave Rating: " + "    " + "\n";
        else
            return title + ", Ave Rating: " + rate + "\n";
    }

    public Movie clone() {
        Movie movie = null;
        try {
            movie = (Movie) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return movie;
    }


}
