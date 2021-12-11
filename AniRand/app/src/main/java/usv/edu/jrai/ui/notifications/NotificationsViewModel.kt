package usv.edu.jrai.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Trending Now"
    }
    val text: LiveData<String> = _text

    private val _text2 = MutableLiveData<String>().apply {
        value = "Popular This Season"
    }
    val text2: LiveData<String> = _text2

    private val _text3 = MutableLiveData<String>().apply {
        value = "Upcoming Next Season"
    }
    val text3: LiveData<String> = _text3

    private val _text4 = MutableLiveData<String>().apply {
        value = "All Time Popular"
    }
    val text4: LiveData<String> = _text4
}