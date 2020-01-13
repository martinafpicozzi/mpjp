use me;

-- a select
select region_name -- prendi solo il nome (dalle colonne)
from regions -- da questa tabella
where region_id = 1; -- dove il region id è 1 (righe)

-- select all
select * from regions; -- * significa tutte le colonne

-- select distinct -- mostra tutti i manager id senza duplicati
select distinct manager_id
from employees;

-- select with change on results
select job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000 -- posso fare delle operazioni ma non cambio nessun dato sul db
from jobs;

-- alias -- cambia i nomi all'intestazione della tabella che viene selectata e fa operazioni
select job_title, min_salary as original, min_salary salary from jobs; -- con o senza as
select job_title, min_salary + 2000 "increased min salary" from jobs; -- la stringa ha apice singolo, nel caso dell'alias bisogna mettere doppi apici se è più di una parola

-- dual
select current_date from dual; -- dual: tabella fittizia, current date è un dato di sistema. Si può anche non scrivere dual
select 1+2, 3-4, 2*6, 5/2, current_date;

-- concatenation
select concat(country_id, "...", region_id, '!' ) as x
from countries; -- ; alla fine dello statement
