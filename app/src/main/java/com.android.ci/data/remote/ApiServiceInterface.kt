package com.android.ci.data.remote

import com.android.ci.data.model.Post
import retrofit2.http.GET

/**
 * Interface apiService for declare api endpoint
 */
interface ApiServiceInterface {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}
