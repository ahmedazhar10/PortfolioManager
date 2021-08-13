CREATE TABLE IF NOT EXISTS `stockschema`.`Stock` (
  `ID` INT NOT NULL,
  `ticker` VARCHAR(45) NOT NULL,
  `volume` INT NOT NULL,
  `purchasePrice` INT NOT NULL,
  `closingPrice` INT NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
