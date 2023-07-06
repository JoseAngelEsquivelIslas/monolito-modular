package com.mozcalti.empleos.data.vacante

import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime
import java.util.*

interface VacanteRepository : JpaRepository<Vacante, UUID> {

    fun findAllByPerfilContainingIgnoreCaseOrRangoSalarialOrCategoriaOrTipoContratoOrFkEstadoNombre(
            query: String,
            rangoSalarial: String,
            categoria: String,
            tipoContrato: String,
            estado: String
    ): List<Vacante>

    fun findAllByFechaPublicacion(fecha: LocalDateTime): List<Vacante>

}