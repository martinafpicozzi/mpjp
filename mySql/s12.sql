-- that one
select * -- tutte le colonne
from regions
where region_id = 1; -- where indica le righe

-- the other ones
select *
from regions
where region_id != 2;

-- strictly less than
select *
from regions
where region_id < 3;

-- less or equal to
select *
from regions
where region_id <= 3;
