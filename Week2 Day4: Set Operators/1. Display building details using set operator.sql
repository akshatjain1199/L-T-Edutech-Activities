select * from building where owner_name =  'Muzzammil'
union
select * from building where owner_name = 'Nicholas'
order by owner_name , email_address asc;
