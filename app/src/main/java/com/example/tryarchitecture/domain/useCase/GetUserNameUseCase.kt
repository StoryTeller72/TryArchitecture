package com.example.tryarchitecture.domain.useCase

import com.example.tryarchitecture.domain.models.Username

class GetUserNameUseCase {

    fun execute(): Username{
        return Username(firstName = "Artem", lastName = "Ejikeev")
    }
}