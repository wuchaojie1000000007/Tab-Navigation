package com.example.tabnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.tabnavigation.databinding.FragmentMoviesBinding

class MoviesFragment : Fragment() {

    private lateinit var binding: FragmentMoviesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_movies, container, false)

        binding.movieGenre.text = arguments?.getString(MOVIE_GENRE) ?: "Undefined Genre"
        return binding.root
    }

    companion object {
        private const val MOVIE_GENRE = "MOVIE_TYPE"
        fun newInstance(movieGenre: String): MoviesFragment = MoviesFragment().apply {
            arguments = Bundle().apply {
                putString(MOVIE_GENRE, movieGenre)
            }
        }

    }
}