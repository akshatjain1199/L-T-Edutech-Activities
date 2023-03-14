select rate from slab where connection_type_id in
(select id from electricity_connection_type where id in 
 (select connection_type_id from building_type where id in
  (select building_type_id from building where id in
   (select building_id from  meter where meter_number = 'SG567423'))));
