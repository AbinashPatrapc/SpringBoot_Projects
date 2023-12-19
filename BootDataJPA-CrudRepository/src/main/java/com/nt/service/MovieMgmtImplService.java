package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repository.IMovieRepo;
@Service("movieservice")
public class MovieMgmtImplService implements IMovieMgmtService {
   @Autowired
	private IMovieRepo movierepo;
	
	@Override
	public String registerMovie(Movie movie) {
		Movie m1=movierepo.save(movie);
		return "Movie Registered With ID: "+m1.getMid();
	}

	@Override
	public Optional<Movie> gatherMoviebyId(Integer mid) {
		Optional<Movie> opt=movierepo.findById(mid);
		return opt.isEmpty()?Optional.empty():opt;
	}

}