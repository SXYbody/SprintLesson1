package org.example.Lessons_11_1_5.Lessons_11_5


class Forum() {
    val memberList: MutableList<ForumMember> = mutableListOf()
    val messageList: MutableList<ForumMessage> = mutableListOf()
    var id = 0

    fun createNewUser(name: String): Int {
        val user = ForumMember(++id, name)
        memberList.add(user)
        return id
    }

    fun createNewMessage(id: Int, userMessage: String) {
        if (memberList.find { it.userId == id }?.userId == id) {
            val message = ForumMessage(id, userMessage)
            messageList.add(message)
        }
    }

    fun printThread() {
        for (message in messageList) {
            println("${memberList.find { it.userId == message.authorId }?.userName}: ${message.message}")
        }
    }
}

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

fun main() {
    val forum1 = Forum()

    val user1 = forum1.createNewUser("Шерлок")
    val user2 = forum1.createNewUser("Ватсон")

    forum1.createNewMessage(user1, "Андерсен, не говори вслух, ты понижаешь IQ всей улицы!")
    forum1.createNewMessage(user2, "Ну что там? Шерлок.")
    forum1.createNewMessage(user1, "Не мешайте искать улики.")
    forum1.createNewMessage(user2, "Может я могу тебе чем-то помочь?")

    forum1.printThread()
}