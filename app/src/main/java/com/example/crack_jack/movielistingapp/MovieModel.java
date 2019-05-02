package com.example.crack_jack.movielistingapp;


public class MovieModel {

    String movieName, releaseDate, ImageURI, movieId, rating;

    public MovieModel() {

    }

    public MovieModel(String movieName, String id,String releaseDate, String ImageURI, String rating) {

        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.ImageURI = ImageURI;
        this.rating = rating;
        this.movieId = id;

    }
}
