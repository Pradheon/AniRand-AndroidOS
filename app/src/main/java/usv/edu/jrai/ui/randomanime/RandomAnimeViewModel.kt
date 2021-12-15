package usv.edu.jrai.ui.randomanime

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomAnimeViewModel : ViewModel() {

    //lateinit var randAnimeImage : ImageView

    private val _text = MutableLiveData<String>().apply {
        value = "Anime name"
    }
    val text: LiveData<String> = _text

    /**private val _drawable = MutableLiveData<Drawable>().apply {
        value =
    }
    val imageView: LiveData<Drawable> = _drawable**/

    /**
    fun randomize() {
        randAnimeImage.setImageResource(getRandomAnime())
    }

    private fun getRandomAnime() : Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.jobless_reincarnation_part2
            2 -> R.drawable.jujutsu_kaisen0
            3 -> R.drawable.komiisan_cant_communicate
            4 -> R.drawable.platinum_end
            5 -> R.drawable.demon_slayer_mugen_train_tv
            else -> R.drawable.takt_opdestiny
        }
    }**/
}