-- Last updated: 7/23/2026, 9:35:07 AM
# Write your MySQL query statement below
Select
(select distinct Salary
from Employee order by salary desc
limit 1 offset 1)
as SecondHighestSalary;