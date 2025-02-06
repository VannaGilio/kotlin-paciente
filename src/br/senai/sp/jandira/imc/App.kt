package br.senai.sp.jandira.imc

import br.senai.sp.jandira.imc.model.Consulta
import br.senai.sp.jandira.imc.model.Medico
import br.senai.sp.jandira.imc.model.Paciente
import java.time.LocalDate
import java.time.LocalTime

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

    // Criar lista de frutas
    var frutas = ArrayList<String>()
    frutas.add("Banana")
    frutas.add("Melancia")
    frutas.add("Manga")
    frutas.add("Amora")

    var medico1 = Medico()
    medico1.nome = "Luiz Cangaceiro"
    medico1.crm = "234512-4"
    medico1.especialidades .add ("psiquiatra")
    medico1.especialidades .add ("clinico")
    medico1.especialidades .add ("terapeuta")
    medico1.exibirFichadoMedico()

    var consulta1 = Consulta()
    consulta1.marcarConsulta(
        valorConsulta = 900.0,
        medico1,
        paciente1,
        LocalDate.of(2025, 7, 31),
        LocalTime.of(14, 30, 0, 0)
    )
    consulta1.mostrarDadosConsulta()

    //println(frutas.count()) -> contar quantidade de atributos no array
//    println(frutas.size)
//
//    println(frutas[1])
//    println(frutas[2])
//    frutas[2] = "guedes"
//    println(frutas[2])
//    println(frutas)

//    var contador = 1
//    while(contador <=10){
//        println("$contador - Guedes")
//    contador++
//    }
    //ELE SABE POR OS OVOS SEM DEIXAR O GOSTO

//    var i = 0
//    while (i < frutas.count()){
//        i++
//        println("$i - ${frutas[i]}")
//    }

//    for (voltas in 1..100 step 3){
//        println("$voltas - SESI")
//    }

//    for (fruta in frutas){
//        println(fruta)
//    }

}