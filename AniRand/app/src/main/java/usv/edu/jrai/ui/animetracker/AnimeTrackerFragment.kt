package usv.edu.jrai.ui.animetracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import usv.edu.jrai.R
import usv.edu.jrai.databinding.FragmentAnimetrackerBinding
import usv.edu.jrai.databinding.FragmentDashboardBinding
import usv.edu.jrai.ui.dashboard.DashboardViewModel

class AnimeTrackerFragment : Fragment() {

    private lateinit var animeTrackerViewModel: AnimeTrackerViewModel
    private var _binding: FragmentAnimetrackerBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        animeTrackerViewModel =
                ViewModelProvider(this).get(AnimeTrackerViewModel::class.java)

        _binding = FragmentAnimetrackerBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAnimeTracker
        animeTrackerViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}