create procedure findTotalUnits(in meter_number varchar(100))
begin
select e.total_units from electricity_reading e inner join meter m on m.id=e.meter_id
where m.meter_number=meter_number;
end
