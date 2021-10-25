package com.keltoncumbe.challenge.witweather_android.views.viewmodel.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.keltoncumbe.challenge.witweather_android.utils.Preferences
import com.keltoncumbe.challenge.witweather_android.views.viewmodel.MainVM

@Suppress("EMPTY_CAST")
class MainFactory (private val rolePreferences: Preferences) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainVM::class.java)) {
            return MainVM(rolePreferences) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}