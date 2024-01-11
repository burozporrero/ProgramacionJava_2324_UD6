# REFERENCIA SUPER

Si this sirve para hacer referencia a la instancia actual del objeto, super sirve para hacer lo propio con la clase
padre de nuestro objeto (la clase de la se hace el extends), eso quiere decir que nos permite acceso a los
constructores, métodos y atributos de la clase de la que hereda.

Una clase que hereda de otra, en sus constructores, siempre debe llamar en la primera línea a los
constructores de clase padre con super() o a otro de sus constructores con this() de forma que al final siempre se llame a alguno de los constructores de la clase padre.

Si la clase padre tiene un constructor sin parámetros entonces no es necesario hacer la llamada con super() porque por defecto Java hace la llamada al constructor sin parámetros de la clase padre.

Volvamos al ejemplo de la clase Punt:

    public class Punt {

      private int x; 
      private int y;
      private static int cantidadPuntos;

      public Punt(int x, int y) { 
          cantidadPuntos++;
          this.x = x;
          this.y = y;
      }

      public Punt(){
          this(0, 0);
      } 

En primer lugar, es necesario indicar que todas las clases creadas de esta manera, si no se indica lo contrario,
heredan de Object.
Por lo tanto, en este ejemplo, el compilador está añadiendo de forma ímplicita la llamada super siguiente:

    public class Punt {

      private int x; 
      private int y;
      private static int cantidadPuntos;

      public Punt(int x, int y) { 
          super();  // Esto se añade en tiempo de compilación
          cantidadPuntos++;
          this.x = x;
          this.y = y;
      }

      public Punt(){
          this(0, 0);
      } 

Ahora bien, la forma más correcta de declarar constructores es añadir la llamada a super(), de forma que, cuando
necesitamos un constructor por defecto, haremos lo siguiente:

    public class Punt {

      private int x; 
      private int y;
      private static int cantidadPuntos;

      public Punt(){
          super();
      } 

      public Punt(int x, int y) { 
          super();  // Esto se añade en tiempo de compilación
          cantidadPuntos++;
          this.x = x;
          this.y = y;
      }
