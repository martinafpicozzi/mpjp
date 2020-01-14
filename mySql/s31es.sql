-- 1
select d.department_name, e.first_name, e.last_name 
from departments d left outer join employees e -- i departments ci sono tutti quindi è quello che prendo in considerazione, quello che vale
on (d.manager_id = e.employee_id);

-- 2
select department_name, manager_id
from departments 
where manager_id is null;

-- 3
select concat (e.first_name, ' ', e.last_name) as 'employee', concat (m.first_name, ' ', m.last_name) as 'manager'
from employees e left outer join employees m
on (e.manager_id = m.employee_id);