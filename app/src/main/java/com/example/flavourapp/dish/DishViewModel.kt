package com.example.flavourapp.dish

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DishViewModel : ViewModel() {

    private val repository = DishRepository()

    private val _dishesByCategory = MutableLiveData<List<DishModel>>()
    val dishesByCategory: LiveData<List<DishModel>> get() = _dishesByCategory

    fun loadDishesByCategory(category: DishCategory) {
        _dishesByCategory.value = repository.getDishesByCategory(category)
    }
}