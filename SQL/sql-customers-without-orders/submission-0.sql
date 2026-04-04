-- Write your query below
SELECT name FROM customers where id NOT IN (SELECT customer_id FROM orders);