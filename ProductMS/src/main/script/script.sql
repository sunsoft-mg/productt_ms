create TABLE tva
(
    id          serial PRIMARY KEY,
    uuid        varchar(255) unique,
    description VARCHAR(30) NOT NULL,
    taux        NUMERIC(4, 2) CHECK (taux >= 0 AND taux <= 100)
);
create TABLE unit
(
    id   serial PRIMARY KEY,
    uuid varchar(255) unique,
    unit VARCHAR(15) not NULL
);
create TABLE color
(
    id          serial PRIMARY KEY,
    uuid        varchar(255) unique,
    description VARCHAR(30) NOT NULL,
    reference   VARCHAR(30) DEFAULT NULL,
    textcolor   BOOLEAN     DEFAULT FALSE,
    fontcolor   VARCHAR(20) DEFAULT ''
);
create TABLE currency
(
    id       serial PRIMARY KEY,
    uuid     varchar(255) unique,
    currency VARCHAR(20)   NOT NULL UNIQUE,
    sigle    VARCHAR(10),
    percent  NUMERIC(4, 2) not NULL CHECK (percent >= 0 AND percent <= 100)
);
create table place
(
    id   serial primary key,
    uuid varchar(255) unique,
    code varchar(20) not null unique,
    name varchar(50) not null unique
);
create table prize_system
(
    id   serial primary key,
    uuid varchar(255) unique,
    name varchar(150) not null
);
create table category
(
    id          serial primary key,
    uuid        varchar(255) unique,
    code        varchar(20) not null unique,
    name        varchar(50) not null unique,
    can_be_sold boolean     not null,
    see_in_sold boolean     not null,
    margin      numeric(5, 2) check ((margin >= (0)) AND (margin <= (100))),
    printer     varchar(50)
);

CREATE TABLE subcategory
(
    id          serial primary key,
    uuid        varchar(255) unique,
    code        VARCHAR(20) NOT NULL UNIQUE,
    name        VARCHAR(50) NOT NULL UNIQUE,
    category    VARCHAR(250) NOT NULL,
    can_be_sold BOOLEAN     NOT NULL,
    see_in_sold BOOLEAN     NOT NULL,
    margin      NUMERIC(5, 3) CHECK (margin >= 0 AND margin <= 100)
);
CREATE TABLE brand
(
    id   serial primary key,
    uuid varchar(255) unique,
    name VARCHAR(50) NOT NULL UNIQUE
);

create table code_product
(
    id    serial primary key,
    uuid  varchar(255) unique,
    value varchar(32) not null
);

create table prix_product
(
    id          serial primary key,
    type_client varchar(255)     not null,
    pu_ttc      double precision not null
);

CREATE TABLE product
(
    id serial primary key,
    uuid  varchar(255) unique,
    subcategory VARCHAR(250) NOT NULL,
    code VARCHAR(250) NOT NULL,
    tva VARCHAR(250) NOT NULL,
    place VARCHAR(250) NOT NULL,
    designation VARCHAR(250) NOT NULL,
    prize_system VARCHAR(250) NOT NULL,
    tarif_auto boolean default false,
    classement VARCHAR(250) NOT NULL,
    default_provider varchar(255)     not null ,
    unit VARCHAR(250) NOT NULL ,
    brand VARCHAR(250) NOT NULL ,--marque
    min_quantity NUMERIC(15,3) DEFAULT NULL CHECK(min_quantity > 0),
    max_quantity NUMERIC(15,3) DEFAULT NULL CHECK(max_quantity > 0),
    sans_remise BOOLEAN NOT NULL DEFAULT FALSE,
    qte_min_remise NUMERIC(15,3) CHECK(qte_min_remise > 0),
    taux_remise NUMERIC(15,3) CHECK(taux_remise >= 0),--remise
    taux_com NUMERIC(15,3) CHECK(taux_com >= 0),--remise
    color VARCHAR(250) NOT NULL ,
    poids NUMERIC(15,3) CHECK(poids > 0),
    prix_achat_devise NUMERIC(15,3) DEFAULT NULL CHECK(prix_achat_devise > 0),
    devise VARCHAR(250) NOT NULL,
    isService BOOLEAN NOT NULL DEFAULT FALSE,
    pu NUMERIC(5,3) CHECK (pu >= 0 AND pu <= 100),
    en_sommeil BOOLEAN NOT NULL DEFAULT FALSE,
    vendable BOOLEAN NOT NULL DEFAULT FALSE,
    consultable_vente BOOLEAN NOT NULL DEFAULT FALSE,
    scan_saisie BOOLEAN NOT NULL DEFAULT FALSE,
    source integer,
    charge_defaut NUMERIC(5,3) CHECK (charge_defaut >= 0 AND charge_defaut <= 100),
    code_datapharme VARCHAR(250) NOT NULL,
    codedcidet VARCHAR(250) NOT NULL,
    deleted boolean default false
);




