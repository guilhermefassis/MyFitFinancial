create table revenue (
    id bigint not null auto_increment,
    description varchar(200),
    paymentDate date,
    value double precision (7,3),
    type integer,

    primary key (id)
);

create table spending (
    id bigint not null auto_increment,
    description varchar(200),
    paymentDate date,
    value double precision (7,3),
    type integer,

    primary key (id)
);