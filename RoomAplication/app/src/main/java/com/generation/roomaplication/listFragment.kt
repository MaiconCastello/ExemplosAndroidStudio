package com.generation.roomaplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.generation.roomaplication.databinding.ActivityMainBinding
import com.generation.roomaplication.databinding.FragmentListBinding


class listFragment : Fragment() {

    private lateinit var binding: FragmentListBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container,false)

        binding.floatingActionButton.setOnClickListener {
            //inserirNoBanco()
        }

        return binding.root
    }

    fun verificarCampos(nome: String, sobrenome: String, idade: String): Boolean {
        return !(nome =="" || sobrenome == "" || idade =="")
    }

    fun inserirNoBanco() {
        val nome =
    }



}