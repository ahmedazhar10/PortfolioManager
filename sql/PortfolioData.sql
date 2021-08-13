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

DROP TABLE IF EXISTS `bond`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bond` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `issuer` varchar(45) NOT NULL,
  `coupon` float NOT NULL,
  `maturityDate` date NOT NULL,
  `yieldPercentage` float NOT NULL,
  `bidPrice` float NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bond`
--

LOCK TABLES `bond` WRITE;
/*!40000 ALTER TABLE `bond` DISABLE KEYS */;
INSERT INTO `bond` VALUES (1,'Bell',8.8,'2025-11-06',8.67,100.46),(2,'BMO',6.54,'2022-08-13',7.65,120.56),(3,'BMO',5.9,'2023-09-13',4.57,99.65),(4,'Air Ca',7.5,'2022-07-19',6.78,98.23);
/*!40000 ALTER TABLE `bond` ENABLE KEYS */;
UNLOCK TABLES;

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
  `holderName` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cashaccounts`
--

LOCK TABLES `cashaccounts` WRITE;
/*!40000 ALTER TABLE `cashaccounts` DISABLE KEYS */;
INSERT INTO `cashaccounts` VALUES (1,'Wells Fargo','Chequing',15000,'Harry Kane'),(2,'Scotia Bank','Savings',6894,'Harry Kane'),(3,'JP Morgan','Savings',9383,'Harry Kane');
/*!40000 ALTER TABLE `cashaccounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etf`
--

DROP TABLE IF EXISTS `etf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `etf` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `symbol` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `ytdReturn` float NOT NULL,
  `aum` float NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etf`
--

LOCK TABLES `etf` WRITE;
/*!40000 ALTER TABLE `etf` DISABLE KEYS */;
INSERT INTO `etf` VALUES (1,'BDRY','Breakwave Dry Bulk Shipping ETF',266.88,382846),(2,'RETL','Direxion Daily Retail Bull 3X Shares',158.02,52651);
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
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `future`
--

LOCK TABLES `future` WRITE;
/*!40000 ALTER TABLE `future` DISABLE KEYS */;
INSERT INTO `future` VALUES (1,499875,'S&P 500',5.1),(2,164113,'30yr UST Bonds',1.7);
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
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES (1,'TSLA',20,701,772,'Tesla'),(2,'C',50,69,77,'Citigroup'),(3,'AMC',20,6,65,'AMC'),(4,'GME',80,4,168,'Gamestop'),(5,'WEN',2,24,19,'Wendy\'s');
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