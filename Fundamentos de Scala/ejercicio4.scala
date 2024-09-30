object ejercicio4 {
  def main(args: Array[String]): Unit = {
    //Escribir un programa que ingrese la longitud en pulgadas y conviértala en metros y kilómetros.
    val m=39.37f

    var pulgadas:Int= 30
    var metros= pulgadas/m
    var kilometros=metros/1000

    println("Un metro son "+m+" pulgadas")
    println("30 pulgadas son "+metros+" metros, y "+kilometros+" kilómetros")
  }
}
