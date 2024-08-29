# Write your MySQL query statement below
Select name
from Customer 
where NOT referee_id=2 OR referee_id is null;