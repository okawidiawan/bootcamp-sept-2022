create table t_staff (
    id                  integer auto_increment,
    name                varchar(100) not null,
    base_salary         decimal(18,2) not null,
    presence            integer default 0,
    annual_leave        integer default 0,
    status              varchar(50),
    meal_allowance      decimal(18,2) default 0,
    transport_allowance decimal(18,2) default 0,
    take_home_pay       decimal(18,2) default 0,
    primary key(id)
);