package usv.edu.jrai.ui.animetracker

import android.widget.ImageView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import usv.edu.jrai.R

class AnimeTrackerViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Anime"
    }
    val text: LiveData<String> = _text
}