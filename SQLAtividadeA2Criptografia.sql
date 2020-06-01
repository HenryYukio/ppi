use aula01;

CREATE TABLE usuario (
  username VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL,
  PRIMARY KEY (username))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

insert into usuario (username, password)
values
('henry@yukio.com', '?{O¯F9ï5¾èBè?ö');
/* a senha usada foi henry */