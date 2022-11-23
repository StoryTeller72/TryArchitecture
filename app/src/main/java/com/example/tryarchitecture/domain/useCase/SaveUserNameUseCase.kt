package com.example.tryarchitecture.domain.useCase

import android.text.BoringLayout
import com.example.tryarchitecture.domain.models.SaveUserNameParam

class SaveUserNameUseCase {

    fun execute(param: SaveUserNameParam): Boolean{
        return param.name.isNotEmpty()
    }
}