SELECT pt.name as productName, pc.name as producerName 
FROM product pt join producer pc
on pt.producer_id = pc.id;