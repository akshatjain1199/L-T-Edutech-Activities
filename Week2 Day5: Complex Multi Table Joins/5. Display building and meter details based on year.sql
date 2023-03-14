select bg.owner_name, sum(b.payable_amount) as TotalBillAMount 
from building bg
join meter m on m.building_id=bg.id
join bill b on b.meter_id=m.id 
where m.id=(select b1.meter_id from bill b1 where b1.payable_amount in 
 (select max(b2.payable_amount) from bill b2 where b2.fine_amount is null and b2. year=2017)) 
order by bg.owner_name;
