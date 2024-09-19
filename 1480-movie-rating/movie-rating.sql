# Write your MySQL query statement below
(select u.name as results
from users as u 
join movieRating as m 
on u.user_id = m.user_id
group by u.name
order by count(*) desc, name
limit 1)

union all

(select m.title as results
from movies as m 
join movieRating as mr
on m.movie_id = mr.movie_id
where mr.created_at like '2020-02%'
group by m.movie_id
order by avg(mr.rating) desc, m.title
limit 1)