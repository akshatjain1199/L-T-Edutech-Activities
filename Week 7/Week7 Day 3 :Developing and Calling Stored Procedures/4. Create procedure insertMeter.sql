create procedure  insertMeter 
(meter_number varchar(100),building_id int
)
begin
  declare new_id int  default 0;
  select count(*)  into new_id from meter;
    insert into meter(id, meter_number, building_id) values (new_id+1, meter_number, building_id);
end;
	
    
   
