package com.chainsys.classmethods;

public class Movie {
	
		private final String MovieName;
		private int ReleaseDate;
		private String Director;
		private String HeroName;
		public Movie(String MovieName)
		{
		        this.MovieName=MovieName;
		}
		public String getMovieName() {
		        return MovieName;
		}
		public int getReleaseDate() {
		        return ReleaseDate;
		}
		public void setReleaseDate(int ReleaseDate) {
		        this.ReleaseDate = ReleaseDate;
		}
		public String getDirector() {
		        return Director;
		}
		public void setDirector(String Director) {
		       this.Director = Director;
		}
		public String getHeroName() {
		        return HeroName;
		}
		public void setHeroName(String HeroName) {
		        this.HeroName = HeroName;
		}

}
