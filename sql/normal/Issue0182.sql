DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `Id` int,
  `Email` varchar(255)
);
INSERT INTO `person` VALUES (1, 'a@b.com');
INSERT INTO `person` VALUES (2, 'c@d.com');
INSERT INTO `person` VALUES (3, 'a@b.com');

SELECT
    p.Email 
FROM
    `person` p 
GROUP BY
    p.Email 
HAVING
    COUNT( p.Id ) > 1;