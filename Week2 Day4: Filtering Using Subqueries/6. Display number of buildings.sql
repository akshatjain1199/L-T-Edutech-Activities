select count(building_type_id) as building_count from building where id in
(select building_id from meter where id in
(select meter_id from bill where fine_amount is not null));

--------------------------------OR------------------------------

select count(distinct meter_id) as building_count from bill where fine_amount is not null
