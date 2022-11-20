create database day23_assignment;

use day23_assignment;

create table t_user (

    id      integer auto_increment,
    name    varchar(100) not null,
    age     integer not null,
    primary key(id)

);