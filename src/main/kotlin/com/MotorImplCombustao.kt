package com

class MotorImplCombustao : MotorImpl() {

     private var nivelCombustivel: Int = 2

     override fun gastando() {
          println("gastando combustivel, nivel agora é: $nivelCombustivel")
          nivelCombustivel--
     }

     override fun temAutonomia(): Boolean {
          return nivelCombustivel > 0
     }

}
