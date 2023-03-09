select bt.name , count(bt.id) as number_of_buildings  
from building bg
inner join building_type bt on bt.id=bg.building_type_id
group by bt.id
order by bt.name asc;
