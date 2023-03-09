select bg.owner_name , bg.address , m.meter_number , b.payable_amount 
from building bg
join meter m on bg.id= m.building_id
join bill b on m.id=b.meter_id
where b.fine_amount in(select max(bl.fine_amount) from bill bl)
order by bg.owner_name asc;
