//trabajando con mapas
fun main(){
    //MAPA MUTABLE
    val ladas: Map<Int, String> = mapOf(
    1 to "usa",
    34 to "Espana",
    52 to "Mexico",
    233 to "Ghana"
    );
//imprimiento el conjunto de pares clave valor 
    println(ladas);

    //imprimiendo el conjunto usando el for
for ((key,value) in ladas){
    println("La clave lada de $value es $key");
}

    //recupera un solo elemento 
    println(ladas.get(52));
    println(ladas.get[52]);
    //recupera su tamaño, cuantos pares hay en el mapa
    println("tamano: ${lada.size}");
    //recuperar sólo las claves 
    println("Claves del mapa: ${ladas.keys}");
    //recuperar solo los valores
    primero("Valores del mapa: ${ladas.values}");
    //recupera las entradas
    println("las entradas del mapa: ${ladas.entries}");
}