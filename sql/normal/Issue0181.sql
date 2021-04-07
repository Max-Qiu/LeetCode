DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `Id` int,
  `Name` varchar(255),
  `Salary` int,
  `ManagerId` int
);
INSERT INTO `employee` VALUES (1, 'Joe', 70000, 3);
INSERT INTO `employee` VALUES (2, 'Henry', 80000, 4);
INSERT INTO `employee` VALUES (3, 'Sam', 60000, NULL);
INSERT INTO `employee` VALUES (4, 'Max', 90000, NULL);

SELECT
    e1.`Name` 'Employee'
FROM
    employee e1
    LEFT JOIN employee e2 ON e1.ManagerId = e2.Id 
WHERE
    e1.Salary > e2.Salary