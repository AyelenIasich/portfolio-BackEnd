CREATE DATABASE  IF NOT EXISTS `java17` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `java17`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: java17
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `soft_skill`
--

DROP TABLE IF EXISTS `soft_skill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `soft_skill` (
  `id` bigint NOT NULL,
  `porcentaje_soft` int NOT NULL,
  `soft_skill` varchar(255) DEFAULT NULL,
  `url_soft` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `soft_skill`
--

LOCK TABLES `soft_skill` WRITE;
/*!40000 ALTER TABLE `soft_skill` DISABLE KEYS */;
INSERT INTO `soft_skill` VALUES (81,100,'Empatía','https://i.ibb.co/874Lzcn/empatia.png'),(94,100,'Autodidacta','https://i.ibb.co/wpG9qcN/biblioteca-en-linea.png'),(95,100,'Proactiva','https://i.ibb.co/3mLn32x/proactivo.png'),(96,100,'Colaboración','https://i.ibb.co/CJHWMQ4/unido.png'),(97,95,'Comunicación','https://i.ibb.co/9ycmkw3/burbuja-de-dialogo.png'),(99,100,'Creatividad','https://i.ibb.co/9hhnxbc/creatividad.png'),(100,90,'Pensamiento Critico','https://i.ibb.co/QfNP37V/mentalidad.png'),(129,83,'Nivel de Inglés:   C2','https://i.ibb.co/4RXWSFm/eng.png'),(132,90,'Capacidad Resolutiva','https://i.ibb.co/4t8bYDS/problema.png');
/*!40000 ALTER TABLE `soft_skill` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-23 19:11:33
