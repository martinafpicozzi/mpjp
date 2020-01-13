-- 1
select first_name, last_name, email, hire_date
from employees
where hire_date between '2005-01-01' and '2005-12-31';

-- 2
select first_name, last_name, email, job_id
from employees
order by job_id asc;

-- 3
select first_name, last_name, email, commission_pct
from employees
where commission_pct;

-- 4
select first_name, last_name, email
from employees
where first_name or last_name like '%a%';

-- 5
select department_id, department_name
from departments
order by department_name asc;

-- 6
select street_address, city, country_id
from locations
where country_id = 'IT';

-- 7a
select first_name, last_name, email, hire_date
from employees
where last_name like 'Mc%'
order by hire_date desc;

-- 7b
select first_name, last_name, email, hire_date
from employees
where last_name like '_h%' or first_name like '_h%'
order by hire_date desc;
