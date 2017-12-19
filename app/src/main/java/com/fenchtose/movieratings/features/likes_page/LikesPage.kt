package com.fenchtose.movieratings.features.likes_page

import com.fenchtose.movieratings.model.Movie

interface LikesPage {
    fun setData(movies: ArrayList<Movie>)
    fun showRemoved(movie: Movie, index: Int)
    fun showAdded(movie: Movie, index: Int)
}