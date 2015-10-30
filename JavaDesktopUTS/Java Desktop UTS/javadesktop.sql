-- phpMyAdmin SQL Dump
-- version 4.4.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 29, 2015 at 07:57 PM
-- Server version: 5.5.32
-- PHP Version: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javadesktop`
--

-- --------------------------------------------------------

--
-- Table structure for table `tabelgaji`
--

CREATE TABLE IF NOT EXISTS `tabelgaji` (
  `IdGaji` int(12) NOT NULL,
  `IdKaryawan` int(12) NOT NULL,
  `NamaKaryawan` varchar(30) NOT NULL,
  `Jabatan` varchar(30) NOT NULL,
  `Bulan` varchar(20) NOT NULL,
  `Tahun` int(15) NOT NULL,
  `GajiLembur` int(15) NOT NULL,
  `GajiPokok` int(15) NOT NULL,
  `Total` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tabelgajilembur`
--

CREATE TABLE IF NOT EXISTS `tabelgajilembur` (
  `IdLembur` int(12) NOT NULL,
  `IdKaryawan` int(12) NOT NULL,
  `JamLembur` varchar(20) NOT NULL,
  `GajiLembur` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabelgajilembur`
--

INSERT INTO `tabelgajilembur` (`IdLembur`, `IdKaryawan`, `JamLembur`, `GajiLembur`) VALUES
(456, 123, '12', 600000);

-- --------------------------------------------------------

--
-- Table structure for table `tabeljabatan`
--

CREATE TABLE IF NOT EXISTS `tabeljabatan` (
  `IdJabatan` int(10) NOT NULL,
  `Jabatan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabeljabatan`
--

INSERT INTO `tabeljabatan` (`IdJabatan`, `Jabatan`) VALUES
(121, 'IT Support'),
(123, 'Web Programming'),
(124, 'Web Developer'),
(125, 'Web Designer');

-- --------------------------------------------------------

--
-- Table structure for table `tabelkaryawan`
--

CREATE TABLE IF NOT EXISTS `tabelkaryawan` (
  `IdKaryawan` int(12) NOT NULL,
  `NamaKaryawan` varchar(50) NOT NULL,
  `Jabatan` varchar(30) NOT NULL,
  `JenisKelamin` varchar(15) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `GajiPokok` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabelkaryawan`
--

INSERT INTO `tabelkaryawan` (`IdKaryawan`, `NamaKaryawan`, `Jabatan`, `JenisKelamin`, `Alamat`, `GajiPokok`) VALUES
(123, 'Arief Rachman', 'Manager', 'Laki-laki', 'Ciracas, Jaktim', 7000000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tabelgaji`
--
ALTER TABLE `tabelgaji`
  ADD PRIMARY KEY (`IdGaji`);

--
-- Indexes for table `tabelgajilembur`
--
ALTER TABLE `tabelgajilembur`
  ADD PRIMARY KEY (`IdLembur`);

--
-- Indexes for table `tabeljabatan`
--
ALTER TABLE `tabeljabatan`
  ADD PRIMARY KEY (`IdJabatan`);

--
-- Indexes for table `tabelkaryawan`
--
ALTER TABLE `tabelkaryawan`
  ADD PRIMARY KEY (`IdKaryawan`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
