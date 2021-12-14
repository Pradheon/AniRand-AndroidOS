package usv.edu.jrai.ui.description

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import usv.edu.jrai.R
import usv.edu.jrai.databinding.FragmentDescriptionBinding

class DescriptionFragment : Fragment() {

    private lateinit var descriptionViewModel: DescriptionViewModel
    private var _binding: FragmentDescriptionBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        descriptionViewModel =
            ViewModelProvider(this).get(DescriptionViewModel::class.java)

        _binding = FragmentDescriptionBinding.inflate(inflater, container, false)
        val root: View = binding.root

        /**
        val spinnerStatus: Spinner = binding.statusSpinner
        val statusArray: Array<String> = binding.
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.planets_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            statusSpinner.adapter = adapter
        }**/


        val textView: TextView = binding.textDescription
        descriptionViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}