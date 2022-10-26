package com.uca.prueba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.uca.prueba.databinding.FragmentSegundaPantallaBinding

class SegundaPantallaFragment : Fragment() {

    private lateinit var binding : FragmentSegundaPantallaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSegundaPantallaBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnDividir.setOnClickListener {
            val num1 = binding.etNum1.text.toString().toDouble()
            val num2 = binding.etNum2.text.toString().toDouble()
            val resp = dividir(num1, num2)
            binding.tvResult.setText(resp.toString())
        }
    }

    private fun dividir(num1: Double, num2: Double): Double {
        return num1/num2
    }
}