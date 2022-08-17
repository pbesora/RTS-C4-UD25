DROP TABLE IF EXISTS articles;
DROP table IF EXISTS manufacturers;


CREATE TABLE manufacturers (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE articles (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(100) DEFAULT NULL,
  price int DEFAULT NULL,
  manufacturer int(11) DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT FK_ManuArt FOREIGN KEY (manufacturer) REFERENCES manufacturers (id)
  ON DELETE SET NULL ON UPDATE CASCADE
);


insert into manufacturers (name)values('Jose');
insert into manufacturers (name)values('Juan');
insert into manufacturers (name)values('Dani');
insert into manufacturers (name)values('Carlos');

insert into articles (name, price, manufacturer) values ('Article 01', 12, 1);
insert into articles (name, price, manufacturer) values ('Article 02', 7, 3);
insert into articles (name, price, manufacturer) values ('Article 03', 18, 2);
insert into articles (name, price, manufacturer) values ('Article 04', 4, 2);

