# Write your MySQL query statement below
select visited_on, amount, ROUND(amount/7,2) as average_amount
from(
    select distinct visited_on,
    SUM(amount) OVER(ORDER BY visited_on RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW) amount,
    MIN(visited_on) OVER() 1st_date
    FROM Customer
) t
where visited_on>=1st_date+6;