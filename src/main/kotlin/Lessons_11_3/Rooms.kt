package org.example.Lessons_11_3

class Rooms(
    val roomCover: String, val roomName: String, val roomList: MutableList<Users> = mutableListOf()
) {
    fun addListenerToRoom(user: Users) {
        roomList.add(user)
    }

    fun printRoomState() {
        var userRoomString = ""
        roomList.forEach { userRoomString += "\nИмя: ${it.userName}, Статус: ${it.userStatus}" }

        val printStatistic = """
            Описание аватарки комнаты: $roomCover
            Название комнаты: $roomName
            Список слушателей в комнате: 
            $userRoomString
    """.trimMargin()

        println(printStatistic)
    }
}

class Users(
    val userName: String,
    val userStatus: String,
)

fun main() {
    val user1 = Users("Петунья", "Разговаривает")
    val user2 = Users("Френк", "Пользователь заглушен")
    val user3 = Users("Полли", "Микрофон выключен")

    val room1 = Rooms("Ацелот в подкузнике", "Крутые_Перцы")

    room1.printRoomState()
    room1.addListenerToRoom(user1)
    room1.addListenerToRoom(user2)
    room1.printRoomState()
}