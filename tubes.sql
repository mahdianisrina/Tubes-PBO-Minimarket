-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2020 at 09:41 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubes`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` varchar(10) NOT NULL,
  `nama_pegawai` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `jabatan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `nama_pegawai`, `jenis_kelamin`, `jabatan`) VALUES
('PG_0124', 'Anjina', 'perempuan', 'Casier'),
('PG_0211', 'Budi', 'Laki-Laki', 'Casier'),
('PG_0234', 'Citra', 'Perempuan ', 'Casier'),
('PG_0237', 'Septian', 'Laki-laki', 'Manager'),
('PG_0312', 'Sinta', 'Perempuan', 'Casier'),
('PG_0342', 'Rafly', 'Laki-Laki', 'OB'),
('PG_0413', 'Nuril', 'Perempuan ', 'Casier'),
('PG_0428', 'Nandika', 'Laki-laki', 'OB'),
('PG_0514', 'Wahyu', 'Laki-Laki', 'Casier'),
('PG_0564', 'Sultan', 'Laki-Laki', 'OB'),
('PG_0613', 'Rani', 'Perempuan', 'Casier'),
('PG_0615', 'Muhhamad', 'Laki-Laki', 'Casier'),
('PG_0765', 'Cintia', 'Perempuan ', 'OB'),
('PG_0965', 'Fernandes', 'Laki-Laki', 'Casier'),
('PG_0987', 'Yunita', 'Perempuan', 'Casier');

-- --------------------------------------------------------

--
-- Table structure for table `pembeli`
--

CREATE TABLE `pembeli` (
  `id_pembeli` varchar(10) NOT NULL,
  `nama_pembeli` varchar(30) NOT NULL,
  `no_telp` varchar(20) NOT NULL,
  `jumlah_beli` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembeli`
--

INSERT INTO `pembeli` (`id_pembeli`, `nama_pembeli`, `no_telp`, `jumlah_beli`) VALUES
('11234', 'Jono', '085276876521', '5'),
('11256', 'Tania', '085887865555', '2'),
('11378', 'Abas', '085745633222', '8'),
('11545', 'Vindy', '085346789999', '6'),
('11567', 'Nola', '081234567899', '20'),
('11723', 'Jeje', '081234577777', '10'),
('11987', 'Sintia', '085234890723', '11'),
('12134', 'Darma', '085344256678', '2'),
('12383', 'elsa', '082122339945', '13'),
('12387', 'laila', '089876543211', '17'),
('12397', 'yoga', '089866543112', '7'),
('12876', 'adrian', '085233448765', '3'),
('14528', 'reno', '085233998812', '9'),
('17652', 'winda', '085798664321', '14'),
('19824', 'dimas', '085766432187', '18');

-- --------------------------------------------------------

--
-- Table structure for table `produk`
--

CREATE TABLE `produk` (
  `produk_id` varchar(10) NOT NULL,
  `nama_produk` varchar(30) NOT NULL,
  `jumlah_stok` varchar(30) NOT NULL,
  `harga_jual` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `produk`
--

INSERT INTO `produk` (`produk_id`, `nama_produk`, `jumlah_stok`, `harga_jual`) VALUES
('12345', 'Tissue', '13', '5000'),
('13456', 'Better', '30', '3000'),
('23451', 'Gula', '15', '8000'),
('23456', 'Kecap Bango', '12', '10000'),
('23564', 'Keju', '22', '25000'),
('24598', 'Sapu Lidi', '20', '12000'),
('25436', 'Bon Cabe', '14', '10000'),
('34522', 'Biskuit', '20', '2500'),
('34531', 'Mayones', '25', '25000'),
('34690', 'Tepung Tapioka', '40', '12000'),
('45321', 'Sauce Indoffod', '24', '8000'),
('54382', 'ultra milk', '10', '7000'),
('65429', 'Tepung beras', '35', '10000'),
('67543', 'Roma Kelapa', '9', '7000'),
('76854', 'Sunlight', '30', '8000');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `no_telp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nama`, `no_telp`) VALUES
('01036', 'Andrian', '085789892222'),
('04567', 'candra', '085234865312'),
('09875', 'nezla', '082134786434'),
('12332', 'Yoga', '085357892222'),
('21345', 'Nabila', '082134567787'),
('23812', 'Septian', '085234677666'),
('34521', 'Putri', '081234568888');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` varchar(10) NOT NULL,
  `id_pembeli` varchar(10) NOT NULL,
  `id_admin` varchar(10) NOT NULL,
  `produk_id` varchar(10) NOT NULL,
  `tgl_transaksi` varchar(10) NOT NULL,
  `jumlah_beli` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `id_pembeli`, `id_admin`, `produk_id`, `tgl_transaksi`, `jumlah_beli`) VALUES
('98755', '11567', 'PG_0514', '25436', '05-05-2020', '8'),
('99284', '11723', 'PG_0342', '12345', '3-05-2020', '16'),
('99453', '11723', 'PG_0312', '24598', '17-05-2020', '13'),
('99564', '12387', 'PG_0211', '23564', '8-05-2020', '13'),
('99654', '11987', 'PG_0615', '23456', '16-05-2020', '10'),
('99723', '11256', 'PG_0413', '23456', '04-05-2020', '2'),
('99754', '11723', 'PG_0312', '23451', '12-05-2020', '16'),
('99865', '12383', 'PG_0428', '34522', '5-05-2020', '18'),
('99876', '11378', 'PG_0312', '23451', '15-05-2020', '6'),
('99877', '11234', 'PG_0211', '23564', '25-05-2020', '5');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`id_pembeli`);

--
-- Indexes for table `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`produk_id`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_pembeli` (`id_pembeli`),
  ADD KEY `id_admin` (`id_admin`),
  ADD KEY `produk_id` (`produk_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_pembeli`) REFERENCES `pembeli` (`id_pembeli`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`id_admin`) REFERENCES `admin` (`id_admin`),
  ADD CONSTRAINT `transaksi_ibfk_3` FOREIGN KEY (`produk_id`) REFERENCES `produk` (`produk_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
