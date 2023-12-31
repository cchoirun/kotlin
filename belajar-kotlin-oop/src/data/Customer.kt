package src.data

open class Customer(var name: String, var type: String, var balance: Long) {

    constructor(name: String, type: String): this(name, type, 0)
    constructor(name: String): this(name, "Standard")
}

class PremiumCustomer: Customer{
    constructor(name: String, type: String): super(name, type)
    constructor(name: String, type: String, balance: Long): super(name, type, balance)
}

class ExecutiveCustomer(name: String, balance: Long): Customer(name, "Executive", 0){
    constructor(name: String): this(name,0)
}