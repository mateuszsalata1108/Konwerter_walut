# Currency converter
Autor: Mateusz Sałata
Język: Java

"Currency converter" to aplikacja pozwalająca na przekonwertowanie pięciu popularnych kursów walut:
* Złoty
* Euro
* Dolar amerykański
* Funt brytyjski
* Jen japoński

## Interfejs aplikacji: ##
![alt text](https://github.com/mateuszsalata1108/Konwerter_walut/blob/master/Screenshots/ss1.png?raw=true)

Jeżeli użytkownik nie podał żadnej wartości w polu "Ilość", wyskoczy Toast z odpowiednią wiadomością:

![alt text](https://github.com/mateuszsalata1108/Konwerter_walut/blob/master/Screenshots/ss2.png?raw=true)

Jeżeli użytkownik podał wartość ale wybrał dwie takie same waluty, również pojawi się Toast z odpowiednią wiadomością:

![alt text](https://github.com/mateuszsalata1108/Konwerter_walut/blob/master/Screenshots/ss4.png?raw=true)

![alt text](https://github.com/mateuszsalata1108/Konwerter_walut/blob/master/Screenshots/ss5.png?raw=true)

Po wciśnięciu przycisku "Konwertuj" na dole pokaże się przeliczona wartość w nowej walucie:

![alt text](https://github.com/mateuszsalata1108/Konwerter_walut/blob/master/Screenshots/ss6.png?raw=true)

## Kod aplikacji: ##
1. Deklaracja zmiennych i przypisanie ich do odpowiednich elementów interfejsu:

![alt text](https://github.com/mateuszsalata1108/Konwerter_walut/blob/master/Screenshots/code1.png?raw=true)

2. Deklaracja zmiennych walut oraz przypisanie im odpowiednich wartości:

![alt text](https://github.com/mateuszsalata1108/Konwerter_walut/blob/master/Screenshots/code2.png?raw=true)
3. Stworzenie tablic z walutami oraz podłączenie ich do rozwijanych list:

![alt text](https://github.com/mateuszsalata1108/Konwerter_walut/blob/master/Screenshots/code3.png?raw=true)
4. Obsługa błędu w wypadku gdy użytkownik nie podał żadnej wartości:

![alt text](https://github.com/mateuszsalata1108/Konwerter_walut/blob/master/Screenshots/code4.png?raw=true)

5. Utworzenie, dla każdej waluty, instrukcji warunkowych odpowiedzialnych za dopasowanie odpowiedniego parametru przeliczającego:

![alt text](https://github.com/mateuszsalata1108/Konwerter_walut/blob/master/Screenshots/code5.png?raw=true)
6. Obsługa błędu w wypadku gdy użytkownik wybrał dwie takie same waluty:

![alt text](https://github.com/mateuszsalata1108/Konwerter_walut/blob/master/Screenshots/code6.png?raw=true)






