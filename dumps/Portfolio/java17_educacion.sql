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
-- Table structure for table `educacion`
--

DROP TABLE IF EXISTS `educacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `educacion` (
  `id` bigint NOT NULL,
  `fin` int NOT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `inicio` int NOT NULL,
  `lugar` varchar(255) DEFAULT NULL,
  `modalidad` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `title_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `educacion`
--

LOCK TABLES `educacion` WRITE;
/*!40000 ALTER TABLE `educacion` DISABLE KEYS */;
INSERT INTO `educacion` VALUES (10,2022,'https://i.ibb.co/2S7gGnd/Logo-Alineado-Logo-APcopia.png',2022,'Argentina','Bootcamp Online','Argentina Programa: #YoProgramo','Full Stack Developer Jr.','',NULL,NULL),(11,2022,'https://i.ibb.co/gZpByJs/ipesfa.png',2017,'Ushuaia. Gdor. Deloqui 9410','Terceario','IPES “Florentino Ameghino”',' Profesorado de Inglés','',NULL,NULL),(13,2022,'https://i.ibb.co/wh69ZKF/platzi.png',2022,NULL,'','Platzi: ‎Cursos Online Profesionales','Curso de Angular: Componentes y Servicios','Certificación:','https://platzi.com/p/ashee/curso/1758-html-practico/diploma/detalle/','Componentes y Servicios'),(19,2022,'https://i.ibb.co/wh69ZKF/platzi.png',2022,NULL,NULL,' Platzi: ‎Cursos Online Profesionales','Curso Práctico de HTML y CSS','Certificación:','https://platzi.com/p/ashee/curso/1758-html-practico/diploma/detalle/','Curso Práctico de HTML y CSS'),(31,2022,'https://i.ibb.co/wh69ZKF/platzi.png',2022,NULL,'','Platzi: ‎Cursos Online Profesionales ','Curso de Bootstrap','Certificación:','https://platzi.com/p/ashee/curso/1331-bootstrap/diploma/detalle/','Bootstrap'),(32,2022,'https://i.ibb.co/wh69ZKF/platzi.png',2022,NULL,'',' Platzi: ‎Cursos Online Profesionales','Curso de Fundamentos de Angular','Certificación:','https://platzi.com/p/ashee/curso/2478-course/diploma/detalle/','Fundamentos de Angular'),(33,2022,'https://i.ibb.co/wh69ZKF/platzi.png',2022,NULL,'','Platzi: ‎Cursos Online Profesionales ','Curso de Fundamentos de TypeScript','Certificación:','https://platzi.com/p/ashee/curso/1869-typescript-2020/diploma/detalle/','Fundamentos de TypeScript'),(34,2022,'https://i.ibb.co/wh69ZKF/platzi.png',2022,NULL,'','Platzi: ‎Cursos Online Profesionales','Configuración de Entorno de Desarrollo en Windows','Certificación:','https://platzi.com/p/ashee/course/2042-prework-windows/diploma/detalle/','Curso de Pre Work'),(35,2022,'https://i.ibb.co/wh69ZKF/platzi.png',2022,NULL,'','Platzi: ‎Cursos Online Profesionales','Curso Básico de JavaScript','Certificación:','https://platzi.com/p/ashee/course/1814-basico-javascript/diploma/detalle/','Curso Básico de JavaScript'),(36,2022,'https://i.ibb.co/wh69ZKF/platzi.png',2022,NULL,'','Platzi: ‎Cursos Online Profesionales','Curso Gratis de Programación Básica,','Certificación:','https://platzi.com/p/ashee/course/1050-programacion-basica/diploma/detalle/','Programación Básica'),(37,2021,'https://i.ibb.co/2S7gGnd/Logo-Alineado-Logo-APcopia.png',2021,NULL,'','Argentina Programa: #SéProgramar ','Argentina Programa Octubre - Diciembre 2021','Certificación:','https://mumuki.io/argentina-programa/certificates/verify/8PZk6_FkQh4QY4Cg','\"Sé Programar\"'),(38,2008,'https://i.ibb.co/Mfrq3SH/Whats-App-Image-2022-08-07-at-10-32-1.png',2007,NULL,'','Instituto de Idiomas “Oscar Wilde”','Cursos aprobados: “Teens 2 y 3”','Curso de inglés presencial','',''),(39,2014,'https://i.ibb.co/Mfrq3SH/Whats-App-Image-2022-08-07-at-10-32-1.png',2014,NULL,'','Instituto de Idiomas “Oscar Wilde”','Curso aprobado: “Teens 4”','Curso de inglés presencial','',''),(40,2014,'https://i.ibb.co/ZNbq6Vv/descarga-1.png',2014,NULL,'','Conservatorio de Artes  “Scaramuzza”','Profesorado de música ','“Instrumento Piano, Teoría y Solfeo”','',''),(41,2010,'https://i.ibb.co/bXx292M/epet.png',2008,NULL,'','Colegio Técnico Provincial ','Educación Polimodal  Modalidad Economía y Gestión de las Organizaciones ','','',''),(42,2008,'https://i.ibb.co/SnBRfBK/donbosco.png',2004,NULL,'','Colegio Don Bosco Casa Salesiana,','Secundario con orientación en economía','','',''),(131,2020,'https://i.ibb.co/wCXH4Vx/efset.png',2020,NULL,'','Nivel de Inglés: EF SET Certificate','C2 Proficient','download','https://www.efset.org/cert/aTCVHG','EF SET Certificate');
/*!40000 ALTER TABLE `educacion` ENABLE KEYS */;
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
