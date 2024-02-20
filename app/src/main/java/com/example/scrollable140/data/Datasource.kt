package com.example.scrollable140.data

import com.example.scrollable140.R
import com.example.scrollable140.model.Affirmation

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable._0),
            Affirmation(R.string.affirmation2, R.drawable._2),
            Affirmation(R.string.affirmation3, R.drawable._3),
            Affirmation(R.string.affirmation4, R.drawable._4),
            Affirmation(R.string.affirmation5, R.drawable._5),
            Affirmation(R.string.affirmation6, R.drawable._6),
            Affirmation(R.string.affirmation7, R.drawable._7),
            Affirmation(R.string.affirmation8, R.drawable._8),
            Affirmation(R.string.affirmation9, R.drawable._9),
            Affirmation(R.string.affirmation10, R.drawable._10))
    }
}