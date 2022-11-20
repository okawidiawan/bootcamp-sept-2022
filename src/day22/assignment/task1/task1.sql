create table t_customer(
    id      integer auto_increment,
    name    varchar(100) not null,
    address varchar(100) not null,
    tax_id  varchar(20),
    primary key(id)
);

create table t_order(
    id          integer auto_increment,
    order_date  datetime not null,
    amount      integer not null,
    comments    varchar(255),
    customer_id integer not null,
    primary key(id),
    foreign key(customer_id) references t_customer(id)
);

create table t_product(
    id  integer auto_increment,
    code varchar(20) not null,
    name varchar(100) not null,
    description varchar(500),
    price integer not null,
    primary key(id)
);

create table t_orderDetail(
    id       integer auto_increment,
    order_id integer not null,
    product_id integer not null,
    quantity integer not null,
    primary key(id),
    foreign key(order_id) references t_order(id),
    foreign key(product_id) references t_product(id)
);
