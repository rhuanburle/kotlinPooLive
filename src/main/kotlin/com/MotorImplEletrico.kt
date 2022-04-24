package com

class MotorImplEletrico : MotorImpl() {

    private var nivelBateria: Int = 1

    override fun temAutonomia(): Boolean {
        return nivelBateria > 0
    }

    override fun gastando() {
        println("gastando energia, nivel agora é: $nivelBateria")
        nivelBateria--
    }
}