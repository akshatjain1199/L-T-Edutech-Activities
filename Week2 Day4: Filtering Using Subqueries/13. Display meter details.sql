
select meter_number from meter where id in
 (select meter_id from electricity_reading where h21 in ( select min(h21) from electricity_reading));
