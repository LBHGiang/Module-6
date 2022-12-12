SELECT pc.*, sum(ifnull(pt.price * pt.quantity, 0)) as income  FROM demo_injection.producer pc
left join product pt
on pc.id = pt.producer_id
group by pc.id;

