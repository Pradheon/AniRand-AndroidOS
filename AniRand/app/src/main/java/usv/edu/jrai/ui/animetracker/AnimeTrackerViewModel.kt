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

    /** This code segment below was created following the tutorials below
     * Tutorial 1: https://www.tutorialspoint.com/how-to-create-a-expandable-listview-using-kotlin
     * Tutorial 2: https://tutorialwing.com/android-expandablelistview-using-kotlin-example/
     * **/
    val data: HashMap<String, List<String>>
        get() {
            val listData = HashMap<String, List<String>>()

            val watching = ArrayList<String>()
            watching.add("Jobless Reincarnation: Part 2")
            watching.add("Demon Slayer: Mugen Train (TV)")
            watching.add("Jujutsu Kaisen 0")
            watching.add("Komii-san Can't Communicate")
            watching.add("Platinum End")
            watching.add("Takt op.Destiny")

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

            listData["Watching"] = watching
            listData["Completed"] = completed
            listData["Paused"] = paused
            listData["Dropped"] = dropped
            listData["Planning"] = planning

            return listData
        }

    /**
    private var watching: MutableList<String> = ArrayList()
    private var completed: MutableList<String> = ArrayList()
    private var paused: MutableList<String> = ArrayList()
    private var dropped: MutableList<String> = ArrayList()
    private var planning: MutableList<String> = ArrayList()

    private fun getData(): HashMap<String, List<String>> {
        listData["Watching"] = getWatchingList()
        listData["Completed"] = getCompletedList()
        listData["Paused"] = getPausedList()
        listData["Dropped"] = getDroppedList()
        listData["Planning"] = getPlanningList()
        return listData
    }**/

    /**
    private fun getWatchingList(): String {
        watching = mutableListOf(
            "Jobless Reincarnation: Part 2",
            "Demon Slayer: Mugen Train (TV)",
            "Jujutsu Kaisen 0",
            "Komii-san Can't Communicate",
            "Platinum End",
            "Takt op.Destiny"
        )
        return watching
    }

    private fun getCompletedList(): String {
        completed = mutableListOf(
            "Jobless Reincarnation: Part 2",
            "Demon Slayer: Mugen Train (TV)",
            "Jujutsu Kaisen 0",
            "Komii-san Can't Communicate",
            "Platinum End",
            "Takt op.Destiny"
        )
    }

    private fun getPausedList(): String {
        paused = mutableListOf(
            "Jobless Reincarnation: Part 2",
            "Demon Slayer: Mugen Train (TV)",
            "Jujutsu Kaisen 0",
            "Komii-san Can't Communicate",
            "Platinum End",
            "Takt op.Destiny"
        )
    }

    private fun getDroppedList(): String {
        dropped = mutableListOf(
            "Jobless Reincarnation: Part 2",
            "Demon Slayer: Mugen Train (TV)",
            "Jujutsu Kaisen 0",
            "Komii-san Can't Communicate",
            "Platinum End",
            "Takt op.Destiny"
        )
    }

    private fun getPlanningList(): String {
        planning = mutableListOf(
            "Jobless Reincarnation: Part 2",
            "Demon Slayer: Mugen Train (TV)",
            "Jujutsu Kaisen 0",
            "Komii-san Can't Communicate",
            "Platinum End",
            "Takt op.Destiny"
        )
    }**/
}