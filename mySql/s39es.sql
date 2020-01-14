-- 1
select first_name, last_name, salary, truncate (salary / 100 * 8.5, 2) as 'delta', truncate (salary + salary / 100 * 8.5, 2) as '8.5% increment'
from employees;

-- 2
select first_name, last_name, hire_date, abs(datediff(hire_date, now())) as 'days since hiring'
from employees;

-- 3
select first_name, last_name, ifnull(commission_pct, 'no value') as 'commission percentage'
from employees;