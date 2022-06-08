package com.generation.apptodo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.apptodo.adapter.TarefaAdapter
import com.generation.apptodo.databinding.FragmentListBinding
import com.generation.apptodo.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container,false)

        val listTarefas = listOf(
            Tarefa(
                "Lavar a Louça",
                "Lava toda a louça do dia",
                "Maicon",
                "2022-06-07",
                false,
                "Doméstico"
            ),
            Tarefa(
                "Levar o cachorro passear",
                "Esperar ele fazer todas as necessidades",
                "Maicon",
                "2022-06-07",
                false,
                "Doméstico"
            ),
            Tarefa(
                "Corujão com os Amiges",
                "Madrugar e se divertir",
                "Maicon",
                "2022-06-07",
                false,
                "Lazer"
            )

        )

        //Configuração do RecyclerView

        val adapter = TarefaAdapter()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        adapter.setlist(listTarefas)

        binding.floatingAdd.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        return binding.root
    }
}


