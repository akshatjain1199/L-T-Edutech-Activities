select sum(payable_amount) as sum_payable_amount from  bill
where year(payment_date) = 2018;
