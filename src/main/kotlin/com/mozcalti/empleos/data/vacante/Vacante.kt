package com.mozcalti.empleos.data.vacante

import com.mozcalti.empleos.data.estado.Estado
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "vacante")
data class Vacante(

    @Id val id: UUID,
    val perfil: String,
    val descripcionVacante: String,
    val categoria: String,
    val horarioEntrada: String,
    val horarioSalida: String,
    val espacioTrabajo: String,
    val tipoContrato: String,
    val educacionMinimaRequerida: String,
    val rangoSalarial: String,
    @ManyToOne @JoinColumn(name = "fkEstado") val fkEstado: Estado,
    val fechaPublicacion: LocalDateTime,
)

