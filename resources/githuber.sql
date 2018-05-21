-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 17, 2018 at 03:15 PM
-- Server version: 5.7.21-0ubuntu0.16.04.1
-- PHP Version: 7.0.28-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `githubtracker`
--

-- --------------------------------------------------------

--
-- Table structure for table `githuber`
--

CREATE TABLE `githuber` (
  `id` bigint(20) AUTO_INCREMENT NOT NULL,
  `github_id` varchar(100) COLLATE utf8_unicode_ci,
  `name` varchar(100) COLLATE utf8_unicode_ci,
  `login` varchar(100) COLLATE utf8_unicode_ci,
  `url` varchar(100) COLLATE utf8_unicode_ci,
  `email` varchar(100) COLLATE utf8_unicode_ci,
  `bio` text COLLATE utf8_unicode_ci,
  `location` varchar(100) COLLATE utf8_unicode_ci,
  `avatar_url` varchar(100) COLLATE utf8_unicode_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `githuber`
--
ALTER TABLE `githuber`
  ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
