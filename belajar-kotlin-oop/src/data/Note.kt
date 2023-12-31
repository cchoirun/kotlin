package src.data

class Note(title: String) {
    var title: String = title

//        get() = field
        get() {
            println("Call getter")
            return field
        }
        set(value){
            println("Call setter")
            if(value.isNotBlank()){
                field = value
            }else{
                println("Invalid title")
            }
        }
}

class BigNote ( val title: String){
    val bigTitle: String

        get(){
            return title.uppercase()
        }
}