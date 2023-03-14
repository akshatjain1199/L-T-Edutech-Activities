select year(date) , count(*) as number_of_events from event
group by year(date) order by date;
