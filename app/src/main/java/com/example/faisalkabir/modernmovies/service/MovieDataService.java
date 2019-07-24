package com.example.faisalkabir.modernmovies.service;

import com.example.faisalkabir.modernmovies.model.MovieDBResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    @GET("movie/popular")
    Call<MovieDBResponse> getModernMovie(@Query("api_key") String apikey);
}
