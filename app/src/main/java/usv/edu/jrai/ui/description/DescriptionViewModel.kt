package usv.edu.jrai.ui.description

import android.widget.ImageView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import usv.edu.jrai.R

class DescriptionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Mushoku Tensei: Jobless Reincarnation Part 2"
    }
    val text: LiveData<String> = _text
}