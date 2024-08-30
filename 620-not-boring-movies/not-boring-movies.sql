# Write your MySQL query statement below
select id,movie,description,rating
from cinema
where not description="boring"
and mod(id,2)=1
order by rating desc;