-- 1
insert into coders (coder_id, first_name, last_name, hire_date, salary)
values (201, 'Maria', 'Rossi', curdate(), 5000);

insert into coders (coder_id, first_name, last_name, hire_date, salary)
values (202, 'Franco', 'Bianchi', curdate(), 4500);

-- 2
update coders
set first_name = 'Mariangela'
where first_name = 'Maria' and last_name = 'Rossi';


-- 3
update coders
set salary = salary + 500
where salary < 6000;

-- 4
delete from coders
where coder_id = 202;

-- 5
commit;