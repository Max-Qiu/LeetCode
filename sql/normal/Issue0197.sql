DROP TABLE IF EXISTS `weather`;
CREATE TABLE `weather`  (
  `Id` int,
  `RecordDate` date,
  `Temperature` int
);
INSERT INTO `weather` VALUES (1, '2015-01-01', 10);
INSERT INTO `weather` VALUES (2, '2015-01-02', 25);
INSERT INTO `weather` VALUES (3, '2015-01-03', 20);
INSERT INTO `weather` VALUES (4, '2015-01-04', 30);

SELECT
    w1.Id 
FROM
    `weather` w1
    LEFT JOIN weather w2 ON w1.RecordDate = DATE_ADD( w2.RecordDate, INTERVAL 1 DAY ) 
WHERE
    w1.Temperature > w2.Temperature