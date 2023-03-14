package com.example.datafromfragmenttofragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.datafromfragmenttofragment.databinding.FragmentOneBinding

class OneFragment : Fragment() {
    lateinit var binding: FragmentOneBinding
    private val dataModel: DataModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOneBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnSendToFragmentTwo.setOnClickListener {
            dataModel.messageForFragmentTwo.value = (100..999).random().toString()
        }
        dataModel.messageForFragmentOne.observe(activity as LifecycleOwner, {
            binding.txtViewOne.text = it
        })
    }

    companion object {
        @JvmStatic
        fun newInstance() = OneFragment()
    }
}