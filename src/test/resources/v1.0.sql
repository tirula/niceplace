

CREATE  TABLE users (
  username VARCHAR(45) NOT NULL ,
  password VARCHAR(45) NOT NULL ,
  enabled TINYINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username));
  
  CREATE TABLE user_roles (
  user_role_id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(45) NOT NULL,
  role varchar(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE KEY uni_username_role (role,username),
  KEY fk_username_idx (username),
  CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username));
  
INSERT INTO users(username,password,enabled) VALUES ('brunno','123456', true);
INSERT INTO users(username,password,enabled) VALUES ('alex','123456', true);

INSERT INTO user_roles (username, role) VALUES ('brunno', 'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('brunno', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role) VALUES ('alex', 'ROLE_USER');

CREATE TABLE place (
	place_id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(50) NULL,
	phone VARCHAR(20) NULL,
	type_place VARCHAR(30),
	address varchar(200) null,
	city varchar(50) null,
	country varchar(30) null,
	PRIMARY KEY (place_id)
);

GRANT ALL PRIVILEGES ON niceplace.place TO 'root'@'%' WITH GRANT OPTION;

INSERT INTO place (place_id, name, phone, type_place, address, city, country) VALUES (200, 'LIVRARIA', '48-3333-3333','LIBRARY','Av. Rendeiras', 'Florianopolis', 'Brazil' );
INSERT INTO place (place_id, name, phone, type_place, address, city, country) VALUES (201, 'CAFE', '48-4444-4444','COFFEE', 'Av. Madre Benvenuta','Florianopolis','Brazil');
INSERT INTO place (place_id, name, phone, type_place, address, city, country) VALUES (202, 'MCDONALDS', '48-5555-5555','RESTAURANT','Av.Beira marc','Florianopolis','Brazil');


CREATE TABLE user_place (
  username VARCHAR(45) NOT NULL ,
  place_id INT(10) UNSIGNED NOT NULL,
  created_date DATE NOT NULL,	
  foods varchar(100) null,
  drinks varchar(100) null, 
  waiter DECIMAL(5,2) null,
  bill DECIMAL(5,2) null, 
  confortable DECIMAL(5,2) null, 
  noisy DECIMAL(5,2) null,
  total DECIMAL(5,2) null,
  internet varchar(100) null,
  PRIMARY KEY (username,place_id)
);

GRANT ALL PRIVILEGES ON niceplace.user_place TO 'root'@'%' WITH GRANT OPTION;


