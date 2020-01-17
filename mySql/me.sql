create user me identified by 'password';
create database me; -- creazione dello schema
grant all privileges on me.* to me;
grant alter routine on me.* to me; -- privilegi per modificare le procedure

-- drop user me; -- per cancellare lo user "me"

show databases; -- mostra i db presenti
use me; -- seleziona il db da usare

SET GLOBAL log_bin_trust_function_creators = 1;