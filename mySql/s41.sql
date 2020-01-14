-- average salary for each department
select department_id, truncate(avg(salary), 0) as 'avg salary'
from employees
group by department_id -- media di ogni dipartimento
order by 1; -- prima colonna della select, quindi department_id