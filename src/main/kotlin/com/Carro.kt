package com

class Carro constructor(
    private val motor: MotorImpl
    ):  Motor by motor{

    fun anda() {
        when {
            !motor.status() -> println("Liga o carro primeiro")
            !motor.temAutonomia() -> {
                when(motor) {
                    is MotorImplEletrico -> println("tem que carregar Bateria")
                    is MotorImplCombustao -> println("Coloca combustivel!")
                }
            }
            else -> {
                motor.gastando()
                when(motor) {
                    is MotorImplEletrico -> println("Carro andando.....")
                    is MotorImplCombustao -> println("Carro andando: vruun vrruuunn!")
                }
            }
        }
    }

    fun freia() {
        println("freinando o carro")
    }

    fun buzina() {
        println("Buzinando o carro: Bii biii")
    }

}