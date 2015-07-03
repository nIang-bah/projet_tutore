-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Mar 10 Mars 2015 à 09:10
-- Version du serveur: 5.5.24-log
-- Version de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `institut`
--

-- --------------------------------------------------------

--
-- Structure de la table `comptabilite`
--
create DATABASE institut;
use institut;

CREATE TABLE IF NOT EXISTS `comptabilite` (
  `idpay` int(4) NOT NULL AUTO_INCREMENT,
  `idetud` int(4) DEFAULT NULL,
  `mois` varchar(250) DEFAULT NULL,
  `montant` varchar(100) DEFAULT NULL,
  `modalite` varchar(40) DEFAULT NULL,
  `numero_check` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`idpay`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `comptabilite`
--

INSERT INTO `comptabilite` (`idpay`, `idetud`, `mois`, `montant`, `modalite`, `numero_check`) VALUES
(1, 1, 'Octobre Novembre', '200.000', ' En espece', 'numero du checque'),
(3, 2, 'Octobre Novembre', '200.000', ' En espece', 'numero du checque'),
(4, 3, ' Novembre Decembre', '245.000', ' En espece', 'numero du checque');

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE IF NOT EXISTS `etudiant` (
  `idetud` int(4) NOT NULL AUTO_INCREMENT,
  `prenometu` varchar(50) DEFAULT NULL,
  `nometu` varchar(40) DEFAULT NULL,
  `date_naiss` date DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `lieu_naiss` varchar(40) DEFAULT NULL,
  `tel` varchar(40) DEFAULT NULL,
  `adress` varchar(60) DEFAULT NULL,
  `sexe` varchar(20) DEFAULT NULL,
  `prenomtute` varchar(50) DEFAULT NULL,
  `nomtute` varchar(60) DEFAULT NULL,
  `teltute` varchar(20) DEFAULT NULL,
  `dept` varchar(40) DEFAULT NULL,
  `niveau` varchar(40) DEFAULT NULL,
  `heure` varchar(50) DEFAULT NULL,
  `annee` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`idetud`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `etudiant`
--

INSERT INTO `etudiant` (`idetud`, `prenometu`, `nometu`, `date_naiss`, `email`, `lieu_naiss`, `tel`, `adress`, `sexe`, `prenomtute`, `nomtute`, `teltute`, `dept`, `niveau`, `heure`, `annee`) VALUES
(1, 'Bounama A. H.', 'Niang', '1999-11-21', 'niang@gmail.com', 'Dakar', 'mamelle aviation', '77 899 99 77', 'HOMME', 'Babacar', 'Niang', '77 667 88 55', 'Informatique', 'Licence_3', 'Cour_du_jour', '2014-2015'),
(2, 'Pape Malick', 'Dieye', '1999-11-21', 'papi@gmail.com', 'Dakar', 'Virage', '77 988 45 66', 'HOMME', 'Abdoulaye', 'Ndoye', '77 665 54 66', 'Informatique', 'Licence_3', 'Cour_du_jour', '2014-2015'),
(3, 'Alioune', 'Sy ', '1999-11-21', 'alioune@gmail.com', 'dakar', 'mamelle aviation', '77 887 55 66', 'HOMME', 'Ibrahima', 'Sy', '77 566 55 44', 'Genie_Civile', 'Master_1', 'Cour_du_jour', '2014-2015');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `iduser` int(11) NOT NULL AUTO_INCREMENT,
  `prenomuser` varchar(40) DEFAULT NULL,
  `nomuser` varchar(30) DEFAULT NULL,
  `login` varchar(20) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`iduser`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`iduser`, `prenomuser`, `nomuser`, `login`, `password`) VALUES
(2, 'niang bah', 'niang', 'niang_bah', 'admin1');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
