create table t_professor(
    id          integer auto_increment,
    first_name  varchar(255) not null,
    last_name   varchar(255) not null,
    primary key(id)
);

create table t_subject(
    id              integer auto_increment,
    subject_name    varchar(255),
    professor_id    integer not null,
    primary key(id),
    foreign key(professor_id) references t_professor(id)
);

create table t_supplier(
    id      integer auto_increment,
    name    varchar(255) not null,
    address varchar(255) not null,
    country varchar(255) not null,
    primary key(id)
);

create table t_product_supplier(
    id          integer auto_increment,
    name        varchar(255) not null,
    description varchar(255) not null,
    price       decimal(10, 2),
    supplier_id integer not null,
    primary key(id),
    foreign key(supplier_id) references t_supplier(id)
);