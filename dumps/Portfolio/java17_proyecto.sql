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
-- Table structure for table `proyecto`
--

DROP TABLE IF EXISTS `proyecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proyecto` (
  `id` bigint NOT NULL,
  `descripcion_proyecto` varchar(255) DEFAULT NULL,
  `tecnologias` varchar(255) DEFAULT NULL,
  `titulo_proyecto` varchar(255) DEFAULT NULL,
  `url_imagen` varchar(255) DEFAULT NULL,
  `url_proyecto` varchar(255) DEFAULT NULL,
  `url_repositorio` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyecto`
--

LOCK TABLES `proyecto` WRITE;
/*!40000 ALTER TABLE `proyecto` DISABLE KEYS */;
INSERT INTO `proyecto` VALUES (102,'Portfolio artístico para mi hermano Jorge Iasich el cual es artista plástico. Continua en proceso de desarrollo. ','Bootstrap, CSS , Js','Proyecto Portfolio Artístico','https://i.ibb.co/9chZD8w/Primer-Proyecto.jpg','https://ayeleniasich.github.io/primerproyecto.github.io/','https://github.com/AyelenIasich/primerproyecto.github.io.git'),(103,'Mi primer juego con el descubrí el mundo de la programación. Utiliza una librería llamada Kaboom.Js para ayudarte a hacer juegos. \n                  ','HTML, Js, Kaboom.Js','Réplica del clásico Mario','https://i.ibb.co/z52G067/Mi-Primer-Juego.jpg','https://ayeleniasich.github.io/miprimerjuego.github.io/','https://github.com/AyelenIasich/miprimerjuego.github.io.git'),(104,'Proyecto final del Curso de Desarrollo Web Full Stack. Es una aplicación web full stack con arquitectura distribuida.','Angular, Bootstrap, CSS, Spring boot','Argentina Programa #YoProgramo','https://i.ibb.co/XFJ7D3y/Portfolio.jpg','urldelportfolio','https://github.com/AyelenIasich/PortfolioFrontEnd.git');
/*!40000 ALTER TABLE `proyecto` ENABLE KEYS */;
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
