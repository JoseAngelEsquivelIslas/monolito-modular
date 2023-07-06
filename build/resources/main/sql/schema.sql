create table vacante
(
    id                         uuid default gen_random_uuid() primary key,
    perfil                     varchar(255) not null,
    descripcion_vacante        varchar(255) not null,
    categoria                  varchar(255) not null,
    horario_entrada            varchar(255) not null,
    horario_salida             varchar(255) not null,
    espacio_trabajo            varchar(255) not null,
    tipo_contrato              varchar(255) not null,
    educacion_minima_requerida varchar(255) not null,
    rango_salarial             varchar(255) not null,
    fk_estado                  int not null,
    fecha_publicacion          timestamp    not null
);

create table estados
(
    id     int(2) primary key,
    nombre varchar(255) not null
);


create table requisito
(
    id          uuid default gen_random_uuid() primary key,
    requisito   varchar(255)                 not null,
    descripcion varchar(255)                 not null,
    fk_vacante  uuid references vacante (id) not null
);

create table habilidad
(
    id                    uuid default gen_random_uuid() primary key,
    habilidad             varchar(255)                 not null,
    anios_de_conocimiento int                          not null,
    fk_vacante            uuid references vacante (id) not null

);

create table oferta
(
    id         uuid default gen_random_uuid() primary key,
    oferta     varchar(255)                 not null,
    fk_vacante uuid references vacante (id) not null

);