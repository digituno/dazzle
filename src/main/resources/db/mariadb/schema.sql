drop table if exists board;
create table board
(
    id      int auto_increment,
    title   varchar(200) not null,
    content text         not null,
    primary key (id)
);