package com.uca.prueba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.uca.prueba.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {
private lateinit var binding:FragmentMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentMenuBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnMulti.setOnClickListener {
            it.findNavController().navigate(R.id.action_menuFragment_to_primeraPantallaFragment)
        }
        binding.btnDividir.setOnClickListener {
            it.findNavController().navigate(R.id.action_menuFragment_to_segundaPantallaFragment)
        }
    }

}