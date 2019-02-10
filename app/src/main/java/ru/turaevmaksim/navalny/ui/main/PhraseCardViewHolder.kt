package ru.turaevmaksim.navalny.ui.main

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_card.view.*
import ru.turaevmaksim.navalny.ui.main.data.Phrase

class PhraseCardViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val tvAnimalType = view.phrase_text

    fun bindTo(phrase: Phrase) {
        tvAnimalType.text = phrase.name
    }
}