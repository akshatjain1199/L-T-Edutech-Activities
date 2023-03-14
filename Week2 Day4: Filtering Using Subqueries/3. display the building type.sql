select name from building_type where id in
(select building_type_id from building where id in
 (select building_id from meter where meter_number = 'SG824012') ) ;
