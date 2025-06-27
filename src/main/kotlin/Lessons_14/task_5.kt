package org.example.Lessons_14

class Chat() {
    val messageList = mutableListOf<Message>()
    var id = 0

    fun addMessage(message: String, user: User): Message {
        val message = Message(message, ++id, mutableListOf(), user)
        messageList.add(message)
        return message
    }

    fun addThreadMessage(parentMessage: Message, littleMessage: String, user: User) {
        parentMessage.thread.add(LittleMessage(littleMessage, ++id, user))
    }

    fun printChat() {
        messageList.forEach { mes ->
            println("${mes.userParent.name}: ${mes.message}")
            if (mes.thread.size > 0) {
                mes.thread.forEach { litMes ->
                    println("\t${litMes.userParent.name}: ${litMes.message}")
                }
            }
        }
    }
}

class Message(
    val message: String,
    val id: Int,
    val thread: MutableList<LittleMessage>,
    val userParent: User,
)

class LittleMessage(
    val message: String,
    val id: Int,
    val userParent: User
)

class User(
    val name: String
)

fun main() {

    val chat1 = Chat()

    val mes1 = chat1.addMessage("Привет", User("Джон"))
    chat1.addThreadMessage(mes1, "Привет, друг!", User("Nintendo"))
    chat1.addThreadMessage(mes1, "Иди отсюда!!", User("Kiborg777"))
    chat1.addThreadMessage(mes1, "Я первый, можно медальку??", User("Amogus"))

    val mes2 = chat1.addMessage("Как у кого дела?", User("Джон"))
    chat1.addThreadMessage(mes2, "Не очень, с завода уволили:(", User("Кейл"))

    chat1.printChat()

}