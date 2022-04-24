import com.Carro
import com.MotorImplCombustao
import com.MotorImplEletrico

fun main() {

    val motorCombustao = MotorImplCombustao()
    val fuca = Carro(motorCombustao)
    fuca.ligar()
    fuca.anda()

    val motorEletrico = MotorImplEletrico()
    val tesla = Carro(motorEletrico)
    tesla.ligar()
    tesla.anda()
}