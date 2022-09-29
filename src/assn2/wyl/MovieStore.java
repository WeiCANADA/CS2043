package assn2.wyl;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MovieStore {
	private TreeSet<Movie> movies;

	public MovieStore() {
		movies = new TreeSet<>((o1, o2) -> o2.getTitle().compareTo(o1.getTitle()));
	}

	public boolean add(Movie newMovie) {
		return movies.add(newMovie);
	}

	public List<Movie> deepCopy() {

		ArrayList<Movie> copy = new ArrayList<>();
		for (Movie movie : movies
		) {
			copy.add(movie.clone());
			//System.out.println(movie.hashCode() == copy.hashCode() ); //false
		}
		return copy;
	}

	public List<Movie> topRated(int n) {

		List<Movie> mList = deepCopy();

		mList.sort((m1, m2) -> {
			int i1 = 0;
			int i2 = 0;
			String rate1 = m1.getRate();
			String rate2 = m2.getRate();
			if (rate1 != null)
				i1 = (int) Double.parseDouble(rate1);
			if (rate2 != null)
				i2 = (int) Double.parseDouble(rate2);
			return i2 - i1;
		});

		int size = movies.size();
		if (size <= n)
			return mList;
		else {
			return mList.subList(0, n);
		}
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		for (Movie movie : movies) {
			System.out.println(movie.hashCode());
			string.append(movie.toString());
		}

		return "All MovieStore - " + movies.size() + " in total:" + "\n" + string;
	}
}
