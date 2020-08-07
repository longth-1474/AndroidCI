package com.android.ci.data.repository.impl

import com.android.ci.data.model.Post
import com.android.ci.data.remote.ApiServiceInterface
import com.android.ci.data.repository.SampleRepository

/**
 * Implementation of repository
 */
class SampleRepositoryImpl(private val api: ApiServiceInterface) : SampleRepository {
    override suspend fun getPosts(): List<Post> = api.getPosts()
}