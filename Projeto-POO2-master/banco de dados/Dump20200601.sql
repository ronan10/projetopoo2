CREATE DATABASE  IF NOT EXISTS `episodiosdao` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `episodiosdao`;
-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: episodiosdao
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `episodio`
--

DROP TABLE IF EXISTS `episodio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `episodio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `temporada` varchar(45) NOT NULL,
  `ano` int NOT NULL,
  `episodioassistido` tinyint NOT NULL,
  `nota` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `episodio`
--

LOCK TABLES `episodio` WRITE;
/*!40000 ALTER TABLE `episodio` DISABLE KEYS */;
INSERT INTO `episodio` VALUES (1,'Episodio 1','Primeira',2014,1,'Bom'),(2,'Episodio 2','Segunda',2016,0,NULL),(3,'Episodio 1','Terceira',2017,1,'Excelente'),(4,'Episodio 5','Primeira',2014,0,NULL),(5,'Episodio 2','Primeira',2014,1,'Ruim'),(6,'Episodio 4','Quinta',2019,1,'Bom'),(7,'Episodio 5','Segunda',2016,1,'Bom'),(8,'Episoidio 7','Quinta',2019,1,'Excelente'),(9,'Episodio 8','Quinta',2019,1,'Excelente'),(10,'Episodio 10','Quinta',2019,1,'Bom'),(11,'Episodio 11','Quinta',2019,1,'Ruim'),(12,'Episodio 12','Quinta',2019,1,'Bom'),(13,'Episodio 13','Quinta',2019,1,'Excelente'),(14,'Episodio 14','Quinta',2019,1,'Bom'),(15,'Episodio 15','Quinta',2019,0,NULL);
/*!40000 ALTER TABLE `episodio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'episodiosdao'
--

--
-- Dumping routines for database 'episodiosdao'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-01 16:07:13
