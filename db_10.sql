-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bmicalculator
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.22-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `blockdetails`
--

DROP TABLE IF EXISTS `blockdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blockdetails` (
  `user_id` int(10) NOT NULL,
  `blocked_id` int(10) NOT NULL,
  PRIMARY KEY (`user_id`,`blocked_id`),
  KEY `blocked_idx` (`blocked_id`),
  CONSTRAINT `blocked` FOREIGN KEY (`blocked_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blockdetails`
--

LOCK TABLES `blockdetails` WRITE;
/*!40000 ALTER TABLE `blockdetails` DISABLE KEYS */;
INSERT INTO `blockdetails` VALUES (1,2);
/*!40000 ALTER TABLE `blockdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bmi`
--

DROP TABLE IF EXISTS `bmi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bmi` (
  `bmi_id` int(10) NOT NULL AUTO_INCREMENT,
  `classification` varchar(512) NOT NULL DEFAULT 'belum tercatat',
  `bmi_value` decimal(10,2) NOT NULL,
  `height` decimal(10,2) NOT NULL,
  `weight` decimal(10,2) NOT NULL,
  `date` date NOT NULL DEFAULT current_timestamp(),
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`bmi_id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bmi`
--

LOCK TABLES `bmi` WRITE;
/*!40000 ALTER TABLE `bmi` DISABLE KEYS */;
INSERT INTO `bmi` VALUES (4,'Obesity',30.00,180.00,94.59,'2023-01-09',1),(5,'Overweight',29.00,180.00,92.28,'2023-02-07',1),(6,'Overweight',28.00,180.00,90.13,'2023-03-08',1),(8,'Overweight',28.00,180.00,88.74,'2023-04-09',1),(9,'Overweight',27.00,180.00,86.32,'2023-05-08',1),(10,'Overweight',26.00,180.00,84.16,'2023-06-09',1),(24,'Underweight',17.00,165.00,45.00,'2023-07-21',2);
/*!40000 ALTER TABLE `bmi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(512) NOT NULL,
  `email` varchar(512) NOT NULL,
  `password` varchar(512) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'ahmad','29b02e00bb749f5d5f57a725e4799e241eef9b2d40b89f2b55447ea015ecba5986c79720bb51c642437b402bacdb0aae4988012a72decced7fb852175bc59ac7','6cf7f0cfa998f0665519ca42ab199c1281c24e3a171971c98d3ebee20ca5bdce3af0f3581d131dffa87b689f6571f03dd26713cef0c91e6d4284170c4665a372'),(2,'ryan','99ad8688cdac83145f3df4f3fb76458193a5f630d071dd9669bca40d0355177c65dced9574b121c0d726910929b349ba22f50eee306759f58e494e16085f3ad3','2f726bc26bf611fa4426e784aa15711682020f7d0705438eb3c674513aa70ef0f99d5d8702d86c18b5163556d1bdbdf10f33800b9b38b23d1fe399d4a5607515'),(3,'nyamuk','f805bb29fea37cb3302fd85f0f8f03738965120a2d8e9b8e76231ace64c5f7114e6e1b33c6dcc3efac5892d87046604c65f75d774c6783f8f76f52f1d374cd8a','45218b8018424674a831796c6f29c356402deb8ced0ba8ad142c4bd72238e88b87d64aee1bf829f22aec3ef416d377c5f5aabc3c2ebb16e876a4c19d1626f0d6'),(4,'lalat','12d132d87b3444ce8b09a6c603fb73e96ffb320c0e79afd61a8a40e15250e05442c06ccd8ae9b534842b3c1fc3a9c1f02e0d7815b19c11110f537dd586076e3c','12d4c9c2e2ecddfdea7eb7ded664478325c26738f843564c6b1250473ce3f68533afeb352eecf7e950033af94b882700ca7f41d75786a569630f05f6fc074b62'),(5,'ansa','d52ec598cdd0bd60db7372b3e08471a7e3f87987fc746f0271904fcf51b2e1311d7380924847a2343911c6870ba9b742a7c7afcbc49a2a615218bc3a3506fa7e','18ca44fc7945559eff145d6ea7486945ac3d796806c7d13aab9b61c4e7383ebd319c649fbdbac1cf29a9fde104e6bd6d52756c2626e85eee0690be5318be11ed'),(25,'Rena','2f23ad13b4ac643f7d0282eb574b55d002b12a05f5006d7e6d9dd51844014df7eb148ad2f7f8c2f65b041d2b6d6722983498013a6897a25df66e77c0115b3436','520ae28c3d8ddd845e074599de5a390f19451b49bddce56d408c32586bd3014b06a957fde3f078201185d67e4bbac07b6b8a40e1ce65dcd7651f9ad907fcc880');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-21 19:27:00
