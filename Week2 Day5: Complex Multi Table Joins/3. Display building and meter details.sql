select bg.owner_name , bg.address , m.meter_number , b.payable_amount 
from building bg
join meter m on bg.id= m.building_id
join bill b on m.id=b.meter_id
where b.fine_amount is null and (b.month=12 and b.year= 2017)
order by bg.owner_name asc;
