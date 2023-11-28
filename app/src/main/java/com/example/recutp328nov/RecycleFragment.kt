package com.example.recutp328nov

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecycleFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: ElementosViewModel
    private lateinit var adaptador: Adapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recycle, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)

        //val itemsList = listOf("Item 1", "Item 2", "Item 3") // Puedes obtener estos datos desde ViewModel

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        //adaptador = Adapter(itemsList)
        //recyclerView.adapter = adaptador

        viewModel = ViewModelProvider(this).get(ElementosViewModel::class.java)

        viewModel.obtenerElementos().observe(viewLifecycleOwner) { items ->
            adaptador = Adapter(items)
            recyclerView.adapter = adaptador
        }
        viewModel.buscarElementos()

        return view
    }
}