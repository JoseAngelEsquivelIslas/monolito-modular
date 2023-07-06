package com.mozcalti.empleos.data.estado

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "estados")
data class Estado(
        @Id val id: Int,
        val nombre: String
)




