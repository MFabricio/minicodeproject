-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 27, 2019 at 07:40 PM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.1.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `minicodeprojectdb`
--
CREATE DATABASE IF NOT EXISTS `minicodeprojectdb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `minicodeprojectdb`;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `ID` int(11) NOT NULL,
  `FirstName` varchar(45) NOT NULL,
  `MiddleInitial` varchar(45) DEFAULT NULL,
  `LastName` varchar(45) NOT NULL,
  `DateOfBirth` date NOT NULL,
  `DateOfEmployment` date NOT NULL,
  `Status` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`ID`, `FirstName`, `MiddleInitial`, `LastName`, `DateOfBirth`, `DateOfEmployment`, `Status`) VALUES
(1, 'Mario', 'Fabricio', 'Lopez Perez', '1993-01-06', '2019-07-18', 1),
(2, 'Jennifer', NULL, 'Perez', '2000-11-01', '2019-07-01', 1),
(3, 'Alucard', NULL, 'Tepes', '1980-01-01', '2018-12-02', 1),
(4, 'Howard', 'Phillips', 'Lovecraft', '1980-08-20', '2017-08-07', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
