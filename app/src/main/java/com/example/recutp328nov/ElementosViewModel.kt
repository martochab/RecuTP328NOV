package com.example.recutp328nov

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ElementosViewModel : ViewModel() {
    private val itemsLiveData = MutableLiveData<List<String>>()
    fun buscarElementos() {
        val elementos = listOf("Juan Perez", "Ramiro Montolla", "Alberto Medina", "Alberto Medina", "Alberto Medina", "Alberto Medina", "Alberto Medina", "Alberto Medina", "Alberto Medina", "Alberto Medina", "Alberto Medina", "Alberto Medina", "Alberto Medina", "Alberto Medina", "Alberto Medina", "Alberto Medina", "Alberto Medina","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez","Juan Perez")
        itemsLiveData.value = elementos
    }
    fun obtenerElementos(): LiveData<List<String>> {
        return itemsLiveData
    }
}