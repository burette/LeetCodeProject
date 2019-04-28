# Write your MySQL query statement below
select a.Name as 'Employee' from Employee as a where a.Salary > (Select Salary from Employee where Id= a.ManagerId);