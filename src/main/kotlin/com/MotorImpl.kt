package com

abstract class MotorImpl : Motor {
    private var ligado: Boolean = false

    override fun ligar() {
        ligado = true
    }

    override fun desligar() {
        ligado = false
    }

    fun status(): Boolean {
        return ligado
    }

    abstract fun temAutonomia(): Boolean

    abstract fun gastando()
}