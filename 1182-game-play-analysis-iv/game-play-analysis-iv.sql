# Write your MySQL query statement below
select round(count(DISTINCT player_id) / (select count(distinct player_id) from activity),2) as fraction
from activity 
where (player_id,DATE_SUB(event_date, INTERVAL 1 DAY)) in 
(select player_id,MIN(event_date) AS first_login from activity group by player_id);