package com.chainsys.unittest;

import com.chainsys.classmethods.Movie;

public class MovieTest {
	public static void MovieTest()
	{
		Movie LastMovie=new Movie("MASTER");
		LastMovie.setReleaseDate(13032021);
		LastMovie.setDirector("Lokesh");
		LastMovie.setHeroName("Vijay");
		System.out.print("MovieName : ");
		System.out.println(LastMovie.getMovieName());
		System.out.print("ReleaseDate : ");
		System.out.println(LastMovie.getReleaseDate());
		System.out.print("Director : ");
		System.out.println(LastMovie.getDirector());
		System.out.print("HeroName : ");
		System.out.println(LastMovie.getHeroName());
		
	}
}
