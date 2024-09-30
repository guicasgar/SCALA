object ejercicio3 {
  def main(args: Array[String]): Unit = {
    // Valores proporcionados
    val numEntero: Int = 4
    val numDecimal: Double = 6.7
    val numFlotante: Float = 2.98f
    val numLong: Long = 23456
    val numShort: Short = 456

    // Operaciones básicas
    val suma = numEntero + numDecimal
    val resta = numLong - numShort
    val multiplicacion = numFlotante * numDecimal
    val division = numShort / numEntero 

    println("Número entero: "+numEntero)
    println("Número decimal: "+numDecimal)
    println("Número flotante: "+numFlotante)
    println("Número Long: "+numLong)
    println("Número Short: "+numShort)
    println("Suma: "+ suma)
    println("Resta: "+ resta)
    println("Multiplicación: "+ multiplicacion)
    println("División: "+ division)
  }
}
