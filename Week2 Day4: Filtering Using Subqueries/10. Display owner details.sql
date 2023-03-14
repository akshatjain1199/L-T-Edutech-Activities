select owner_name from building where id in
(select building_id from meter where id in
 (select meter_id from bill where total_units in ( select max(total_units) from bill)))
order by owner_name asc;
