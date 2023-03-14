select b.owner_name, bt.name, m.meter_number, if(bi.is_payed=0, 'Not Paid Yet', bi.payment_date) as Payment_Status
from building_type bt
join building b on bt.id=b.building_type_id
join  meter m on b.id=m.building_id
join  bill bi on m.id=bi.meter_id
where bi.month=12 and bi.year=2017
order by b.owner_name asc;
