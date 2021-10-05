create table t_author
(
    id integer auto_increment,
    firstname varchar(50),
    lastname varchar(50),

    primary key(id)
);
create table t_book
(
    id integer auto_increment,
    name varchar(50),
    release_date integer,

    primary key(id)
);