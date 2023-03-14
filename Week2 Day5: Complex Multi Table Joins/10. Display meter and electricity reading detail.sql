select m.meter_number , sum(er.total_units) as month_total_unit , b.payable_amount , 
sum(er.h6+er.h7+er.h8+er.h9+er.h10+er.h11) as morning , 
sum(er.h12+er.h13+er.h14+er.h15) as afternoon,
sum(er.h16+er.h17+er.h18+er.h19) as evening,
sum(er.h20+er.h21+er.h22+er.h23+er.h24+er.h1+er.h2+er.h3+er.h4+er.h5) as night
from electricity_reading er 
join meter m on m.id= er.meter_id
join bill b on b.meter_id=m.id
where b.month = 12 and b.year=2017 
group by m.meter_number
order by month_total_unit desc;
