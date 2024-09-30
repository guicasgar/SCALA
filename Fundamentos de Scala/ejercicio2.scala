//Crear un programa declarando variables tipo var y val, mostrarlo por pantalla e ir comentando el código paso por paso.

object ejercicio2 {
  def main(args: Array[String]): Unit = {
    //Declaramos una varibale string mutable
    var nombre:String="Guillermo"
    println("Nombre: "+nombre)
    //Cambiamos el contenido de la variable nombre y comprobamos si ejecuta sin problemas
    nombre = "Jose"
    println("El nombre ahora es: "+nombre)

    //Declaramos una varible string inmutable
    val nombre1:String="Francisco"
    println("Nombre: "+nombre1)
    //Cambiamos el contenido de la variable nombre y comprobamos si ejecuta sin problemas
    val nombre2 = "Alberto"
    println("El nombre sigue siendo: "+nombre1)
    println("El nombre 2 es: "+nombre2)
  }
}
