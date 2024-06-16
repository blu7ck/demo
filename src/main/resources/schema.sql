-- nights
create table IF NOT EXISTS practise(
    id serial primary key,
    night varchar(50) not null,
    happens text not null
);
