-- join on 3 tables
select employee_id, city, department_name
from employees join departments using(department_id) -- devo per forza passare per departments, che ha un legame con locations
join locations using(location_id); -- join tra departments e locations

-- new join
select employee_id, first_name, last_name, city
from employees join departments using (department_id)
join locations using(location_id);

-- "classic" 3-way join
select employee_id, city, department_name
from employees e, departments d, locations l
where d.department_id = e.department_id and d.location_id = l.location_id
and DEPARTMENT_NAME = 'Executive';
