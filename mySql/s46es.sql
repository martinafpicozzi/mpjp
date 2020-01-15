-- 1
select max(salary), min(salary), sum(salary), (truncate (avg(salary), 2))
from employees;

-- 2
select max(salary), min(salary), sum(salary), (truncate (avg(salary), 2)), job_id
from employees
group by job_id;

-- 3
select count(*), job_id
from employees 
group by job_id;

-- 4
select count(*), job_id
from employees
where job_id = 'it_prog';

-- 5
select count(*) as 'manager count'
from employees
where employee_id in (
	select distinct manager_id
    from employees
    where manager_id is not null);
    
-- 6
select first_name, last_name, employee_id
from employees
where employee_id not in ( -- considero l'employee_id solo se non rientra nella lista dei manager_id, che trovo con la subquery
	select distinct manager_id
    from employees
    where manager_id is not null);
    
-- 7
select max(salary), min(salary), (max(salary)-min(salary)) as 'max-min salary'
from employees;

-- 8
select job_id, max(salary), min(salary), (max(salary)-min(salary)) as 'max-min salary'
from employees
group by job_id
having min(salary) != max(salary); -- filtrare sui gruppi

-- 9
select min(salary), manager_id
from employees
where manager_id is not null
group by manager_id
having min(salary) >= 6000;