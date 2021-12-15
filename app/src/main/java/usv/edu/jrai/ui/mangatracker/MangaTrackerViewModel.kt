package usv.edu.jrai.ui.mangatracker

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MangaTrackerViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Manga"
    }
    val text: LiveData<String> = _text

    /** This code segment below was created following the tutorials below
     * Tutorial 1: https://www.tutorialspoint.com/how-to-create-a-expandable-listview-using-kotlin
     * Tutorial 2: https://tutorialwing.com/android-expandablelistview-using-kotlin-example/
     * **/
    val data: HashMap<String, List<String>>
        get() {
            val listData = HashMap<String, List<String>>()

            val reading = ArrayList<String>()
            reading.add("Jobless Reincarnation: Part 2")
            reading.add("Demon Slayer: Mugen Train (TV)")
            reading.add("Jujutsu Kaisen 0")
            reading.add("Komii-san Can't Communicate")
            reading.add("Platinum End")
            reading.add("Takt op.Destiny")

            val completed = ArrayList<String>()
            completed.add("Jobless Reincarnation: Part 2")
            completed.add("Demon Slayer: Mugen Train (TV)")
            completed.add("Jujutsu Kaisen 0")
            completed.add("Komii-san Can't Communicate")
            completed.add("Platinum End")
            completed.add("Takt op.Destiny")

            val paused = ArrayList<String>()
            paused.add("Jobless Reincarnation: Part 2")
            paused.add("Demon Slayer: Mugen Train (TV)")
            paused.add("Jujutsu Kaisen 0")
            paused.add("Komii-san Can't Communicate")
            paused.add("Platinum End")
            paused.add("Takt op.Destiny")

            val dropped = ArrayList<String>()
            dropped.add("Jobless Reincarnation: Part 2")
            dropped.add("Demon Slayer: Mugen Train (TV)")
            dropped.add("Jujutsu Kaisen 0")
            dropped.add("Komii-san Can't Communicate")
            dropped.add("Platinum End")
            dropped.add("Takt op.Destiny")

            val planning = ArrayList<String>()
            planning.add("Jobless Reincarnation: Part 2")
            planning.add("Demon Slayer: Mugen Train (TV)")
            planning.add("Jujutsu Kaisen 0")
            planning.add("Komii-san Can't Communicate")
            planning.add("Platinum End")
            planning.add("Takt op.Destiny")

            listData["Watching"] = reading
            listData["Completed"] = completed
            listData["Paused"] = paused
            listData["Dropped"] = dropped
            listData["Planning"] = planning

            return listData
        }
}