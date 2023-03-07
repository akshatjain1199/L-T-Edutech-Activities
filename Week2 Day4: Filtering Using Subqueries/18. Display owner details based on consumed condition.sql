select owner_name from building where id in 
(select building_id from meter where id in
 (select meter_id from electricity_reading where total_units = 
(select min(total_units) from electricity_reading)));
