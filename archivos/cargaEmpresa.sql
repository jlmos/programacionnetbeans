SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empresa`
--


CREATE TABLE IF NOT EXISTS  `empleado` (
  `id` int(11) NOT NULL PRIMARY KEY,
  `nombre` varchar(255) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `categoria` varchar(255) NOT NULL,
  `salario` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

TRUNCATE TABLE `empleado` ;

INSERT INTO `empleado` (`id`, `nombre`, `fechaNacimiento`, `categoria`, `salario`) VALUES
(1, 'Ana LÃ³pez', '1958-01-01', 'Directora General', 6000),
(2, 'Luis PÃ©rez', '1959-02-02', 'Jefe de Proyecto', 2400),
(3, 'Eve Loch', '1967-03-31', 'Programador senior', 2100),
(4, 'Jose PÃ©rez', '1970-01-31', 'Programador senior', 1800),
(5, 'John Smith', '1990-05-01', 'Programador junior', 800),
(6, 'Ana SÃ¡nchez', '2000-01-01', 'Programador junior', 700);

COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
