package br.senai.sp.jandira.imc.model

import java.time.LocalDate
import java.time.LocalTime

class Consulta {
    private var paciente: Paciente? = null
    private var medico: Medico? = null
    private var dataConsulta: LocalDate? = null
    private var horaConsulta: LocalTime? = null
    private var valorConsulta: Double = 0.0

    fun marcarConsulta (valorConsulta: Double, medico: Medico, paciente: Paciente, dataConsulta: LocalDate, horaConsulta: LocalTime){
        if (valorConsulta < 0){
            println("O valor da consulta deve ser maior q zero!!")
        }else{
            this.valorConsulta = valorConsulta
            println("Consulta Criada com sucesso")
        }
        this.medico = medico
        this.paciente = paciente
        this.dataConsulta = dataConsulta
        this.horaConsulta = horaConsulta
    }

    fun mostrarDadosConsulta(){
        println("-------------------")
        println("DADOS DA CONSULTA: ")
        println("-------------------")
        println("MÉDICO: ${medico!!.nome}")
        println("CRM: ${medico!!.crm}")
        println("PACIENTE: ${paciente!!.nome}")
        println("DATA: ${dataConsulta!!.dayOfWeek}")

    }

}