-- 1
select e.first_name, e.last_name, d.department_name
from employees e join departments d
using (department_id);

-- 2
select e.first_name, e.last_name, j.job_title
from employees e join jobs j
using (job_id);

-- 3
select e.first_name, e.last_name, j.job_title, e.salary
from employees e join jobs j
using (job_id)
where salary = min_salary or salary = max_salary;

-- 4
select first_name, last_name, country_id
from employees join departments 
using (department_id) 
join locations using (location_id) 
where country_id = 'UK';

-- 5 (one to one)
select d.department_name, e.manager_id, e.first_name, e.last_name
from departments d join employees e
on (d.manager_id = e.employee_id);