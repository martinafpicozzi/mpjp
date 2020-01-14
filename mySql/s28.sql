-- left outer join
select first_name, department_name
from employees left outer join departments
using(department_id) -- la relazione viene fatta su dep_id, ci interessa se c'è un null qui, se trova una riga senza relazione, se è una inner join butta via la riga, altrimenti la mette ma con null
where last_name = 'Grant'; -- viene stampato anche un Grant senza dep_id
