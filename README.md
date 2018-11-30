# ApiPets

# Banco de Dados
```sql
CREATE SCHEMA `pets` ;

CREATE TABLE `pets`.`pet` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NOT NULL,
  `especie` VARCHAR(50) NOT NULL,
  `sexo` VARCHAR(1) NOT NULL,
  PRIMARY KEY (`id`));
```

