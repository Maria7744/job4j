--создаем базу данных
create  Data rolesmodeln;
--создаем таблицу
use Data rolesmodeln;
create table comments1 (
   id serial primary key,

   name varchar(2000)

);
--выводим ее на экран (перед этим закоментируем предыдущее)
select * from comments1;
--Создаем следующую таблицу
create table atachs (
  id serial primary key,

  name varchar(2000)

);
select * from atachs;
--создаем таблицу item в ней прописываем связи по принципу
--item - comments = one-to-many
        --item - attachs = one-to-many

        create table item (
        id serial primary key,
          comments1_id int references comments1(id),
           atachs_id int references atachs(id)
                        );
   --заполняем таблицу item
   insert into item(id, comments1_id, atachs_id) values (1,1,1) ;
--read
select * from item;
--создаем таблицу user1 с ней связана таблица item пол принципу many-to-one
create table user1(
id serial primary key,
	name varchar(2000),
	item_id int references item(id)
);
-- выводим ее
select * from user1;
--создаем таблицу role она связана по принципу many-to-one с таблицей user1
create table role(
id serial primary key,
	name varchar(2000),
	user1_id int references user1(id)

);
select * from role;
--создаем таблицу rules она связана по принципу many-to-many с таблицей role
create table rules(
id serial primary key,
	name varchar(2000)

);
--read
select * from rules;
--создаем таблицу rolr-rules как промежуточную для связи rules по принципу many-to-many с таблицей role
create table role_rules(
 id serial primary key,

	role_id int references role(id),
  rules_id int references rules(id)
);


select * from role_rules;
----создаем таблицу  category она связана по принципу many-to-one с таблицей item
create table category (
id serial primary key,
	name varchar(2000),
	item_id int references item(id)

);
select * from category;
-- оздаем таблицу item  связана по принципу many-to-one с таблицей state
create table state  (
id serial primary key,
	name varchar(2000),
	item_id int references item(id)

);