DROP TABLE board IF EXISTS;
create table board
(
    id      int auto_increment,
    title   varchar2(200) not null,
    content text          not null,
    constraint board_pk
        primary key (id)
);