object ejercicio6 {
  def main(args: Array[String]): Unit = {
    // Solicitar al usuario ingresar calificaciones
    println("Ingresa la calificación de la primera materia:")
    val materia1 = scala.io.StdIn.readDouble()

    println("Ingresa la calificación de la segunda materia:")
    val materia2 = scala.io.StdIn.readDouble()

    println("Ingresa la calificación de la tercera materia:")
    val materia3 = scala.io.StdIn.readDouble()

    println("Ingresa la calificación de la cuarta materia:")
    val materia4 = scala.io.StdIn.readDouble()

    println("Ingresa la calificación de la quinta materia:")
    val materia5 = scala.io.StdIn.readDouble()

    // Calcular el total, el promedio y el porcentaje
    val total = materia1 + materia2 + materia3 + materia4 + materia5
    val promedio = total / 5
    val porcentaje = (total / 50) * 100 

    println("\nTotal de calificaciones: "+total)
    println("Promedio: "+promedio)
    println("Porcentaje: "+porcentaje)
  }
}
