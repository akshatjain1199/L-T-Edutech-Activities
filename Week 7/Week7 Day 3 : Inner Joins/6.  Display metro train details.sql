select mt.position,mt.updated_time,mt.forward,ts.scheduled_time,ta.actual_time
from metro_train mt
inner join route r
on r.id=mt.route_id
inner join train_schedule ts
on mt.id= ts.metro_train_id
inner join train_arrival_time ta
on mt.id=ta.metro_train_id
where r.route_name='North South line'  or r.route_name='Circle line'
order by mt.position asc;
