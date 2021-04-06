DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `Id` int,
  `Salary` int
);
INSERT INTO `employee` VALUES (1, 100);
INSERT INTO `employee` VALUES (2, 200);
INSERT INTO `employee` VALUES (3, 300);

SELECT IFNULL (
(
    SELECT DISTINCT
        e.Salary 
    FROM
        `employee` e 
    ORDER BY
        e.Salary DESC
        LIMIT 1,
        1
), NULL ) AS SecondHighestSalary;