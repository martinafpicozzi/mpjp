-- 1
delimiter //

create procedure date_tomorrow()
begin
select date_add(curdate(), interval 1 day) as 'tomorrow will be the' 
from dual;
end;

// delimiter ;

call date_tomorrow();

-- 2
delimiter //

create procedure name_date(
	in p_name varchar(20)
) begin
	select date_add(curdate(), interval 1 day), p_name;
end;

// delimiter ;

call name_date ('Ciro');

drop procedure if exists name_date;


-- 3
delimiter //

create procedure get_coder_name(
	in p_coder_id integer, 
	out p_coder_name varchar(30)
) begin
	select first_name into p_coder_name
	from coders
	where coder_id = p_coder_id;
end;

// delimiter ;

call get_coder_name(201, @result);

select @result;

drop procedure if exists get_coder_name;