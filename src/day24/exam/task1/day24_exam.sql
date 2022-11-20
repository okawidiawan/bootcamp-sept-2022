create table t_student (
    id          integer auto_increment,
    name        varchar(100) not null,
    address     varchar(100) not null,
    status      varchar(50),
    physics     integer not null,
    calculus    integer not null,
    biology     integer not null,
    primary key(id)
);

create table t_user(
    id          integer auto_increment,
    username    varchar(100) not null,
    password    varchar(100) not null,
    primary key(id)
);