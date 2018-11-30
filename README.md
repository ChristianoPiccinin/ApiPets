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

# Get

```html
localhost:8080\pets\
```
```json
[
    {
        "id": 1,
        "nome": "Luck",
        "especie": "Vira-lata",
        "sexo": "M"
    },
    {
        "id": 2,
        "nome": "Mime",
        "especie": "Gato",
        "sexo": "M"
    }
]
```
# Get Id
## localhost:8080\pets\2

```json
{
    "id": 2,
    "nome": "Mime",
    "especie": "Gato",
    "sexo": "M"
}

```
# Post

```json
```
# Put

```json
```
# Delete

```json
```

