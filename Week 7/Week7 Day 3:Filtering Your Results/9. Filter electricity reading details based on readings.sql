select meter_id , total_units from electricity_reading 
where h13 < h14 
order by total_units desc;
