
select meter_number from meter where id in
 (select meter_id from bill where total_units in ( select min(total_units) from bill))
order by meter_number asc;
