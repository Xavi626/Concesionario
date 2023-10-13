CREATE DATABASE server_java;
USE server_java;
CREATE TABLE ob_user(
	id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL
);

CREATE TABLE ob_car(
	id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    brand VARCHAR(50) NOT NULL,
    model VARCHAR(100) NOT NULL,
    cv INT NOT NULL,
    price INT NOT NULL,
    color VARCHAR(50) NOT NULL,
    priceRenting INT NOT NULL
);

INSERT INTO ob_user(username, password) VALUES ('admin','gD1O2i19');
INSERT INTO ob_car(brand, model, cv, price, color, priceRenting) VALUES ('BMW','M3',456,54674,'Azul',340);
INSERT INTO ob_car(brand, model, cv, price, color, priceRenting) VALUES ('AUDI','A4',306,34674,'Gris',230);

select * from ob_user;
select * from ob_car;
