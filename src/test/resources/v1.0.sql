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


CREATE TABLE PLACE(
	PLACE_ID INT NOT NULL,
	NAME VARCHAR(50) NULL,
	PHONE VARCHAR(20) NULL,
	TYPE VARCHAR(30),
	PRIMARY KEY (PLACE_ID)
);

GRANT ALL PRIVILEGES ON niceplace.PLACE TO 'root'@'%' WITH GRANT OPTION;

INSERT INTO PLACE (PLACE_ID, NAME, PHONE, TYPE) VALUES (200, 'LIVRARIA', '48-3333-3333','LIBRARY');
INSERT INTO PLACE (PLACE_ID, NAME, PHONE, TYPE) VALUES (201, 'CAFE', '48-4444-4444','COFFEE');
INSERT INTO PLACE (PLACE_ID, NAME, PHONE, TYPE) VALUES (202, 'MCDONALDS', '48-5555-5555','RESTAURANT');


CREATE TABLE USER_PLACE (
  	username VARCHAR(45) NOT NULL,
  	PLACE_ID INT(10) UNSIGNED NOT NULL,
  	SCORE INT NOT NULL,
  	RATED_DATE DATE NOT NULL,
 	PRIMARY KEY (username, PLACE_ID)
);

GRANT ALL PRIVILEGES ON niceplace.USER_PLACE TO 'root'@'%' WITH GRANT OPTION;

INSERT INTO USER_PLACE (username, PLACE_ID, SCORE, RATED_DATE) VALUES ("brunno",200,5, NOW());

