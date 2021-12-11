package usv.edu.jrai.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import usv.edu.jrai.R
import usv.edu.jrai.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel
    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textNotifications
        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        val textView2: TextView = binding.textNotifications2
        notificationsViewModel.text2.observe(viewLifecycleOwner, Observer {
            textView2.text = it
        })
        val textView3: TextView = binding.textNotifications3
        notificationsViewModel.text3.observe(viewLifecycleOwner, Observer {
            textView3.text = it
        })
        val textView4: TextView = binding.textNotifications4
        notificationsViewModel.text4.observe(viewLifecycleOwner, Observer {
            textView4.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}