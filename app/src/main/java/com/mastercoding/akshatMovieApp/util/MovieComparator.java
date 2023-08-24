package com.mastercoding.akshatMovieApp.util;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.mastercoding.akshatMovieApp.model.Movie;

public class MovieComparator extends DiffUtil.ItemCallback<Movie> {
    @Override
    public boolean areItemsTheSame(@NonNull Movie oldItem, @NonNull Movie newItem) {
        return oldItem.getId() == newItem.getId();
    }

    @Override
    public boolean areContentsTheSame(@NonNull Movie oldItem, @NonNull Movie newItem) {
        return oldItem.getId() == newItem.getId();
    }
}
