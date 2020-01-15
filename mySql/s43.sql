-- a) subquery in where:
-- employees having Chen as manager
select first_name, last_name
from employees
where employee_id = (
	select manager_id
	from employees
	where last_name = 'Chen');

-- b) subquery in from:
-- get the top salary from the ones specified in the subquery
select max(e.salary)
from (
	select employee_id, salary
	from employees
	where employee_id between 112 and 115) e;

-- c) subquery in having
-- c.1) average salaries for each department
select avg(salary)
from employees
group by department_id
order by 1 desc;

-- c.2) highest salary among the average salary for each department
select max(tmp.avg_sal) from (
	select avg(salary) avg_sal
	from employees
	group by department_id) tmp;

-- average salaries for each department, excluding the topmost one

-- 1) select interna: seleziona da employees il salario medio (la cui colonna chiamo sal), raggruppato per dep_id e creo una tabella fittizia che chiamo x
-- 2) seleziona il valore massimo da quello appena trovato 
-- 3) seleziona dep id, media del salario arrotondato da employees MA solo di quelli con la media del salario minore del risultato che abbiamo trovato prima
-- 4) ordinato per avg(salary) desc

select department_id, round(avg(salary))
from employees
group by department_id 
having avg(salary) < (select max(x.sal) from (
	select avg(salary) sal
	from employees
	group by department_id) x)
order by 2 desc;
