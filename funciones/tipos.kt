//Usando funciones que regresan valores
// y funciones que no regresen valores

fun main(){
    val numero1 = 10;
    val numero2 = 5;
    borde("=", 20);
    var resultado = suma(numero1, numero2);
    
    println(resultado);
    borde("*", 35);
    // Ejemplo de 1 funcion anónima 
    val slogan = { r : Int-> println("tu puedes con $r y mas")};

    // Invocar función anónima - forma1
    slogan(resultado);

    val resta = { n1 : Int, n2 : Int -> n1-n2}
    println( "Resta: ${resta(12,18)} ");

    val max = { n1: Int, n2: Int, n3: Int -> maxOf(n1, n2, n3) }
    println("Valor máximo: ${max(13, 10, 112)}")

    //funcion anonima que calcule el promedio de tres numeros
    val promedio = { n1: Int, n2: Int, n3: Int -> (n1 + n2 + n3) / 3 }
    println("Promedio: ${promedio(7, 9, 5)}")
    
// //Funcion anónima que encuentre el mayor de los 3 numeros 
//     val max = { n1: Int, n2: Int, n3: Int}
//     println("Valor maximo: ")

// // Función anónimo que calcule el promedio de tres números
//     val promedio ={};
//     println("Promedio: ");


}

fun borde(caracter : String, veces : Int){
    for (i in 1..veces){
        print(caracter);

    }
    println();
}

fun  suma(n1: Int, n2:Int): Int{
    
    return n1+n2;
    
}

