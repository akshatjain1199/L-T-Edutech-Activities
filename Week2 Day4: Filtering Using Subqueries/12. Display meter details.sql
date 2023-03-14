
select meter_number from meter where id in
 (select meter_id from electricity_reading where h20 in ( select max(h20) from electricity_reading));
