-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-12-2020 a las 23:07:49
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prod1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bebestible`
--

CREATE TABLE `bebestible` (
  `codigo` varchar(10) NOT NULL,
  `nombre` varchar(10) DEFAULT NULL,
  `volumen` varchar(5) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `bebestible`
--

INSERT INTO `bebestible` (`codigo`, `nombre`, `volumen`, `precio`) VALUES
('111', 'cocacola', '550', 800),
('123', 'Zuke', '20', 300),
('222', 'Fanta', '550', 750);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carne`
--

CREATE TABLE `carne` (
  `codigo` varchar(10) NOT NULL,
  `nombre` varchar(10) DEFAULT NULL,
  `peso` varchar(5) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `carne`
--

INSERT INTO `carne` (`codigo`, `nombre`, `peso`, `precio`) VALUES
('654', 'Huachalomo', '1000', 3500);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vegetal`
--

CREATE TABLE `vegetal` (
  `codigo` varchar(10) NOT NULL,
  `nombre` varchar(10) DEFAULT NULL,
  `peso` varchar(5) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vegetal`
--

INSERT INTO `vegetal` (`codigo`, `nombre`, `peso`, `precio`) VALUES
('666', 'Limon', '250', 300);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bebestible`
--
ALTER TABLE `bebestible`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `carne`
--
ALTER TABLE `carne`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `vegetal`
--
ALTER TABLE `vegetal`
  ADD PRIMARY KEY (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
