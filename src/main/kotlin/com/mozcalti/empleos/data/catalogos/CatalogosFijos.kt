package com.mozcalti.empleos.data.catalogos

enum class FechaFiltro(val nombre: String){
    HOY("Hoy"),
    AYER("Ayer"),
    DOSDIAS("Hace 2 dias"),
    TRESDIAS("Hace 3 dias"),
    UNASEMANA("Hace 1 semana"),
    UNMES("Hace 1 mes"),
}
enum class SalarioFiltro(val nombre: String){
    CINCOMIL("Hasta $5,000 MXM"),
    CINCOMILADIEZMIL("$5,000 - $10,000 MXM"),
    DIEZMILAQUINCEMIL("$10,000 - $15,000 MXM"),
    QUINCEMILAVEINTEMIL("$15,000 - $20,000 MXM"),
    VEINTEMILATREINTAMIL("$20,000 - $30,000 MXM"),
    MASDETREINTAMIL("$30,000 o mas"),
}

enum class TipoContratacionFiltro(val nombre: String){
    TIEPOCOMPLETO("Tiempo completo"),
    MEDIOTIEPO("Medio tiempo"),
    INDETERMINADO("Indeterminado"),
    TEMPORAL("Temporal"),
    BECARIOPRACTICAS("Becario/Practicas"),
    HONORARIOS("Honorarios"),
}


enum class CategoriasFiltro(val nombre: String){
    TICSSISTEMAS("Tecnologías de la Información - Sistemas"),
    ADMINISTRATIVO("Administrativo"),
    ATENCIONCLIENTES("Atención a clientes - Call Center"),
    VENTAS("Ventas"),
    CONTABILIDADFINANZAS("Contabilidad - Finanzas"),
    LOGISTICA("Logística - Transporte - Distribución - Almacén"),
    EDUCACION("Educación"),
    RECURSOSHUMANOS("Recursos humanos"),
    SERVICIONSGENERALES("Servicios generales - Oficios - Seguridad"),
    MINERIA("Minería - Energía - Recursos Naturales"),
    MERCADOTECNIA("Mercadotecnia - Publicidad - Relaciones Públicas"),
    SECTORSALUD("Sector salud"),
}

enum class EducacionMinimaFiltro(val nombre: String){
    UNIVERSITARIOTITULADO("Universitario titulado"),
    UNIVERSITARIOSinTITULO("Universitario sin titulo"),
    TECNICO("Tecnico"),
    BACHILLERATO("Bachillerato"),
    POSGRADO("Posgrado"),
    SECUNDARIA("Secundaria"),
}

enum class EspacioTrabajoFiltro(val nombre: String){
    PRESENCIAL("Presencial"),
    HIBRIDO("Hibrido"),
    DESDECASA("Desde casa"),
}