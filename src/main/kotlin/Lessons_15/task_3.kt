package org.example.Lessons_15

val messageList = mutableListOf<String>()
val userList = mutableListOf<CommonUser>()

abstract class User(
    val name: String,
) : Addition {
    override fun addMessage(message: String) {
        messageList.add(message)
    }
}

class CommonUser(
    name: String,
) : User(name = name)

class Administrator(
    name: String,
) : User(name = name), Removal {

    override fun deleteMessage(message: String) {
        messageList.remove(message)
    }

    override fun deleteUser(user: CommonUser) {
        userList.remove(user)
    }

}

interface Addition {
    fun addMessage(message: String)
}

interface Removal {
    fun deleteMessage(message: String)
    fun deleteUser(user: CommonUser)
}

fun main() {
    val user1 = CommonUser("BobSTie")
    val admin1 = Administrator("Кластер")
    userList.add(user1)
    val mes1 = user1.addMessage("Всем привет")

    admin1.addMessage("Пока")
    admin1.deleteUser(user1)
    admin1.deleteMessage(mes1.toString())
}