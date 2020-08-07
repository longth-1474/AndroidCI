package com.android.ci.data.repository

import com.android.ci.data.model.Post

/**
 * Main entry point for accessing data.
 */
interface SampleRepository {
    suspend fun getPosts(): List<Post>
}
