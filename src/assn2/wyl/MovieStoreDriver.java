package assn2.wyl;

import java.util.List;

public class MovieStoreDriver {

    public static void main(String[] args) {
        MovieStore ms = new MovieStore();

        Movie m4 = new Movie("Star Wars");
        m4.setRate(4);
        ms.add(m4);

        Movie m0 = new Movie("Star trek");
        ms.add(m0);
        m0.setRate(2);

        Movie m1 = new Movie("A Few Good Men");
        ms.add(m1);

        Movie m2 = new Movie("Enders Game");
        m2.setRate(5);
        ms.add(m2);

        Movie m3 = new Movie("Star trek");
        ms.add(m3);
        System.out.println(ms);


        int top = 2;
        List<Movie> topRated = ms.topRated(top);

        System.out.println("Top " + top + "Rated Movies: \n");
        for (Movie movie : topRated) {
            System.out.print(movie);
        }

    }

}
