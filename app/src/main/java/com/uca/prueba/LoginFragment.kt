package com.uca.prueba

import android.opengl.Visibility
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.uca.prueba.databinding.FragmentLoginBinding
import kotlin.time.Duration.Companion.seconds


class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)

        return binding.root
    }

    fun verifPw(pw: String): Boolean {
        if (pw.equals("Marcelo")) {
            return true
        }
        return false
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        binding.btnLogin.setOnClickListener() {
            val pw = binding.etLogin.text.toString()
            if (verifPw(pw)) {
                it.findNavController().navigate(R.id.action_loginFragment_to_menuFragment)
                binding.etLogin.setText("")
                binding.tvError.setText("")
            } else {
                binding.tvError.setText("Error")
            }


        }
    }
}