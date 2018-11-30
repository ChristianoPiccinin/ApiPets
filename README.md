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
## Executando metodo
```html
localhost:8080\pets\
```
## Resultado

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

## Executando metodo
```html
localhost:8080\pets\2
```
## Resultado
```json
{
    "id": 2,
    "nome": "Mime",
    "especie": "Gato",
    "sexo": "M"
}

# Delete
## Executando metodo
```html
localhost:8080\pets\5
```


# PUT
## Executando metodo
```html
localhost:8080\pets\2
```
## Dados
```json
{	
    "nome": "Xazan",
    "especie":"cachorro",
    "sexo": "F"
}
```

# POST
## Executando metodo
```html
localhost:8080\pets\
```
## Dados
```json
{	
    "nome": "Xablau",
    "especie":"Macaco",
    "sexo": "M"
}
```




