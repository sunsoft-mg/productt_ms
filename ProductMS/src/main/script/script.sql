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
    category    int         NOT NULL REFERENCES category (id),
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
    id   serial primary key,
    uuid varchar(255) unique,
    value varchar(32) not null
);