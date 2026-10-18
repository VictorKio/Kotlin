fun main() {
    val name = "Ahmed";
    println(name.length);
    println(name.uppercase());
    println(name.lowercase());
    println(name[0]);
    println(name);

    val age = 20;

    val msg = "Name: $name, Age: $age";

    println(msg)

    val email = """
        Hello %s
        How %d
        Are you
    """.trimIndent()

    println(email.format("Victor", 24))
    
}