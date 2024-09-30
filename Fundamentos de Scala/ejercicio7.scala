object ejercicio7 {
  def main(args: Array[String]): Unit = {
    // Solicitar al usuario ingresar la base y la altura
    println("Ingresa la longitud de la base del triángulo:")
    val base = scala.io.StdIn.readDouble()

    println("Ingresa la altura del triángulo:")
    val altura = scala.io.StdIn.readDouble()

    // Calcular el área del triángulo
    val area = (base * altura) / 2

    println("El área del triángulo con base "+base+" cm y altura "+altura+" cm es de: "+area+" cm2")
  }
}

