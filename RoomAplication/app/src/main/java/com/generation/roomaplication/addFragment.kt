package com.generation.roomaplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.generation.roomaplication.data.Usuario
import com.generation.roomaplication.databinding.FragmentAddBinding
import com.generation.roomaplication.databinding.FragmentListBinding

class addFragment : Fragment() {

    private lateinit var binding: FragmentAddBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddBinding.inflate(layoutInflater, container,false)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.buttonAdd.setOnClickListener {
            inserirNoBanco()

        }

        return binding.root
    }

    fun verificarCampos(nome: String, sobrenome: String, idade: String): Boolean {
        return !(nome =="" || sobrenome == "" || idade =="")
    }

    private fun inserirNoBanco() {
        val nome = binding.editNome.text.toString()
        val sobrenome = binding.editSobrenome.text.toString()
        val idade = binding.editidade.text.toString()

        if(verificarCampos(nome,sobrenome,idade)){
            val user = Usuario(0,nome,sobrenome,idade.toInt())
            mainViewModel.addUser(user)
            Toast.makeText(context, "Usuário Cadastrado!", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_addFragment_to_listFragment)
        }else{
            Toast.makeText(context, "Preencha Todos os Campos!", Toast.LENGTH_SHORT).show()
        }
    }


}