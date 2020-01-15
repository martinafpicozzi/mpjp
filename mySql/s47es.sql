-- 1
select l.street_address, l.postal_code, l.city, c.country_name, country_id
from locations l join countries c
using (country_id);

-- 2
select e.first_name, e.last_name, d.department_id, d.department_name
from employees e join departments d
using (department_id);

-- 3
select e.first_name, e.last_name, d.department_id, d.department_name, city
from employees e join departments d using (department_id)
join locations l using (location_id) 
where l.city = 'Toronto';

-- 4
select count(employee_id) as 'David Lee'
from employees
where first_name = 'David' and last_name = 'Lee';

select first_name, last_name, hire_date
from employees
where hire_date > (
	select hire_date
    from employees
    where first_name = 'David' and last_name = 'Lee');

-- 5, chi è stato assunto prima del proprio manager
select e.first_name, e.last_name, e.hire_date, m.first_name, m.last_name, m.hire_date
from employees e join employees m
on (e.manager_id = m.employee_id)
where e.hire_date < m.hire_date;

-- 6
select first_name, last_name, manager_id
from employees
where manager_id = (
	select manager_id
    from employees
    where first_name = 'Lisa' and last_name = 'Ozer');

-- 7
select first_name, last_name, department_name
from employees e join departments d
where e.department_id in ( -- in perché nelle parentesi otterrò più risultati
	select distinct department_id
    from employees
    where last_name like '%u%');

-- 8
select first_name, last_name, department_name
from employees join departments using (department_id)
where department_name = 'Shipping';

-- 9, chi ha come manager Steven King
select first_name, last_name, manager_id
from employees
where manager_id = (
	select employee_id
    from employees
    where first_name = 'Steven' and last_name = 'King');