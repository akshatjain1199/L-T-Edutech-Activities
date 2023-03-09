select  m.meter_number , bg.owner_name ,bg.address
from building bg
join meter m on bg.id= m.building_id
join bill b on m.id=b.meter_id
where b.fine_amount in 
(select min(b1.fine_amount) from bill b1 where b1.fine_amount >
(select min(b2.fine_amount) from bill b2))
order by bg.owner_name asc;
