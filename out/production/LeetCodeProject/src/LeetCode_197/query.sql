# Write your MySQL query statement below
# date_sub(日期，天数)返回此日期天数前的日期
select Id from Weather as a where Temperature > (select Temperature from Weather where RecordDate = date_sub(a.RecordDate,interval 1 day));


#此方法效率更高
# Write your MySQL query statement below
select w1.Id from Weather w1,Weather w2 where w1.Temperature > w2.Temperature and datediff(w1.RecordDate,w2.RecordDate)=1;