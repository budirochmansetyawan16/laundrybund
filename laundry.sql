-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2020 at 05:06 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `laundry`
--

-- --------------------------------------------------------

--
-- Table structure for table `datatransaksi`
--

CREATE TABLE `datatransaksi` (
  `idpelanggan` varchar(10) NOT NULL,
  `namapelanggan` varchar(30) NOT NULL,
  `alamat` varchar(300) NOT NULL,
  `notelepon` varchar(13) NOT NULL,
  `idbarang` varchar(10) NOT NULL,
  `namabarang` varchar(30) NOT NULL,
  `jumlahbarang` int(10) NOT NULL,
  `tglmasuk` date NOT NULL,
  `tglkeluar` date NOT NULL,
  `beratbarang` int(10) NOT NULL,
  `harga` varchar(30) NOT NULL,
  `uangdibayar` varchar(30) NOT NULL,
  `uangkembalian` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datatransaksi`
--

INSERT INTO `datatransaksi` (`idpelanggan`, `namapelanggan`, `alamat`, `notelepon`, `idbarang`, `namabarang`, `jumlahbarang`, `tglmasuk`, `tglkeluar`, `beratbarang`, `harga`, `uangdibayar`, `uangkembalian`) VALUES
('A1', 'Budi Rochman Setyawan', 'Sukorejo', '088222333444', 'A1B1', 'Baju', 4, '2020-06-03', '2020-06-05', 3, '15000', '20000', '5000');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'ganteng');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
