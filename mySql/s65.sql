
drop procedure if exists condition_example;

delimiter //

create procedure condition_example()
begin
	declare v_a integer default 1; -- variabile dichiarata e assegnata
	declare v_b varchar(20); -- variabile solo dichiarata
	declare v_c varchar(20);

	if v_a > 0 then
		set v_b = 'v_a is positive';
	elseif v_a = 0 then
		set v_b = 'v_a is zero';
	else
		set v_b = 'v_a is negative';
	end if;

	case v_a
		when -1 then
			set v_c = 'v_a is minus one'; -- metto in v_c una stringa
		when 0 then
			set v_c = 'v_a is zero';
		when 1 then
			set v_c = 'v_a is plus one';
		else
			set v_c = 'v_a is unknown';
	end case;

	select v_b as 'if message', v_c as 'switch message'; --  ritorna una tabella con 2 colonne, con v_b e v_c, con due nomi e nella tabella ci saranno i due valori delle variabili
end;

// delimiter ;

call condition_example();
