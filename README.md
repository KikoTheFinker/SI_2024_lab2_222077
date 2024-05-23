# Втора лаораториска вежба по Софтверско инженерство

## Кристијан Стојановски 222077

### Control Flow Graph
![image](https://github.com/KikoTheFinker/SI_2024_lab2_222077/assets/139155973/ded81d32-dbf2-452f-af5d-0d00af72206e)

### Цикломатска комплексност

#### -Има 9 предикатни јазли а комплексноста изнесува 10.

### Тест случаи според критериумот Multiple Condition
#### за условот if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')

##### -TTT -> item.price = 5000; item.discount = 0.; item.barcode = "0123"
##### -TTF -> item.price = 5000; item.discount = 0.1; item.barcode = "1234"
##### -TFX -> item.price = 5000; item.discount = -0.1; item.barcode = X
##### -FXX -> item.price = 299; item.discount = X; item.barcode = X

### Тест случаи според критериумот Every Path
![image](https://github.com/KikoTheFinker/SI_2024_lab2_222077/assets/139155973/53c965e1-89b9-4684-9176-4f49ff68cd9d)

### Објаснување на напишаните Unit Tests
Прво го направив Control Flow Graph па потоа направив ексел табела every-branch на сите јазли. Потоа во Exel табелата почнав прво да ги поминам сите исклучоци и иститите ги надоградував за да се опфатат сите делови од кодот. пред да ги пишувам Unit тестовите гледав од exel табелата која е прикачена погоре.
