package usv.edu.jrai.ui.animetracker

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import usv.edu.jrai.CustomExpandableListAdapter
import usv.edu.jrai.databinding.FragmentAnimetrackerBinding

class AnimeTrackerFragment : Fragment() {

    val applicationContext: Context? = null
    private lateinit var animeTrackerViewModel: AnimeTrackerViewModel
    private var _binding: FragmentAnimetrackerBinding? = null
    private var _adapter: ExpandableListAdapter? = null
    private var titleList: List<String>? = null

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

        setupExpandableListView()

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

    /** The code below was created following the tutorials below
     * Tutorial 1: https://www.tutorialspoint.com/how-to-create-a-expandable-listview-using-kotlin
     * Tutorial 2: https://tutorialwing.com/android-expandablelistview-using-kotlin-example/
     * **/
    private fun setupExpandableListView() {
        val expandableListView = binding.expandableListView
        val listData = animeTrackerViewModel.data
        titleList = ArrayList(listData.keys)
        _adapter = CustomExpandableListAdapter(requireContext(), titleList as ArrayList<String>, listData)
        expandableListView.setAdapter(_adapter)

        expandableListView.setOnGroupExpandListener { groupPosition ->
            Toast.makeText(
                requireContext(),
                (titleList as ArrayList<String>)[groupPosition] + " List Expanded.",
                Toast.LENGTH_SHORT
            ).show()
        }

        expandableListView.setOnGroupCollapseListener { groupPosition ->
            Toast.makeText(
                requireContext(),
                (titleList as ArrayList<String>)[groupPosition] + " List Collapsed.",
                Toast.LENGTH_SHORT
            ).show()
        }

        expandableListView.setOnChildClickListener { parent, v, groupPosition, childPosition, id ->
            Toast.makeText(
                requireContext(),
                "Clicked: " + (titleList as ArrayList<String>)[groupPosition] + " -> " + listData[(titleList as ArrayList<String>)[groupPosition]]!!.get(
                    childPosition
                ),
                Toast.LENGTH_SHORT
            ).show()
            false
        }
    }

}