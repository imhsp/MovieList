package com.himansh.movielist.data.remote

import com.himansh.movielist.data.model.MovieObject
import com.himansh.movielist.data.model.SearchObject
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface RepoService {

    @GET("/")
    fun getMoviesList(@Query("s") searchText: String, @Query("apikey") apiKey: String): Observable<SearchObject>

    @GET("/")
    fun getMovieDetail(@Query("i") movieId: String, @Query("apikey") apiKey: String): Observable<MovieObject>

}