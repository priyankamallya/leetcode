# Write your MySQL query statement below
select w1.id
from weather w1
join weather w2 on DATE(w1.recordDate) = DATE(w2.recordDate) + INTERVAL 1 DAY
WHERE w1.temperature > w2.temperature;