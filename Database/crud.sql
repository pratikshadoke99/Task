create database crud;
use crud;
CREATE TABLE `user` (
	`sl_no` INT(5) NULL DEFAULT NULL,
	`name` VARCHAR(100) NULL DEFAULT NULL,
	`email` VARCHAR(100) NULL DEFAULT NULL
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;
select *from user;