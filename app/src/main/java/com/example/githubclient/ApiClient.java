package com.example.githubclient;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiClient {

    @GET("repositories")
    Call<List<Repo>> getAllRepos();
}
