# EJERCICIOS

## Usa casa 
    NOTA: Material extraido íntegramente de los apuntes de Programación de 1 de DAM/DAW de Eduard .

Ejercicio que va incrementeando la dificultad conforme se van solicitando puntos.

1. Crea l’aplicació usacasa, la classe principal té el mètode main. Crea el paquet oovv i en ell crea la classe 
pública Casa.


2. Crea un objecte de la classe Casa en el mètode main de la classe principal, la referència de l'objecte és maCasa. 
Intenta imprimir per pantalla l’objecte.


3. Afegeix a la classe Casa els camps següent: el carrer, el nombre, la població, la superfície, si té garatge o no, 
l'edat de la casa, un comptador de cases creades (és compartit per tots els objectes) i una constant estàtica que representa la superfície mínima per a una casa que val 43.5 m2.


4. Afegeix a la classe Casa, els constructors següents:
    - un constructor sense paràmetres.
    - un constructor amb paràmetres per al carrer, el nombre, la població, la superfície, si té garatge o no, l'edat.
    - un constructor amb paràmetres per a l'adreça completa de la casa (crida el constructor anterior).
    - Tots els constructors incrementen el comptador de cases.

   En el main crea un objecte de tipus Casa amb la informació següent:
   - Adreça “C/ Major nº 12 de Llíria” de 98 metres quadrats, sense garatge i de 30 anys.
   - Adreça “C/ Serrano nº 48 d'Olocau”.


5. Afegeix a la classe Casa, els mètodes que obtenen i assignen valors als camps dinàmics (getters i setters), el 
mètode getAdreçaCompleta que retorna l'adreça completa de la casa (carrer, nombre i població) el format de la cadena de text és el següent “C/ ” + carrer + “ nº ” + nombre + “ de ” + població, “ de ” es substitueix per “ d’” quan la lletra inicial del poble és una vocal i el mètode getInfo que retorna tota la informació d’una casa (usa el mètode getAdreçaCompleta).


6. Afegeix a la classe Casa el mètode privat esVocal que indica si el paràmetre és una vocal o no, fes dues versions 
una rep una cadena de text i l’altre un caràcter.

   En el main,
   - crea un objecte de tipus Casa amb el constructor per defecte i amb els mètodes assigna la informació següent: 
     Adreça “C/ València nº 1 de La Pobla de Vallbona” de 112 metres quadrats amb garatge i de 5 anys.
   - completa la informació de la casa en “C/ Serrano nº 48 d'Olocau” amb la informació: té 130 metres quadrats, 
     garatge i 40 anys.
   - visualitza la informació de les tres cases creades.

### Los puntos 7 y 8 esperar a trabajar los conceptos en el tema 6, continuar con el 9

7. Afegeix a la classe Casa els mètodes per a obtindre i assignar el valor del camp estàtic que compta el nombre de 
cases que s’han creat i el mètode incrementaComptadorCases que incrementa aquest comptador.

    Mou els mètodes esVocal de la classe Casa a la classe Qutil i fes-los estàtics. Usa un dels mètodes de la classe Qutil en el mètode que retorna l'adreça completa de la casa.
    En els constructors usa el mètode incrementaComptadorCases. Després de la creació d’una casa, visualitza el 
   comptador de cases.

8. Afegeix a la classe Casa, el mètode toString, aquest retorna el carrer, el nombre, la població, la superfície, si 
té garatge o no i l'edat de la casa, amb el format següent:

   “C/ Aldea alta, nº 48 Llíria superfície=130.0m² té garatge, edat=40 anys”

### Es posible continuar con este punto sin realizar los puntos 7 y 8. 

9. Crea una aplicació amb els components necessaris per:
- introduir les dades d'una casa y una vegada introduits, confirmar amb el usuari si vol:
- esborrar les dades d'una casa i per tant no guardarla
- validar les dades introduïdes creant un objecte de la classe Casa i visualitza la informació de l'objecte creat.
