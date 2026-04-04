-- Write your query below
-- USING SUBQUERY
-- SELECT name FROM customers where id NOT IN (SELECT customer_id FROM orders);

-- USING JOIN
SELECT c.name FROM customers as c LEFT JOIN orders as o ON c.id=o.customer_id WHERE 
o.id is NULL;
