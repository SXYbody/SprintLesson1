package org.example.Lessons_22

class MainScreenViewModel(
    var mainScreenState: MainScreenState,
) {
    fun loadData() {
        println("Загрузка данных.")
        mainScreenState.data = "наличие загруженных данных."
    }
}

data class MainScreenState(
    var data: String,
    var isLoading: Boolean = false,
)

fun main() {
    val mainScreenState = MainScreenState("Отсутствие данных")
    val mainScreen = MainScreenViewModel(mainScreenState)
    println(mainScreen.mainScreenState)

    mainScreen.loadData()
    val mainScreenState2 = mainScreenState.copy(isLoading = true)
    mainScreen.mainScreenState = mainScreenState2

    println(mainScreen.mainScreenState)
}