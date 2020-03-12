package fundamentos

fun main(args: Array<String>) {
    val opcional: String? = null
//    val obrigatorio: String  = opcional // Vai gerar erro pois não se pode atribuir valor de uma value opcional em uma obrigatoria
    val obrigatorio: String = opcional ?: "Valor Padrão"

    println(obrigatorio)
}