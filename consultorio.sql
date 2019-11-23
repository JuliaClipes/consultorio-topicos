-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 23-Nov-2019 às 07:13
-- Versão do servidor: 10.4.8-MariaDB
-- versão do PHP: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `consultorio`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `agendamento`
--

CREATE TABLE `agendamento` (
  `id_agendamento_banco` int(11) NOT NULL,
  `data_agendamento_banco` varchar(11) NOT NULL,
  `datac_agendamento_banco` varchar(11) NOT NULL,
  `descricao_agendamento_banco` varchar(300) NOT NULL,
  `especialidade_agendamento_banco` varchar(200) NOT NULL,
  `cliente_agendamento_banco` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `agendamento`
--

INSERT INTO `agendamento` (`id_agendamento_banco`, `data_agendamento_banco`, `datac_agendamento_banco`, `descricao_agendamento_banco`, `especialidade_agendamento_banco`, `cliente_agendamento_banco`) VALUES
(5, '22/11/2019', '12/12/2019', 'Hora:15h\nPreferência Dr. Danilo', 'Psicólogo', 'Maria da Silva'),
(6, '23/11/2019', '08/12/2019', 'Hora: 16h', 'Psiquiatra', 'João Cleber'),
(7, '20/11/2019', '20/12/2019', 'Hora: 9h\nPreferência Dra. Silvia', 'Neurologista', 'Joana Soares');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente_banco` int(11) NOT NULL,
  `nome_cliente_banco` varchar(100) NOT NULL,
  `telefone_cliente_banco` varchar(12) NOT NULL,
  `endereco_cliente_banco` varchar(100) NOT NULL,
  `cpf_cliente_banco` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente_banco`, `nome_cliente_banco`, `telefone_cliente_banco`, `endereco_cliente_banco`, `cpf_cliente_banco`) VALUES
(2, 'Julia', '55 11223344', 'Rua Tal, 45', '111.222.000-63');

-- --------------------------------------------------------

--
-- Estrutura da tabela `consulta`
--

CREATE TABLE `consulta` (
  `id_consulta_banco` int(11) NOT NULL,
  `nome_paciente_consulta_banco` varchar(100) NOT NULL,
  `data_consulta_banco` varchar(10) NOT NULL,
  `recomendacoes_consulta_banco` varchar(700) NOT NULL,
  `medico_consulta_banco` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `consulta`
--

INSERT INTO `consulta` (`id_consulta_banco`, `nome_paciente_consulta_banco`, `data_consulta_banco`, `recomendacoes_consulta_banco`, `medico_consulta_banco`) VALUES
(3, 'Joaquina Fernandez', '16/11/2019', 'Solicitação de Tomografia ', 'Dr. Danilo'),
(4, 'Vinicius Saldago', '20/11/2019', 'Terapia semanal', 'Dr. Aristeu'),
(5, 'Rodrigo Freitas', '10/11/2019', 'Receitado antidepressivo ', 'Dr. Fernando');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `agendamento`
--
ALTER TABLE `agendamento`
  ADD PRIMARY KEY (`id_agendamento_banco`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente_banco`);

--
-- Índices para tabela `consulta`
--
ALTER TABLE `consulta`
  ADD PRIMARY KEY (`id_consulta_banco`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `agendamento`
--
ALTER TABLE `agendamento`
  MODIFY `id_agendamento_banco` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente_banco` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `consulta`
--
ALTER TABLE `consulta`
  MODIFY `id_consulta_banco` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
