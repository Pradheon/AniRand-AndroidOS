package usv.edu.jrai.ui.discovery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import usv.edu.jrai.R
import usv.edu.jrai.databinding.FragmentDiscoveryBinding

class DiscoveryFragment : Fragment() {

    private lateinit var discoveryViewModel: DiscoveryViewModel
    private var _binding: FragmentDiscoveryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        discoveryViewModel =
            ViewModelProvider(this).get(DiscoveryViewModel::class.java)

        _binding = FragmentDiscoveryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textNotifications
        discoveryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        val textView2: TextView = binding.textNotifications2
        discoveryViewModel.text2.observe(viewLifecycleOwner, Observer {
            textView2.text = it
        })
        val textView3: TextView = binding.textNotifications3
        discoveryViewModel.text3.observe(viewLifecycleOwner, Observer {
            textView3.text = it
        })
        val textView4: TextView = binding.textNotifications4
        discoveryViewModel.text4.observe(viewLifecycleOwner, Observer {
            textView4.text = it
        })
        imageViewListener()
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun imageViewListener() {
        val imageView: ImageView = binding.imageView
        val imageView2: ImageView = binding.imageView2
        val imageView3: ImageView = binding.imageView3
        val imageView4: ImageView = binding.imageView4
        val imageView5: ImageView = binding.imageView5
        val imageView6: ImageView = binding.imageView6
        val imageView7: ImageView = binding.imageView7
        val imageView8: ImageView = binding.imageView8
        val imageView9: ImageView = binding.imageView9
        val imageView10: ImageView = binding.imageView10
        val imageView11: ImageView = binding.imageView11
        val imageView12: ImageView = binding.imageView12
        val imageView13: ImageView = binding.imageView13
        val imageView14: ImageView = binding.imageView14
        val imageView15: ImageView = binding.imageView15
        val imageView16: ImageView = binding.imageView16
        val imageView17: ImageView = binding.imageView17
        val imageView18: ImageView = binding.imageView18
        val imageView19: ImageView = binding.imageView19
        val imageView20: ImageView = binding.imageView20

        imageView.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView2.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView3.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView4.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView5.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView6.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView7.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView8.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView9.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView10.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView11.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView12.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView13.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView14.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView15.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView16.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView17.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView18.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView19.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
        imageView20.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_discovery_to_descriptionFragment)
        }
    }

}