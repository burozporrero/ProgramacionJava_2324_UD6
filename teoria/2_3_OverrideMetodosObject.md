# SOBRESCRIBIENDO MÉTODOS DE OBJECT
    NOTA: Material extraido casi íntegramente de los apuntes de Programación de 1 de DAM/DAW de Eduard .

## toString
Aquest mètode retorna una representació “textual” de l'objecte, és a dir, un text, que de manera concisa dona informació de l'estat actual de l'objecte (els valors dels seus camps).

El mètode toString de Object retorna el nom de la classe i el seu codi hash, un valor numèric que s’assigna a l'objecte (un enter de 32 bits).

    getClass( ).getName( ) + ‘@’ + Integer.toHexString(hashCode( )) 

Exemple:

    NComplex var = new NComplex(2, 5); // classe definida en el paquet oovv 
    System.out.println(var.toString( )); //visualitza oovv.NComplex@addbf1

Si es posa l'objecte dins d'una expressió de tipus cadena de text, es crida al mètode toString de manera automàtica per a transformar l'objecte a String. 

    String text = ”>” + var; // operador de concatenació de cadenes de text, s’executa var.toString 
    System.out.println(text); // visualitza >oovv.NComplex@addbf1

La classe NComplex representa un nombre complex, té dos camps: la part real del nombre, la referència és pReal i la part imaginària del nombre, la referència és pImaginaria, un nombre complex es representa com en els exemples següents: “2+5i”, “8-6i”, “8-i”, “12”, “-5+i” això serà el que fa el toString.

[Demo NComplex toString](NComplex.java)

## equals

La igualtat de dos objectes es comprova amb el mètode equals.

La capçalera public boolean equals(Object obj) no es pot canviar, el mètode indica si aquest objecte (this) és igual a l’objecte rebut (obj), retorna vertader si són iguals i fals si no ho són.

El equals de Object compara els hashcode dels objectes. 

Per als nostres objectes cal sobreescriure el mètode equals i definir els criteris d'igualtat utilitzant els camps presents en la classe.

Quan se sobreescriu el equals d'una classe cal tindre en compte.
- La comparació d’aquest objecte amb un null retorna fals (si no es rep res, no es pot fer la comparació).
- Si el tipus d'objecte rebut és incompatible amb el tipus d’aquest objecte, retorna fals (una pera i una pedra són 
  incompatibles).
- Si els dos objectes són compatibles, llavors es comproven els criteris d'igualtat (dues persones són iguals si 
  tenen el mateix DNI, dos medicaments són iguals si tenen els mateixos principis actius, etc.).
- Dos objectes iguals han de tindre el mateix hashcode.

Els mètodes del llenguatge que comparen objectes (contains, Set, etc.) necessiten que el mètode equals estiga definit per a funcionar correctament.

En l'exemple següent, se sobreescriu el mètode equals de la classe NComplex. Dos nombres imaginaris són iguals si les parts reals (pReal) i imaginàries (pImaginaria) són iguals.

[Demo NComplex equals](NComplex.java)

__NOTA:__ No uses el == per a comparar valors double, la representació és imprecisa.

A l’hora de comparar double, usa alguna de les formes següents.

Defineix la precisió per als valors, si la diferència és menor que la precisió, són iguals si no són diferents. 

    double precisió = 0.0001; String resultat = Math.abs(num1 - num2) < precisió ? "iguals": "diferents";

Usa mètodes de la classe Double: equals, compare, ... 

    String resultat = ((Double) num1).equals(num2) ? "iguals": "diferents";

Usa el mètode doubleToLongBits que transforma el double a un long. 

    String resultat = Double.doubleToLongBits(this.num) == Double.doubleToLongBits(other.num) ? "iguals": "diferents";

## hashCode

Sobreescriure el equals, implica sobreescriure el mètode hashCode, ja que els dos objectes iguals han de retornar el mateix codi hash.

El codi hash és un identificador enter de 32 bits, que s’assigna a l'objecte en el moment de la seua creació, el mètode hashCode retorna aquest valor.

Dos objectes iguals tenen el mateix codi hash, per tant, els criteris que s’apliquen en la comparació dels dos objectes s’han d’aplicar en la creació dels seus codi hash. 

En l’exemple del nombre complex, s’usa la part real i imaginària del nombre.

[Demo NComplex hashCode](NComplex.java)

## clone

El clonado lo veremos en el siguiente punto.

## finalize

Método deprecated desde Java7, y preparado desde java18 para eliminación.

[Razones](https://www.baeldung.com/java-18-deprecate-finalization)
