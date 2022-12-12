SELECT * FROM demo_injection.producer pc
left join product pt
on pc.id = pt.producer_id
