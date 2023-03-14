SELECT distinct  mt.position , mt.updated_time , mt.forward , ts.scheduled_time , tat.actual_time
FROM train_arrival_time tat 
inner join train_schedule ts on tat.train_schedule_id=ts.id
inner join metro_train mt on ts.metro_train_id = mt.id
inner join route r on mt.route_id =r.id
where r.route_name= 'North South line' or r.route_name= 'Circle line'
order by mt.position asc;
