CREATE TABLE IF NOT EXISTS `mysql`.`Stock` (
  `ID` INT NOT NULL,
  `ticker` VARCHAR(45) NOT NULL,
  `volume` INT NOT NULL,
  `purchasePrice` FLOAT NOT NULL,
  `closingPrice` FLOAT NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
