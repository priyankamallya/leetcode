# Write your MySQL query statement below
select e.name as Employee
from employee as m
inner join employee as e 
on m.id = e.managerId
where e.salary >m.salary; 