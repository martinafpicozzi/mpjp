-- 1
select first_name, last_name, email, phone_number, hire_date 
from employees
order by last_name, first_name; -- order by 2,1

-- 2
select first_name, last_name, email
from employees
where first_name = 'David' or 'Peter';

-- 3
 select first_name, last_name, email, department_id
 from employees
 where department_id = 60;

select first_name, last_name, email, department_id
from employees
where department_id = 30 or department_id = 50; -- where department_id in (30, 50)

-- 4
select first_name, last_name, email, salary, department_id
from employees
where salary > 10000;

select first_name, last_name, email, salary
from employees
where salary < 4000 or salary > 15000;

select first_name, last_name, email, salary, department_id
from employees
where (salary < 4000 or salary > 15000) and (department_id = 50 or department_id = 80);