-- cursor

use me;

drop procedure if exists email_coders;

delimiter //

create procedure email_coders() -- il cursore è dentro a una procedura
begin
	declare v_done boolean default false; -- variabile inizializzata e dichiarata
	declare v_first_name varchar(20);
	declare v_last_name varchar(25);
	declare v_mailing_list varchar(1000) default '';

	declare cur_coders cursor for -- cur (cursore) _ parola chiave che spiega su cosa lavora il cursore
		select first_name, last_name from coders; -- come popolare il cursore (una sorta di array con nome, cognome,| nome, cognome,| etc)
	declare continue handler for not found -- quando non c'è più niente da fare --> 
		set v_done = true; -- v_done verrà messa a true

	open cur_coders; -- apri il cursore
	while not v_done do -- facciamo il loop sulle sue righe
		fetch cur_coders into v_first_name, v_last_name; -- prendi il cursore, leggi la riga corrente e mettere il contenuto nelle due variabili
		set v_mailing_list = concat(v_mailing_list,
			lower(v_first_name), "." , lower(v_last_name), "@x.dd;"); -- prendi le variabili, mettile minuscole, uniscile con un punto e agiungi l'estensione della @
	end while;

	select v_mailing_list as "mailing list";

    close cur_coders;
end;

// delimiter ;

call email_coders();
