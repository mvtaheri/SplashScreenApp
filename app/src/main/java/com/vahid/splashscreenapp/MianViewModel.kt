package com.vahid.splashscreenapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MianViewModel : ViewModel() {
    private val _isready = MutableStateFlow(false)
    val isReady = _isready.asStateFlow()

    init {
        viewModelScope.launch {
            delay(3000L)
            _isready.value = true
        }
    }
}