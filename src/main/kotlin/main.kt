
fun main() {
    val discount = 100
    val maxDiscount = 0.95
    println("Введите сумму покупки: ")
    val amount = readln().toInt()
    println("Этот клиент постоянный? (true/false): ")
    val regularCustomer = readln().toBoolean()
    var resultAmount = amount
    if (amount in 1001 .. 10000) resultAmount = amount - discount
    if (amount > 10000) resultAmount = (amount * maxDiscount).toInt()
    if (regularCustomer) resultAmount = (resultAmount * 0.99).toInt()
    println("Итоговая стоимость покупки: $resultAmount руб.")

}