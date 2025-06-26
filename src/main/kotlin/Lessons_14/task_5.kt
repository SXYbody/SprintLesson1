package org.example.Lessons_14

class Chat() {
    val messageList = mutableListOf<Message>()
    var id = 0

    fun addMessage(message: String): Message {
        val message = Message(message, ++id, mutableListOf())
        messageList.add(message)
        return message
    }

    fun addThreadMessage(idM: Message, littleMessage: String) {
        idM.thread.add(LittleMessage(littleMessage, ++id))
    }

    fun printChat() {
        messageList.forEach { mes ->
            println("${mes.message}")
            if (mes.thread.size > 0) {
                mes.thread.forEach { litMes ->
                    println(" ${litMes.message}")
                }
            }
        }
    }
}

class Message(
    val message: String,
    val id: Int,
    val thread: MutableList<LittleMessage>,
)

class LittleMessage(
    val message: String,
    val id: Int,
)

fun main() {

    val mes1 = Chat().addMessage("Привет")
    Chat().addThreadMessage(mes1, "Привет, друг!")
    Chat().addThreadMessage(mes1, "Иди отсюда!!")
    Chat().addThreadMessage(mes1, "Я первый, можно медальку?")

    val mes2 = Chat().addMessage("Как у кого дела?")
    Chat().addThreadMessage(mes2, "У меня не очень :(")

    Chat().printChat()
}