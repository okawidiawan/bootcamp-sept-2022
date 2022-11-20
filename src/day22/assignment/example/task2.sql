create table t_country(
    id      integer auto_increment,
    name    varchar(100),
    primary key(id)
);

create table t_capital(
    id          integer auto_increment,
    name        varchar(100) not null,
    country_id  integer not null,
    primary     key(id),
    foreign key(country_id) references t_country(id)
);

create table t_person(
    id          integer auto_increment,
    first_name  varchar(128) not null,
    last_name   varchar(128) not null,
    email       varchar(128) not null,
    primary key(id)
);

create table t_fingerprint(
    id          integer auto_increment,
    data        blob,
    person_id   integer not null,
    primary     key(id),
    foreign     key(person_id) references t_person(id)
);