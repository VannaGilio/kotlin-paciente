package br.senai.sp.jandira.imc.model

import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

class Paciente {

    var nome: String = ""
    var dataNascimento: LocalDate? = null
    var peso: Int = 0
    var altura: Double = 0.0

    private fun calcularImc (): Double{
        return peso/altura.pow(2)
    }

    fun calcularIdade(): Int{

        var hoje = LocalDate.now()

        return Period.between(dataNascimento, hoje).years
    }

    private fun classificarImc():String{
        val imc = calcularImc()
        val classificacao: String

        if(imc < 18.5){
            classificacao = "abaixo do peso"
        }else if (imc >= 18.5 && imc < 25.0){
            classificacao = "peso normal"
        }else{
            classificacao = "acima do peso"
        }
            return classificacao
    }

    fun exibirDados(){
        println("------------------------------")
        println("RESULTADOS")
        println("-------------")
        println("NOME: $nome")
        println("IDADE: ${calcularIdade()}")
        println("PESO: $peso")
        println("ALTURA: $altura")
        println("IMC: ${calcularImc()}")
        println("CLASSIFICAÇÃO: ${classificarImc()}")
        println("------------------------------")
    }
}