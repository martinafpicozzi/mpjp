-- create table by select
create table coders
as
    select employee_id as coder_id, first_name, last_name, hire_date, salary
    from employees
    where department_id = 60; -- la tabella creata da select non ha primary key (vedi info di coders)

-- when in doubt, do not run this one
drop table coders;