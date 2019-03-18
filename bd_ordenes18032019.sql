-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-03-2019 a las 06:08:03
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_ordenes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arqueo`
--

CREATE TABLE `arqueo` (
  `arq_codigo` int(10) NOT NULL,
  `emp_codigo` int(10) NOT NULL,
  `arq_hora_fecha` datetime NOT NULL,
  `arq_valor_base` decimal(7,2) NOT NULL,
  `arq_valor_fisico` decimal(7,2) NOT NULL,
  `arq_valor_diferencia` decimal(7,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `arqueo`
--

INSERT INTO `arqueo` (`arq_codigo`, `emp_codigo`, `arq_hora_fecha`, `arq_valor_base`, `arq_valor_fisico`, `arq_valor_diferencia`) VALUES
(1, 1, '2019-03-11 00:00:00', '2.00', '23.00', '21.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `cat_codigo` int(10) NOT NULL,
  `cat_nombre` varchar(25) NOT NULL,
  `cat_precio` decimal(7,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`cat_codigo`, `cat_nombre`, `cat_precio`) VALUES
(1, 'entradas', '0.50'),
(2, 'Fuertes', '0.60'),
(3, 'bebidasAlcolicas', '0.25'),
(4, 'bebidasCalientes', '0.40');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `cli_codigo` int(10) NOT NULL,
  `cli_id` varchar(15) NOT NULL,
  `cli_nombre` varchar(25) NOT NULL,
  `cli_apellido` varchar(25) NOT NULL,
  `cli_telefono` varchar(25) NOT NULL,
  `cli_direccion` varchar(100) NOT NULL,
  `cli_correo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cli_codigo`, `cli_id`, `cli_nombre`, `cli_apellido`, `cli_telefono`, `cli_direccion`, `cli_correo`) VALUES
(1, '0605694555', 'isi', 'cg', '9999', 'chunchi', 'kf@j.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_producto_menu`
--

CREATE TABLE `detalle_producto_menu` (
  `det_codigo` int(10) NOT NULL,
  `ped_codigo` int(10) NOT NULL,
  `prm_nombre` varchar(255) NOT NULL,
  `fac_codigo` int(10) DEFAULT NULL,
  `det_especificaciones` varchar(200) NOT NULL,
  `det_cantidad` int(5) NOT NULL,
  `prm_codigo` int(10) DEFAULT NULL,
  `precio` double(4,2) NOT NULL,
  `seccion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `emp_codigo` int(10) NOT NULL,
  `emp_id` varchar(15) NOT NULL,
  `emp_cargo` varchar(25) NOT NULL,
  `emp_nombre` varchar(25) NOT NULL,
  `emp_apellido` varchar(25) NOT NULL,
  `emp_telefono` varchar(25) NOT NULL,
  `emp_direccion` varchar(100) NOT NULL,
  `emp_correo` varchar(50) NOT NULL,
  `emp_turno` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`emp_codigo`, `emp_id`, `emp_cargo`, `emp_nombre`, `emp_apellido`, `emp_telefono`, `emp_direccion`, `emp_correo`, `emp_turno`) VALUES
(1, '', 'Mesero', 'Jeison Isidro', 'Caguana Guamán', '0995669394', 'Chunhi - Ecuador', 'jeisoncaguana@gmail.com', 'mañana'),
(2, '', 'Mesero', 'Daniela Carmen', 'Tene Ruiz', '0995669394', 'Chunhi - Ecuador', 'jeisonhenaselec2@gmail.com', 'tarde');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `fac_codigo` int(10) NOT NULL,
  `cli_codigo` int(10) NOT NULL,
  `fac_fecha` date NOT NULL,
  `fac_hora` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fac_subtotal` decimal(7,2) NOT NULL,
  `fac_iva` decimal(7,2) NOT NULL,
  `fac_total` decimal(7,2) NOT NULL,
  `fac_forma_pago` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`fac_codigo`, `cli_codigo`, `fac_fecha`, `fac_hora`, `fac_subtotal`, `fac_iva`, `fac_total`, `fac_forma_pago`) VALUES
(1, 1, '2019-03-11', '2019-03-12 04:46:39', '2.00', '2.00', '2.00', 'efecivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `mes_numero` int(10) NOT NULL,
  `mes_estado` enum('LIBRE','OCUPADA') NOT NULL,
  `mes_num_sillas` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`mes_numero`, `mes_estado`, `mes_num_sillas`) VALUES
(1, 'LIBRE', 2),
(2, 'LIBRE', 4),
(3, 'LIBRE', 4),
(4, 'LIBRE', 4),
(5, 'LIBRE', 4),
(6, 'LIBRE', 4),
(7, 'LIBRE', 10),
(8, 'LIBRE', 1),
(9, 'LIBRE', 1),
(10, 'LIBRE', 1),
(11, 'LIBRE', 1),
(12, 'LIBRE', 1),
(13, 'LIBRE', 1),
(14, 'LIBRE', 1),
(15, 'LIBRE', 1),
(16, 'LIBRE', 1),
(17, 'LIBRE', 1),
(18, 'LIBRE', 1),
(19, 'LIBRE', 1),
(20, 'LIBRE', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `ped_codigo` int(10) NOT NULL,
  `mes_numero` int(10) DEFAULT NULL,
  `ped_estado` enum('RECIBIDO','INGRESADO','EN ESPERA','EN PROCESO','LISTO','DESPACHADO','FINALIZADO','CANCELADO') DEFAULT 'RECIBIDO',
  `ped_especificaciones` varchar(250) DEFAULT NULL,
  `ped_hora_solicitud` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `ped_hora_despacho` time DEFAULT NULL,
  `ped_fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`ped_codigo`, `mes_numero`, `ped_estado`, `ped_especificaciones`, `ped_hora_solicitud`, `ped_hora_despacho`, `ped_fecha`) VALUES
(1, 1, 'LISTO', NULL, '2019-03-18 04:47:46', '23:47:46', '2019-03-17'),
(3, NULL, 'RECIBIDO', NULL, NULL, NULL, NULL),
(10, 1, 'RECIBIDO', NULL, '2019-03-17 18:18:27', NULL, NULL),
(11, 17, 'RECIBIDO', NULL, '2019-03-17 18:32:58', NULL, NULL),
(12, 14, 'RECIBIDO', NULL, '2019-03-17 20:02:07', NULL, NULL),
(13, 13, 'RECIBIDO', NULL, '2019-03-17 20:19:58', NULL, NULL),
(14, 17, 'RECIBIDO', NULL, '2019-03-17 20:24:25', NULL, NULL),
(15, 7, 'RECIBIDO', NULL, '2019-03-17 22:54:59', NULL, NULL),
(16, 5, 'RECIBIDO', NULL, '2019-03-17 23:15:48', NULL, NULL),
(17, 7, 'RECIBIDO', NULL, '2019-03-17 23:25:41', NULL, NULL),
(18, 7, 'RECIBIDO', NULL, '2019-03-17 23:26:02', NULL, NULL),
(19, 5, 'RECIBIDO', NULL, '2019-03-17 23:28:06', NULL, NULL),
(20, 17, 'RECIBIDO', NULL, '2019-03-17 23:28:56', NULL, NULL),
(21, 5, 'RECIBIDO', NULL, '2019-03-17 23:30:12', NULL, NULL),
(22, 2, 'RECIBIDO', NULL, '2019-03-17 23:39:00', NULL, NULL),
(23, 3, 'RECIBIDO', NULL, '2019-03-17 23:39:41', NULL, NULL),
(24, 2, 'RECIBIDO', NULL, '2019-03-17 23:40:14', NULL, NULL),
(25, 5, 'RECIBIDO', NULL, '2019-03-17 23:50:24', NULL, NULL),
(26, 4, 'RECIBIDO', NULL, '2019-03-17 23:53:50', NULL, NULL),
(27, 7, 'RECIBIDO', NULL, '2019-03-17 23:56:54', NULL, NULL),
(28, 2, 'RECIBIDO', NULL, '2019-03-18 00:01:26', NULL, NULL),
(29, 5, 'RECIBIDO', NULL, '2019-03-18 00:02:41', NULL, NULL),
(30, 5, 'RECIBIDO', NULL, '2019-03-18 00:03:31', NULL, NULL),
(31, 7, 'RECIBIDO', NULL, '2019-03-18 00:36:14', NULL, NULL),
(32, 17, 'RECIBIDO', NULL, '2019-03-18 00:36:42', NULL, NULL),
(33, 13, 'RECIBIDO', NULL, '2019-03-18 00:44:11', NULL, NULL),
(34, 8, 'RECIBIDO', NULL, '2019-03-18 00:46:35', NULL, NULL),
(35, 11, 'RECIBIDO', NULL, '2019-03-18 00:53:40', NULL, NULL),
(36, 7, 'RECIBIDO', NULL, '2019-03-18 00:54:00', NULL, NULL),
(37, 6, 'RECIBIDO', NULL, '2019-03-18 00:56:11', NULL, NULL),
(38, 13, 'RECIBIDO', NULL, '2019-03-18 00:56:28', NULL, NULL),
(39, 7, 'RECIBIDO', NULL, '2019-03-18 01:01:13', NULL, NULL),
(40, 5, 'RECIBIDO', NULL, '2019-03-18 01:02:29', NULL, NULL),
(41, 4, 'RECIBIDO', NULL, '2019-03-18 01:07:03', NULL, NULL),
(42, 14, 'RECIBIDO', NULL, '2019-03-18 01:13:57', NULL, NULL),
(43, 6, 'RECIBIDO', NULL, '2019-03-18 01:14:40', NULL, NULL),
(44, 2, 'RECIBIDO', NULL, '2019-03-18 01:15:53', NULL, NULL),
(45, 11, 'RECIBIDO', NULL, '2019-03-18 01:16:58', NULL, NULL),
(46, 16, 'RECIBIDO', NULL, '2019-03-18 01:19:56', NULL, NULL),
(47, 7, 'RECIBIDO', NULL, '2019-03-18 01:21:57', NULL, NULL),
(48, 18, 'RECIBIDO', NULL, '2019-03-18 01:25:23', NULL, NULL),
(49, 4, 'RECIBIDO', NULL, '2019-03-18 01:27:26', NULL, NULL),
(50, 5, 'RECIBIDO', NULL, '2019-03-18 01:29:30', NULL, NULL),
(51, 4, 'RECIBIDO', NULL, '2019-03-18 01:30:57', NULL, NULL),
(52, 13, 'RECIBIDO', NULL, '2019-03-18 01:32:25', NULL, NULL),
(53, 5, 'RECIBIDO', NULL, '2019-03-18 01:34:10', NULL, NULL),
(54, 1, 'RECIBIDO', NULL, '2019-03-18 03:10:15', NULL, NULL),
(55, 18, 'RECIBIDO', NULL, '2019-03-18 03:11:44', NULL, NULL),
(56, 5, 'RECIBIDO', NULL, '2019-03-18 03:12:33', NULL, NULL),
(57, 2, 'RECIBIDO', NULL, '2019-03-18 03:24:00', NULL, NULL),
(58, 6, 'RECIBIDO', NULL, '2019-03-18 03:25:23', NULL, NULL),
(59, 4, 'RECIBIDO', NULL, '2019-03-18 03:27:15', NULL, NULL),
(60, 5, 'RECIBIDO', NULL, '2019-03-18 03:28:30', NULL, NULL),
(61, 3, 'RECIBIDO', NULL, '2019-03-18 03:40:04', NULL, NULL),
(62, 5, 'RECIBIDO', NULL, '2019-03-18 03:41:00', NULL, NULL),
(63, 3, 'RECIBIDO', NULL, '2019-03-18 03:42:33', NULL, NULL),
(64, 17, 'RECIBIDO', NULL, '2019-03-18 03:46:32', NULL, NULL),
(65, 17, 'RECIBIDO', NULL, '2019-03-18 03:48:11', NULL, NULL),
(66, 17, 'RECIBIDO', NULL, '2019-03-18 03:49:40', NULL, NULL),
(67, 17, 'RECIBIDO', NULL, '2019-03-18 03:49:46', NULL, NULL),
(68, 18, 'RECIBIDO', NULL, '2019-03-18 03:53:47', NULL, NULL),
(69, 5, 'RECIBIDO', NULL, '2019-03-18 03:55:26', NULL, NULL),
(70, 6, 'RECIBIDO', NULL, '2019-03-18 03:57:33', NULL, NULL),
(71, 10, 'RECIBIDO', NULL, '2019-03-18 04:31:26', NULL, NULL),
(72, 5, 'RECIBIDO', NULL, '2019-03-18 04:33:18', NULL, NULL),
(73, 2, 'RECIBIDO', NULL, '2019-03-18 04:42:58', NULL, NULL),
(74, 7, 'RECIBIDO', NULL, '2019-03-18 04:47:54', NULL, NULL),
(75, 7, 'RECIBIDO', NULL, '2019-03-18 04:48:32', NULL, NULL),
(76, 7, 'RECIBIDO', NULL, '2019-03-18 04:51:04', NULL, NULL),
(77, 7, 'RECIBIDO', NULL, '2019-03-18 04:51:56', NULL, NULL),
(78, 7, 'RECIBIDO', NULL, '2019-03-18 04:52:53', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_bodega`
--

CREATE TABLE `pedido_bodega` (
  `pdb_codigo` int(10) NOT NULL,
  `prb_codigo` int(10) DEFAULT NULL,
  `prv_codigo` int(10) NOT NULL,
  `emp_codigo` int(10) NOT NULL,
  `pdb_fecha` date NOT NULL,
  `pdb_forma_pago` varchar(25) NOT NULL,
  `pdb_descripcion` varchar(100) NOT NULL,
  `pdb_cotizacion` decimal(7,2) NOT NULL,
  `pdb_observacion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedido_bodega`
--

INSERT INTO `pedido_bodega` (`pdb_codigo`, `prb_codigo`, `prv_codigo`, `emp_codigo`, `pdb_fecha`, `pdb_forma_pago`, `pdb_descripcion`, `pdb_cotizacion`, `pdb_observacion`) VALUES
(1, NULL, 1, 2, '2019-03-04', 'efectivo', 'asddasd', '2.20', 'no hay');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto_bodega`
--

CREATE TABLE `producto_bodega` (
  `prb_codigo` int(10) NOT NULL,
  `prb_nombre` varchar(25) NOT NULL,
  `prb_cantidad` int(5) NOT NULL,
  `prb_unidad_peso` varchar(10) NOT NULL,
  `prb_precio` decimal(7,2) NOT NULL,
  `prb_tipo` varchar(25) NOT NULL,
  `prb_lote` varchar(25) NOT NULL,
  `prb_fecha_vencimiento` date NOT NULL,
  `prb_observacion` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto_bodega`
--

INSERT INTO `producto_bodega` (`prb_codigo`, `prb_nombre`, `prb_cantidad`, `prb_unidad_peso`, `prb_precio`, `prb_tipo`, `prb_lote`, `prb_fecha_vencimiento`, `prb_observacion`) VALUES
(1, 'sal', 1, '1', '1.10', '1', '1', '2019-03-27', 'no hya');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto_menu`
--

CREATE TABLE `producto_menu` (
  `prm_codigo` int(10) NOT NULL,
  `cat_codigo` int(10) NOT NULL,
  `ree_codigo` int(10) NOT NULL,
  `prm_nombre` varchar(255) NOT NULL,
  `prm_descripción` varchar(200) DEFAULT NULL,
  `prm_disponibilidad` char(2) NOT NULL,
  `seccion` varchar(255) DEFAULT NULL,
  `precio` double(4,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto_menu`
--

INSERT INTO `producto_menu` (`prm_codigo`, `cat_codigo`, `ree_codigo`, `prm_nombre`, `prm_descripción`, `prm_disponibilidad`, `seccion`, `precio`) VALUES
(1, 1, 1, 'Ceviche de Camarón', NULL, 'si', 'cocina', 4.00),
(2, 1, 1, 'Corviche de cangrejo', NULL, 'si', 'cocina', 6.00),
(3, 1, 1, 'Ensalada Cuencana', NULL, 'si', 'cocina', 3.50),
(4, 2, 1, 'Hamburguesa de cordero', NULL, 'si', 'cocina', 5.00),
(5, 2, 1, 'Hamburguesa de picaña de res', NULL, 'si', 'cocina', 5.50),
(6, 2, 1, 'Costilla de cerdo Jack Daniel´s', NULL, 'si', 'cocina', 7.50),
(7, 2, 1, 'Lomo al trapo', NULL, 'si', 'cocina', 4.50),
(8, 2, 1, 'Piernas de cordero', NULL, 'si', 'cocina', 5.50),
(9, 3, 1, 'Malbec Trapiche', NULL, 'si', 'bar', 3.40),
(10, 3, 1, 'Shyra Concha y Toro', NULL, 'si', 'bar', 3.50),
(11, 3, 1, 'Merlot Trapiche', NULL, 'si', 'bar', 5.30),
(12, 3, 1, 'Pinot Noir Casillero del Diablo', NULL, 'si', 'bar', 3.50),
(13, 3, 1, 'Carmenier Concha y Toro', NULL, 'si', 'bar', 10.00),
(14, 3, 1, 'Sovignone Blanc Trapiche', NULL, 'si', 'bar', 13.50),
(15, 4, 1, 'Expreso', NULL, 'si', 'bar', 6.50),
(16, 4, 1, 'Expreso doble', NULL, 'si', 'bar', 13.00),
(17, 4, 1, 'Café americano', NULL, 'si', 'bar', 2.50),
(18, 4, 1, 'Capuchino', NULL, 'si', 'bar', 2.50),
(19, 4, 1, 'Mecacino', NULL, 'si', 'bar', 4.50),
(20, 4, 1, 'Café Late', NULL, 'si', 'bar', 3.50),
(21, 4, 1, 'Ristreto', NULL, 'si', 'bar', 6.50),
(22, 4, 1, 'Chocolate caliente', NULL, 'si', 'bar', 7.50),
(23, 1, 1, '', NULL, 'si', 'null', 0.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `prv_codigo` int(10) NOT NULL,
  `prv_nombre` varchar(25) NOT NULL,
  `prv_apellido` varchar(25) NOT NULL,
  `prv_direccion` varchar(100) NOT NULL,
  `prv_telefono` varchar(25) NOT NULL,
  `prv_correo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`prv_codigo`, `prv_nombre`, `prv_apellido`, `prv_direccion`, `prv_telefono`, `prv_correo`) VALUES
(1, 'juan', 'peres', 'quito', '099999', 'jasnd@n.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rango`
--

CREATE TABLE `rango` (
  `ran_codigo` int(10) NOT NULL,
  `emp_codigo` int(10) NOT NULL,
  `mes_numero` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `receta_estandar`
--

CREATE TABLE `receta_estandar` (
  `ree_codigo` int(10) NOT NULL,
  `ree_tiempo_preparacion` time NOT NULL,
  `ree_fecha_preparacion` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `receta_estandar`
--

INSERT INTO `receta_estandar` (`ree_codigo`, `ree_tiempo_preparacion`, `ree_fecha_preparacion`) VALUES
(1, '00:20:00', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reexprb`
--

CREATE TABLE `reexprb` (
  `rp_codigo` int(10) NOT NULL,
  `ree_codigo` int(10) NOT NULL,
  `prb_codigo` int(10) NOT NULL,
  `rp_cantidad` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reexprb`
--

INSERT INTO `reexprb` (`rp_codigo`, `ree_codigo`, `prb_codigo`, `rp_cantidad`) VALUES
(1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `usu_codigo` int(10) NOT NULL,
  `emp_codigo` int(10) NOT NULL,
  `usu_cargo` varchar(25) NOT NULL,
  `usu_usuario` varchar(25) NOT NULL,
  `usu_contrasena` varchar(40) NOT NULL DEFAULT 'codigovago'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`usu_codigo`, `emp_codigo`, `usu_cargo`, `usu_usuario`, `usu_contrasena`) VALUES
(1, 1, 'Mesero', 'jcaguana1', '123'),
(2, 2, 'Mesero', 'dtene2', 'codigovago');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `arqueo`
--
ALTER TABLE `arqueo`
  ADD PRIMARY KEY (`arq_codigo`),
  ADD KEY `emp_codigo` (`emp_codigo`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`cat_codigo`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cli_codigo`);

--
-- Indices de la tabla `detalle_producto_menu`
--
ALTER TABLE `detalle_producto_menu`
  ADD PRIMARY KEY (`det_codigo`),
  ADD KEY `prm_codigo` (`prm_codigo`,`ped_codigo`),
  ADD KEY `fac_codigo` (`fac_codigo`),
  ADD KEY `ped_codigo` (`ped_codigo`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`emp_codigo`),
  ADD KEY `emp_id` (`emp_id`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`fac_codigo`),
  ADD KEY `cli_codigo` (`cli_codigo`);

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`mes_numero`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`ped_codigo`),
  ADD KEY `mes_numero` (`mes_numero`);

--
-- Indices de la tabla `pedido_bodega`
--
ALTER TABLE `pedido_bodega`
  ADD PRIMARY KEY (`pdb_codigo`),
  ADD KEY `prb_codigo` (`prb_codigo`,`prv_codigo`),
  ADD KEY `emp_codigo` (`emp_codigo`),
  ADD KEY `prv_codigo` (`prv_codigo`);

--
-- Indices de la tabla `producto_bodega`
--
ALTER TABLE `producto_bodega`
  ADD PRIMARY KEY (`prb_codigo`);

--
-- Indices de la tabla `producto_menu`
--
ALTER TABLE `producto_menu`
  ADD PRIMARY KEY (`prm_codigo`),
  ADD KEY `cat_codigo` (`cat_codigo`),
  ADD KEY `ree_codigo` (`ree_codigo`),
  ADD KEY `prm_nombre` (`prm_nombre`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`prv_codigo`);

--
-- Indices de la tabla `rango`
--
ALTER TABLE `rango`
  ADD PRIMARY KEY (`ran_codigo`),
  ADD KEY `emp_codigo` (`emp_codigo`,`mes_numero`),
  ADD KEY `mes_numero` (`mes_numero`);

--
-- Indices de la tabla `receta_estandar`
--
ALTER TABLE `receta_estandar`
  ADD PRIMARY KEY (`ree_codigo`);

--
-- Indices de la tabla `reexprb`
--
ALTER TABLE `reexprb`
  ADD PRIMARY KEY (`rp_codigo`),
  ADD KEY `ree_codigo` (`ree_codigo`,`prb_codigo`),
  ADD KEY `prb_codigo` (`prb_codigo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`usu_codigo`),
  ADD KEY `emp_codigo` (`emp_codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `arqueo`
--
ALTER TABLE `arqueo`
  MODIFY `arq_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `cat_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `cli_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `detalle_producto_menu`
--
ALTER TABLE `detalle_producto_menu`
  MODIFY `det_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `emp_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `fac_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `mes_numero` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `ped_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;
--
-- AUTO_INCREMENT de la tabla `pedido_bodega`
--
ALTER TABLE `pedido_bodega`
  MODIFY `pdb_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `producto_bodega`
--
ALTER TABLE `producto_bodega`
  MODIFY `prb_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `producto_menu`
--
ALTER TABLE `producto_menu`
  MODIFY `prm_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `prv_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `rango`
--
ALTER TABLE `rango`
  MODIFY `ran_codigo` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `receta_estandar`
--
ALTER TABLE `receta_estandar`
  MODIFY `ree_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `reexprb`
--
ALTER TABLE `reexprb`
  MODIFY `rp_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `usu_codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `arqueo`
--
ALTER TABLE `arqueo`
  ADD CONSTRAINT `arqueo_ibfk_1` FOREIGN KEY (`emp_codigo`) REFERENCES `empleado` (`emp_codigo`);

--
-- Filtros para la tabla `detalle_producto_menu`
--
ALTER TABLE `detalle_producto_menu`
  ADD CONSTRAINT `detalle_producto_menu_ibfk_1` FOREIGN KEY (`ped_codigo`) REFERENCES `pedido` (`ped_codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `detalle_producto_menu_ibfk_2` FOREIGN KEY (`prm_codigo`) REFERENCES `producto_menu` (`prm_codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`cli_codigo`) REFERENCES `cliente` (`cli_codigo`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`mes_numero`) REFERENCES `mesa` (`mes_numero`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `pedido_bodega`
--
ALTER TABLE `pedido_bodega`
  ADD CONSTRAINT `pedido_bodega_ibfk_1` FOREIGN KEY (`emp_codigo`) REFERENCES `empleado` (`emp_codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `pedido_bodega_ibfk_2` FOREIGN KEY (`prv_codigo`) REFERENCES `proveedor` (`prv_codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `producto_menu`
--
ALTER TABLE `producto_menu`
  ADD CONSTRAINT `producto_menu_ibfk_1` FOREIGN KEY (`cat_codigo`) REFERENCES `categoria` (`cat_codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `producto_menu_ibfk_2` FOREIGN KEY (`ree_codigo`) REFERENCES `receta_estandar` (`ree_codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `rango`
--
ALTER TABLE `rango`
  ADD CONSTRAINT `rango_ibfk_1` FOREIGN KEY (`mes_numero`) REFERENCES `mesa` (`mes_numero`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `rango_ibfk_2` FOREIGN KEY (`emp_codigo`) REFERENCES `empleado` (`emp_codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reexprb`
--
ALTER TABLE `reexprb`
  ADD CONSTRAINT `reexprb_ibfk_1` FOREIGN KEY (`prb_codigo`) REFERENCES `producto_bodega` (`prb_codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `reexprb_ibfk_2` FOREIGN KEY (`ree_codigo`) REFERENCES `receta_estandar` (`ree_codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
