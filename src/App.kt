import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

fun main() {

    var paciente1 = Paciente()
    paciente1.nome = "Rodrigo Garro"
    paciente1.peso = 70
    paciente1.altura = 1.74
    paciente1.dataNascimento = LocalDate.of(1998, 1, 4)
    paciente1.exibirDados()

    var paciente2 = Paciente()
    paciente2.nome = "Yuri Alberto"
    paciente2.peso = 78
    paciente2.altura = 1.82
    paciente2.dataNascimento = LocalDate.of(2001, 3, 18)
    paciente2.exibirDados()
}