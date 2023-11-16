
//-------------Ejercicio 1-------------

val b = 5 //Limites
val a = 3
def f(x: Double): Double = -x * x + 8 * x - 12 //Funcion a integrar
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2 //definimos h
  val result = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6 //calculamos de acuerdo a la fórmula
  result
}
integracion(a,b,f) //enviamos los parámetros necesarios

  def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
  margenError(7.33, integracion(a,b,f)) //calculamos el margen de error

//-------------Ejercicio 2-------------

val b = 2 //Limites
val a = 0
def f(x: Double): Double = 3* math.pow(x,2) //Funcion a integrar
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2 //definimos h
  val result = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6 //calculamos de acuerdo a la fórmula
  result
}
integracion(a,b,f) //enviamos los parámetros necesarios

def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(8, integracion(a,b,f)) //calculamos el margen de error

//-------------Ejercicio 3-------------

val b = 1 //Limites
val a = -1
def f(x: Double): Double = x + (2 * Math.pow(x,2)) - (Math.pow(x,3)) + (5 * Math.pow(x,4)) //Funcion a integrar
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2 //definimos h
  val result = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6 //calculamos de acuerdo a la fórmula
  result
}
integracion(a,b,f) //enviamos los parámetros necesarios

def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(3.333, integracion(a,b,f)) //calculamos el margen de error


//-------------Ejercicio 4-------------

val b = 2 //Limites
val a = 1
def f(x: Double): Double = (2 * x + 1)/(Math.pow(x,2) + x) //Funcion a integrar
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2 //definimos h
  val result = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6 //calculamos de acuerdo a la fórmula
  result
}
integracion(a,b,f) //enviamos los parámetros necesarios

def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(1.09861, integracion(a,b,f)) //calculamos el margen de error


//-------------Ejercicio 5-------------


val b = 1 //Limites
val a = 0
def f(x: Double): Double =  Math.pow(2.71828,x) //Funcion a integrar
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2 //definimos h
  val result = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6 //calculamos de acuerdo a la fórmula
  result
}
integracion(a,b,f) //enviamos los parámetros necesarios

def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(1.71828, integracion(a,b,f)) //calculamos el margen de error


//-------------Ejercicio 6-------------

val b = 3
val a = 2
def f(x: Double): Double = 1/math.sqrt(x-1) //Funcion a integrar
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2
  val result = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6
  result
}
integracion(a,b,f) //enviamos los parámetros necesarios

def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(0.828427, integracion(a,b,f)) //calculamos el margen de error


//-------------Ejercicio 7-------------

val b = 1 //Limites
val a = 0
def f(x: Double): Double =  1/(1 + Math.pow(x,2)) //Funcion a integrar
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val h = (a + b) / 2 //definimos h
  val result = (b - a) * (f(a) + 4 * f(h) + f(b)) / 6 //calculamos de acuerdo a la fórmula
  result
}
integracion(a,b,f) //enviamos los parámetros necesarios

def margenError(valorEsperado: Double,valorObtenido :Double): Double = Math.abs(valorEsperado-valorObtenido)
margenError(0.785398, integracion(a,b,f)) //calculamos el margen de error


