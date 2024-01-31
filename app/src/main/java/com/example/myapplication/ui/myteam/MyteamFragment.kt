package com.example.myapplication.ui.myteam

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentHomeBinding
import com.example.myapplication.databinding.FragmentMyteamBinding
import com.example.myapplication.ui.home.HomeViewModel

class MyteamFragment : Fragment() {

    private var _binding: FragmentMyteamBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val myteamViewModel =
            ViewModelProvider(this).get(MyteamViewModel::class.java)

        _binding = FragmentMyteamBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMyteam
        myteamViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}