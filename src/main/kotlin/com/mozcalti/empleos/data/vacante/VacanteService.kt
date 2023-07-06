package com.mozcalti.empleos.data.vacante

import com.mozcalti.empleos.data.estado.EstadoService
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit
import java.util.*

@Service
class VacanteService(
    private val repository: VacanteRepository,
    private val estadoService: EstadoService
) {

    fun listaVacantes(
            query: String,
            rangoSalarial: String,
            categoria: String,
            tipoContrato: String,
            estado: String
    ): List<Vacante> = repository.findAllByPerfilContainingIgnoreCaseOrRangoSalarialOrCategoriaOrTipoContratoOrFkEstadoNombre(
            query,
            rangoSalarial,
            categoria,
            tipoContrato,
            estado
    ).toList()

    fun listaVacantesByFecha(fecha: LocalDateTime): List<Vacante> = repository.findAllByFechaPublicacion(fecha).toList()

    fun nuevaVacante(
            perfil: String,
            descripcionVacante: String,
            categoria: String,
            horarioEntrada: String,
            horarioSalida: String,
            espacioTrabajo: String,
            tipoContrato: String,
            educacionMinimaRequerida: String,
            rangoSalarial: String,
            fkEstado: Int,
    ) {

        repository.save(
                Vacante(
                        UUID.randomUUID(),
                        perfil,
                        descripcionVacante,
                        categoria,
                        horarioEntrada,
                        horarioSalida,
                        espacioTrabajo,
                        tipoContrato,
                        educacionMinimaRequerida,
                        rangoSalarial,
                        estadoService.estadoPorId(fkEstado),
                        LocalDateTime.now(),
                )
        )

    }

    fun getDateDiference(fechaPublicacion: LocalDateTime): Long {
        return ChronoUnit.DAYS.between(fechaPublicacion, LocalDateTime.now())
    }

}