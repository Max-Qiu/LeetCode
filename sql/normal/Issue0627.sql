-- 627. 变更性别 https://leetcode-cn.com/problems/swap-salary/
DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary`  (
  `id` int NULL DEFAULT NULL,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sex` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `salary` int NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

INSERT INTO `salary` VALUES (1, 'A', 'f', 2500);
INSERT INTO `salary` VALUES (2, 'B', 'm', 1500);
INSERT INTO `salary` VALUES (3, 'C', 'f', 5500);
INSERT INTO `salary` VALUES (4, 'D', 'm', 500);

UPDATE salary 
SET sex = IF(sex="m","f","m")