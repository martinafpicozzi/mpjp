-- 1
select first_name, last_name, email, phone_number, hire_date 
from employees
order by last_name, first_name;

-- 2
select *
from employees
where first_name = 'David' or 'Peter';

-- 3
 select *
 from employees
 where department_id = 60;

select *
from employees
where department_id = 30 or department_id = 50;

-- 4
select *
from employees
where salary > 10000;

select *
from employees
where salary < 4000 or salary > 15000;

select *
from employees
where (salary < 4000 or salary > 15000) and (department_id = 50 or department_id = 80);