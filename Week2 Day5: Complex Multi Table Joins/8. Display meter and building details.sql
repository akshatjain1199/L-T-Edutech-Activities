SELECT m.meter_number, bg.owner_name, bg.address
FROM building bg
JOIN meter m ON m.building_id = bg.id
JOIN bill b ON m.id = b.meter_id
where b.is_payed>0 and b.fine_amount>0 
group by m.meter_number
ORDER BY count(b.id) desc,  bg.owner_name ASC
limit 1;
