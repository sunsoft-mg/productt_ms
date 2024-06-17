create TABLE tva
(
    id          serial PRIMARY KEY,
    uuid        varchar(255) unique,
    description VARCHAR(30) NOT NULL,
    taux        NUMERIC(4, 2) CHECK (taux >= 0 AND taux <= 100)
);
create TABLE unit
(
    id      serial PRIMARY KEY ,
    uuid varchar(255) unique ,
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