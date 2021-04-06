DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `AddressId` int,
  `PersonId` int,
  `City` varchar(255),
  `State` varchar(255)
);
INSERT INTO `address` VALUES (1, 2, 'New York City', 'New York');

DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `PersonId` int,
  `FirstName` varchar(255),
  `LastName` varchar(255)
);
INSERT INTO `person` VALUES (1, 'Allen', 'Wang');

SELECT
    p.FirstName,
    p.LastName,
    a.City,
    a.State 
FROM
    person p
    LEFT JOIN address a ON p.PersonId = a.PersonId