-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 19-Jun-2016 às 02:54
-- Versão do servidor: 5.7.9
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_masdsapp`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_users`
--

DROP TABLE IF EXISTS `tb_users`;
CREATE TABLE IF NOT EXISTS `tb_users` (
  `ID` int(3) NOT NULL AUTO_INCREMENT,
  `login` varchar(10) DEFAULT NULL,
  `senha` varchar(10) DEFAULT NULL,
  `tipo` int(2) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_users`
--

INSERT INTO `tb_users` (`ID`, `login`, `senha`, `tipo`) VALUES
(1, 'masds', 'terra', 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
