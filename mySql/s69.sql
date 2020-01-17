-- procedure with parameters

use me;

drop procedure if exists get_coder_salary;

delimiter //

create procedure get_coder_salary(
	in p_coder_id integer, -- p_ cioè parameter, il parametro è una variabile
    out p_salary decimal(8, 2)
) begin
	select salary -- body associato alla procedura
	into p_salary
	from coders
	where coder_id = p_coder_id;
end;

// delimiter ;

call get_coder_salary(104, @result); -- la chiocciola indica che si sta parlando di una variabile locale // (parametro input, parametro output)
select @result;
