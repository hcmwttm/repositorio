data class User(
    val username: String,
    val passwordHash: String,
    val role: String
)

fun main() {
    val newUser = User("Joao", "123456", "Gerente")

    if (newUser.role == "Administrador") {
        println("Acesso total")
    } else if (newUser.role == "Gerente") {
        println("Acesso limitado")
    } else {
        println("Acesso básico")
    }
