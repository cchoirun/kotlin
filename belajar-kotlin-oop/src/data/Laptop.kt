package src.data

import java.io.StringReader

class Laptop(val name:String)

open class Handphone(val name: String)

class SmartPhone(name: String, val os: String) : Handphone(name)