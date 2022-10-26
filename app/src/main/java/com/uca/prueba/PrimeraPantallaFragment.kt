package com.uca.prueba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.uca.prueba.databinding.FragmentPrimeraPantallaBinding

class PrimeraPantallaFragment : Fragment() {
    private lateinit var binding:FragmentPrimeraPantallaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPrimeraPantallaBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnMulti.setOnClickListener {
            val num1 = binding.etPrimNum.text.toString().toDouble()
            val num2 = binding.etSegNum.text.toString().toDouble()
            val res = multiplicacion(num1, num2)
            binding.tvResult.setText(res.toString())
        }
    }

    fun multiplicacion(num1:Double, num2:Double):Double{
        return num1 * num2
    }


}