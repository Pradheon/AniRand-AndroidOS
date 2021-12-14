package usv.edu.jrai.ui.randomanime

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
import usv.edu.jrai.databinding.FragmentRandomanimeBinding

class RandomAnimeFragment : Fragment() {

    private lateinit var randomAnimeViewModel: RandomAnimeViewModel
    private var _binding: FragmentRandomanimeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        randomAnimeViewModel =
                ViewModelProvider(this).get(RandomAnimeViewModel::class.java)

        _binding = FragmentRandomanimeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        randomAnimeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        val imageView: ImageView = binding.randomAnimeImage
        /**randomAnimeViewModel.imageView.observe(viewLifecycleOwner, Observer {
            imageView
        })**/
        binding.randomizeBtn.setOnClickListener { randomize() }
        return root
    }

    private fun randomize() {
        //randomAnimeViewModel.randomize()
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