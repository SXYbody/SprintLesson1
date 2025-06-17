package org.example.Lessons_11_1_5.Lessons_11_3

class Room(
    val roomCover: String,
    val roomName: String,
    val users: MutableList<User> = mutableListOf()
) {
    fun addListenerToRoom(user: User) {
        users.add(user)
    }

    fun statusUpdate(user: User, userStatus: String){
        users[users.indexOf(user)].userStatus = userStatus
    }
}

class User(
    val userName: String,
    val userAvatar: String,
    var userStatus: String,
)

fun main() {
    val user1 = User("Петунья","Красивый цветок", "Разговаривает")
    val user2 = User("Френк","Крипер на песке", "Пользователь заглушен")
    val user3 = User("Полли","Ромашка", "Микрофон выключен")

    val room1 = Room("Ацелот в подкузнике", "Крутые_Перцы")

}