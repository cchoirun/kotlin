package src.app

import src.data.Action

fun fireAction(action: Action){
    action.action()
}

class SampleAction: Action{
    override fun action() {
        println("This is sample action")
    }
}

fun main() {

    fireAction(SampleAction())
    fireAction(object : Action{
        override fun action() {
            println("This is action two")
        }
    })
}