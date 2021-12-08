package usv.edu.jrai.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import usv.edu.jrai.R
import usv.edu.jrai.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        val imageView: ImageView = binding.randomAnimeImage
        /**homeViewModel.imageView.observe(viewLifecycleOwner, Observer {
            imageView
        })**/
        binding.randomizeBtn.setOnClickListener { randomize() }
        return root
    }

    private fun randomize() {
        //homeViewModel.randomize()
        binding.randomAnimeImage.setImageResource(getRandomAnime())
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
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}