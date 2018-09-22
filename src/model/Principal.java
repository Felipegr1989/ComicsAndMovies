package model;

import java.util.ArrayList;

public class Principal {

	private ArrayList<Movies> movies;
	private ArrayList<Comic> comics;

	public Principal() {

		movies = new ArrayList<Movies>();
		comics = new ArrayList<Comic>();
	}

	public ArrayList<Movies> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<Movies> movies) {
		this.movies = movies;
	}

	public ArrayList<Comic> getComics() {
		return comics;
	}

	public void setComics(ArrayList<Comic> comics) {
		this.comics = comics;
	}

	public boolean searchComic(String name) {

		boolean findName = false;

		for (int i = 0; i < comics.size() && !findName; i++) {
			Comic c = comics.get(i);

			if (c.getName().equalsIgnoreCase(name)) {
				findName = true;
			}
		}

		return findName;

	}

}
