package usv.edu.jrai

import android.graphics.Color
import android.os.Bundle
import android.os.SystemClock.elapsedRealtime
import android.view.*
import android.widget.Chronometer
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import usv.edu.jrai.databinding.FragmentStopwatchBinding


class StopwatchFragment : Fragment() {

    private lateinit var binding: FragmentStopwatchBinding
    private lateinit var chronometer: Chronometer
    private var isRun: Boolean = false
    private var pauseOffset: Long = 0
    //private val scope: CoroutineScope

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_stopwatch, container, false)

        /** Chronometer Items **/
        binding.chronometer.format = "00:%s."
        binding.chronometer.base = elapsedRealtime()

        /** OnClick Handlers **/
        // Start button is clicked
        binding.startButton.setOnClickListener {
            startChronometer()
        }
        // Reset button is clicked
        binding.resetButton.setOnClickListener {
            resetChronometer()
        }
        // Help button is clicked
        binding.helpButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_stopwatchFragment_to_helpFragment2)
        }

        /** Chronometer Tick Listener **/
        binding.chronometer.setOnChronometerTickListener {
            if ((elapsedRealtime() - binding.chronometer.base) >= 3600000L) {
                binding.chronometer.base = elapsedRealtime()
            }
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    /** Start Chronometer Timer **/
    private fun startChronometer() {
        if (!isRun) {
            binding.chronometer.base = elapsedRealtime() - pauseOffset
            binding.chronometer.start()
            binding.startButton.text = getString(R.string.Stop)
            binding.resetButton.text = getString(R.string.Lap)
            isRun = true
        }
        else {
            binding.chronometer.stop()
            pauseOffset = elapsedRealtime() - binding.chronometer.base
            binding.startButton.text = getString(R.string.Start)
            binding.resetButton.text = getString(R.string.Reset)
            isRun = false
        }
    }

    /** Reset Chronometer Timer **/
    private fun resetChronometer() {
        val textView = TextView(context)
        if (isRun) {
            val lapTime = elapsedRealtime() - binding.chronometer.base

            // Format the lapTime
            val millisFormatted = (lapTime % 1000)
            val seconds = lapTime / 1000
            val secFormatted = (seconds % 60)
            val minutes = seconds / 60
            val minFormatted = (minutes % 60)
            val hours = minutes / 60
            val hrsFormatted = (minutes / 60)
            val timeFormatted = "$hrsFormatted:$minFormatted:$secFormatted:$millisFormatted"

            // Create a dynamic textView element
            textView.layoutParams =
                LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
            textView.gravity = Gravity.CENTER
            textView.setTextColor(Color.WHITE)
            textView.translationX = 30f
            textView.translationY = 40f
            textView.textSize = 18f
            textView.text = timeFormatted
            binding.rootLayout.addView(textView)
            //binding.rootLayout.visibility = VISIBLE
        }
        else {
            binding.chronometer.base = elapsedRealtime()
            //binding.rootLayout.visibility = GONE
            binding.rootLayout.removeAllViews()
            pauseOffset = 0
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,requireView().findNavController())
                ||super.onOptionsItemSelected(item)
    }

}



/** Vaulted Code **/
/** >>> Moved to onCreateView() <<<
override fun onClick(view: View?) {
    when (view) {
        binding.startButton -> {startChronometer()}
    }
}**/
/** >>> Moved to startChronometer() <<<
private fun pauseChronometer() {
    if (isRun) {
        binding.chronometer.stop()
        pauseOffset = elapsedRealtime() - chronometer.base
        isRun = false
    }
}**/
/**
binding.chronometer.format = "00:%s."
binding.chronometer.base = elapsedRealtime()

binding.chronometer.setOnChronometerTickListener {
    if ((elapsedRealtime() - binding.chronometer.base) >= 3600000L) {
        binding.chronometer.base = elapsedRealtime()
    }
}
**//**
private fun startChronometer() {
    if (!isRun) {
        binding.chronometer.base = elapsedRealtime() - pauseOffset
        binding.chronometer.start()
        binding.startButton.text = getString(R.string.Stop)
        isRun = true
    }
    else {
        binding.chronometer.stop()
        pauseOffset = elapsedRealtime() - binding.chronometer.base
        binding.startButton.text = getString(R.string.Start)
        isRun = false
    }
}



private fun resetChronometer() {
    binding.chronometer.base = elapsedRealtime()
    binding.resetButton.text = getString(R.string.Lap)
    pauseOffset = 0
}

private fun lapChronometer() {
    val lapTime = elapsedRealtime() - binding.chronometer.base
    val textView = TextView(context)
    textView.layoutParams =
        LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    textView.gravity = Gravity.CENTER
    textView.setTextColor(Color.WHITE)
    textView.text = lapTime.toString()
    binding.rootLayout.addView(textView)
}**//**
/** Lap Chronometer Timer **/
private fun lapChronometer() {
    if (isRun) {
        val lapTime = elapsedRealtime() - binding.chronometer.base
        val millisFormatted = (lapTime % 1000)
        val seconds = lapTime / 1000
        val secFormatted = (seconds % 60)
        val minutes = seconds / 60
        val minFormatted = (minutes % 60)
        val hours = minutes / 60
        val hrsFormatted = (minutes / 60)
        val timeFormatted = "$hrsFormatted:$minFormatted:$secFormatted:$millisFormatted"
        val textView = TextView(context)
        textView.layoutParams =
            LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        textView.gravity = Gravity.CENTER
        textView.setTextColor(Color.WHITE)
        textView.text = timeFormatted
        binding.rootLayout.addView(textView)
    }
}**//**
// Lap button is clicked
binding.lapButton.setOnClickListener {
    lapChronometer()
}**/