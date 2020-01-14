-- non-equi join
select e.last_name, e.salary, j.min_salary
from employees e join jobs j -- l'alias di employees è e, l'alias di jobs è j
on(e.salary between j.min_salary and j.min_salary + 100) -- stampa queste info solo per i dipendenti che hanno un salario compreso tra il minimo e il minimo +100
where(e.job_id = j.job_id);

-- "classic" version
select e.last_name, e.salary, j.min_salary
from employees e, jobs j
where e.salary between j.min_salary and j.min_salary + 100
and e.job_id = j.job_id;
