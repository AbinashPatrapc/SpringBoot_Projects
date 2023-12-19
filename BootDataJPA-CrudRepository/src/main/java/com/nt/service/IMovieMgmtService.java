package com.nt.service;

import java.util.Optional;

import com.nt.entity.Movie;

public interface IMovieMgmtService {
  public String registerMovie(Movie movie);
  public Optional<Movie> gatherMoviebyId(Integer mid);
}
