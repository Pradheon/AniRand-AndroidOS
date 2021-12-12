package usv.edu.jrai.ui.dashboard

import android.widget.ImageView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import usv.edu.jrai.R

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Manga"
    }
    val text: LiveData<String> = _text
}