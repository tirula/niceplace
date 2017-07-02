CREATE TABLE USER (
	USER_ID INT NOT NULL,
	EMAIL VARCHAR(100) NULL,
	NAME VARCHAR(50) NULL,
	PASSWORD VARCHAR(20) NULL,
	PRIMARY KEY (`USER_ID`)
	);
	
GRANT ALL PRIVILEGES ON niceplace.user TO 'root'@'%' WITH GRANT OPTION;

insert into USER (USER_ID, NAME, EMAIL, PASSWORD ) values (100, 'Brunno de Almeida Santos', 'balmeida.santos@hotmail.com  a ','1234');
