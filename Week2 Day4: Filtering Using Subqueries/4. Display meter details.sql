select meter_number from meter where building_id in 
(select id from building where building_type_id  in
 (select id from building_type where name = 'College')) order by meter_number asc;
