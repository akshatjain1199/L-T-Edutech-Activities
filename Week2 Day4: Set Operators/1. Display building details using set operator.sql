select * from building where owner_name =  'Muzzammil'  and owner_name = 'Nicholas'
union
select * from building order by owner_name , email_address asc;
