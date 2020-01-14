-- self join
select concat (e.last_name, ' ', e.first_name) as 'employee', e.hire_date as 'hire date', concat (m.last_name, ' ', m.first_name) as 'manager', m.hire_date as 'hire date'
from employees e join employees m
on (e.manager_id = m.employee_id);

-- "classic" self join
select e.last_name as employee, m.last_name as manager
from employees e, employees m
where e.manager_id = m.employee_id;
