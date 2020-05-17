--создаем базу данных
create  DATABASE rolesmodeln;
--создаем таблицу
use Data rolesmodeln;


-- оздаем таблицу state связана по принципу many-to-one с таблицей item
create table state  (
id serial primary key,
	name varchar(2000),


);
select * from state;
----создаем таблицу  category она связана по принципу many-to-one с таблицей item
create table category (
id serial primary key,
	name varchar(2000),


);
select * from category;

--создаем таблицу item в ней прописываем связи по принципу
--item - comments = one-to-many
        --item - attachs = one-to-many

create table item (
id serial primary key,


user1_id INT REFERENCES User1(id),
category_id INT REFERENCES Category(id),
state_id INT REFERENCES State(id),
name VARCHAR(256) NOT NULL, description TEXT NOT NULL
);



   --заполняем таблицу item
   insert into item(id, comments1_id, atachs_id,user1_id,category_id) values (1,1,1,1 ,1,1,'онлайм','Заявка на провайдера услуг');
--read
select * from item;
--Создаем следующую таблицу
create table atachs (
  id serial primary key,
itemId INT REFERENCES Item(id),
  name varchar(2000)

);
select * from atachs;
--создаем таблицу comments1
create table comments1 (
   id serial primary key,
itemId INT REFERENCES Item(id),
   name varchar(2000)

);
--выводим ее на экран (перед этим закоментируем предыдущее)
select * from comments1;
--создаем таблицу role она связана по принципу many-to-one с таблицей user1
create table role(
id serial primary key,
	name varchar(2000),
	role_id int

);
select * from role;
--создаем таблицу user1 с ней связана таблица item пол принципу many-to-one
create table user1(
id serial primary key,
	name varchar(2000),
role_id int references role(id)
);
-- выводим ее
select * from user1;


--создаем таблицу rules она связана по принципу many-to-many с таблицей role
create table rules(
id serial primary key,
rules_id int,
	name varchar(2000)

);
--read
select * from rules;
--создаем таблицу rolr-rules как промежуточную для связи rules по принципу many-to-many с таблицей role
create table role_rules(
 id serial primary key,

	role_id int references role(role_id),
  rules_id int references rules(rules_id)
);


select * from role_rules;
