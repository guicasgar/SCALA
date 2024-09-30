object ejercicio5 {
  def main(args: Array[String]): Unit = {
    //escribir un programa que ingrese una temperatura en celsius y otra en Fahrenheit, cconvertir las dos en Kelvin.
    val T_celsius=23.4f
    val T_Fahrenheit= 92.1f
    
    val Kelvin = 273.15f

    val T_Kelvin_Cel=T_celsius+Kelvin
    val T_Kelvin_Fah = (T_Fahrenheit-32)*5/9+Kelvin

    println("23.4 grados Celsius son "+T_Kelvin_Cel+" grados Kelvin")
    println("92.1 grados Fahrenheit son "+T_Kelvin_Fah+" grados Kelvin")
  }
}
