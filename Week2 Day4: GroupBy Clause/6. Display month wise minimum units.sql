select month, min(total_units) as minimum_units from  bill
group by month;
