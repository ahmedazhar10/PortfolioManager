-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: stockschema
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bond`
--

USE Stockdb;

--
-- Table structure for table `cashaccounts`
--

DROP TABLE IF EXISTS `cashaccounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cashaccounts` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `institution` varchar(45) NOT NULL,
  `accountType` varchar(45) NOT NULL,
  `amount` float NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cashaccounts`
--

LOCK TABLES `cashaccounts` WRITE;
/*!40000 ALTER TABLE `cashaccounts` DISABLE KEYS */;
INSERT INTO `cashaccounts` VALUES (1,'Wells Fargo','Chequing',15000),(2,'Scotia Bank','Savings',6894),(3,'JP Morgan','Savings',9383),(4,'BMO','Savings',1531),(5,'RBC','Savings',7423);
/*!40000 ALTER TABLE `cashaccounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etf`

DROP TABLE IF EXISTS `networth`;
CREATE TABLE `networth` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `cash_ID` int NOT NULL,
  `user_name` varchar(45),
  PRIMARY KEY (`ID`),
  FOREIGN KEY (`cash_ID`) REFERENCES cashaccounts(`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
LOCK TABLES `networth` WRITE;
INSERT INTO `networth` VALUES (1,1,'Harry Kane'),(2,2,'p1'),(3,3,'p2'),(4,4,'p5'),(5,5,'p6');
UNLOCK TABLES;
--

DROP TABLE IF EXISTS `bond`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bond` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `issuer` varchar(45) NOT NULL,
  `coupon` float NOT NULL,
  `maturityDate` varchar(50) NOT NULL,
  `yieldPercentage` float NOT NULL,
  `bidPrice` float NOT NULL,
  `networth_id` int NOT NULL,
  FOREIGN KEY (`networth_id`) REFERENCES networth(`ID`),
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bond`
--

LOCK TABLES `bond` WRITE;
/*!40000 ALTER TABLE `bond` DISABLE KEYS */;
INSERT INTO `bond` VALUES (1,'Bell',8.8,'2025-11-06',8.67,100.46,1),(2,'BMO',6.54,'2022-08-13',7.65,120.56,1),(3,'BMO',5.9,'2023-09-13',4.57,99.65,1),(4,'Air Ca',7.5,'2022-07-19',6.78,98.23,1);
/*!40000 ALTER TABLE `bond` ENABLE KEYS */;
UNLOCK TABLES;

DROP TABLE IF EXISTS `etf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `etf` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `symbol` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `ytdReturn` float NOT NULL,
  `aum` float NOT NULL,
  `networth_id` int NOT NULL,
  FOREIGN KEY (`networth_id`) REFERENCES networth(`ID`),
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etf`
--

LOCK TABLES `etf` WRITE;
/*!40000 ALTER TABLE `etf` DISABLE KEYS */;
INSERT INTO `etf` VALUES (1,'BDRY','Breakwave Dry Bulk Shipping ETF',266.88,3846,1),(2,'RETL','Direxion Daily Retail Bull 3X Shares',158.02,52651,2);
/*!40000 ALTER TABLE `etf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `future`
--

DROP TABLE IF EXISTS `future`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `future` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `contractValue` float NOT NULL,
  `issuer` varchar(45) NOT NULL,
  `margin` float NOT NULL,
  `networth_id` int NOT NULL,
  FOREIGN KEY (`networth_id`) REFERENCES networth(`ID`),
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `future`
--

LOCK TABLES `future` WRITE;
/*!40000 ALTER TABLE `future` DISABLE KEYS */;
INSERT INTO `future` VALUES (1,499875,'S&P 500',5.1,1),(2,164113,'30yr UST Bonds',1.7,2);
/*!40000 ALTER TABLE `future` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock` (
  `ID` int NOT NULL,
  `ticker` varchar(45) NOT NULL,
  `volume` int NOT NULL,
  `purchasePrice` float NOT NULL,
  `closingPrice` float NOT NULL,
  `name` varchar(45) NOT NULL,
  `networth_id` int NOT NULL,
  FOREIGN KEY (`networth_id`) REFERENCES networth(`ID`),
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES
(1,'TSLA',20,816.12,701.16,'Tesla',1),(2,'JPM',50,50.24,72.44,'JP Morgen Chase Co',1),(3,'AMC',20,9.36,40.31,'AMC',1),(4,'GME',80,183.75,205.22,'Gamestop',1),(5,'WEN',2,22.13,23.18,'Wendys',1),
(6,'APPL',35,145.68,147.54,'Apple',1),(7,'BAC',10,44.53,42.04,'Bank of America Corp',1),(8,'WMT',100,136.67,137.35,'Walmart Inc',1),(9,'MCD',120,242.71,236.95,'McDonalds Corp',1),(10,'BA',10,197.23,216.5,'Boeing Co',1),
(11,'AMZN',10,701,772,'Tesla',1),(12,'C',50,3249.90,3316.00,'Amazon.com Inc',1),(13,'BBY',30,101.69,118.09,'Best Buy Co Inc',1),(14,'COST',80,370.72,449.31,'Costco',1),(15,'MSFT',2,239.42,299.09,'Microsoft',1);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-13 19:23:10
