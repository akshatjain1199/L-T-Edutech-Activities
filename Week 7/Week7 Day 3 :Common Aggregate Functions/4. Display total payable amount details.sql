select sum(payable_amount) as sum_payable_amount from bill
where due_date =  '2017-10-01';
