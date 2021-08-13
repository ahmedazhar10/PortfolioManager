CREATE DATABASE stockschema;
CREATE TABLE `stock` (
  `ID` int NOT NULL,
  `ticker` varchar(45) NOT NULL,
  `volume` int NOT NULL,
  `purchasePrice` int NOT NULL,
  `closingPrice` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `stock` VALUES (1,'TSLA',20,701,772),(2,'C',50,69,77),(3,'AMC',20,6,65),(4,'GME',80,4,168),(5,'WEN',2,24,19);




