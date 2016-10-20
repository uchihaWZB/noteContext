-- 将B表中的cc列插入A表中的cc列，条件：A表的a值等于B表的b值
UPDATE A INNER JOIN B ON A.a = B.b
set A.cc = B.cc