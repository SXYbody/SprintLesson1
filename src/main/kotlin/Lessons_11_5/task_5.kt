package org.example.Lessons_11_5

val memberList = mutableListOf<forumMember>()
val messageList = mutableListOf<forumMessage>()

class forumMember(
    val userId: String,
    val userName: String,
) {}

class forumMessage(
    val authorId: String,
    val message: String,
) {}

fun createNewUser(name: String): forumMember {

    val idRange = 0..9
    var id = ""
    for (i in 0..3) {
        id += idRange.random()
    }

    memberList.add(forumMember(id, name))
    return forumMember(id, name)
}

fun createNewMessage(id: String, userMessage: String) {

    for (i in memberList) {
        if (i.userId == id) {
            messageList.add(forumMessage(id, userMessage))
        }
    }
}

fun printThread() {
    for (i in messageList) {
        for (g in memberList) {
            if (g.userId == i.authorId) {
                print("\n${g.userName}: ${i.message}")
            }
        }
    }
}

fun main() {

    val user1 = createNewUser("Шерлок")
    val user2 = createNewUser("Ватсон")

    createNewMessage(user1.userId, "Андерсен, не говори вслух, ты понижаешь IQ всей улицы!")
    createNewMessage(user1.userId, "Не мешайте искать улики.")

    createNewMessage(user2.userId, "Ну что там? Шерлок.")
    createNewMessage(user2.userId, "Может я могу тебе чем-то помочь?")

    printThread()
}