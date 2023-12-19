package com.nt.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Movie;
import com.nt.service.IMovieMgmtService;
@Component
public class CurdRepoTestRunner implements CommandLineRunner {
    @Autowired
    private IMovieMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		Movie movie=new Movie();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Movie Name: ");
		movie.setMname(sc.nextLine());
		System.out.println("Enter Movie Released Year: ");
		movie.setmYear(sc.nextLine());
		System.out.println("Enter Movie Rating: ");
		movie.setRating(sc.nextFloat());
		System.out.println("This is Runner Class");
		
		try {
			System.out.println(service.registerMovie(movie));
			System.out.println("Enter Movie Id: ");
			System.out.println(service.gatherMoviebyId(sc.nextInt()));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
