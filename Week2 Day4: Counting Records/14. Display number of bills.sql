select count(*) as count_of_bills_with_fine from bill 
where fine_amount is not null;
