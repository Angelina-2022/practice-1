fun main(args: Array<String>) {
//задача 1
    val exercises: Int = 13
    var exercisesSolved: Int = 0 //увеличивается каждый раз при решении задачи на 1(начиная с этой)
    exercisesSolved ++

    //задача2
    val myAge: Int = 19
    exercisesSolved ++

    //задача3
    var personAge: Double = 19.0
    personAge = (personAge + 30.0)/2
    exercisesSolved ++

    //задача4
    val testNumber: Int = 18
    val evenOdd= testNumber%2
    /* если изменить значение testNumber на четное число, то значение EvenOdd =0, если на нечетное, то 1*/
    exercisesSolved ++

    //задача5
    var answer: Int = 0
    answer ++
    answer +=  10
    answer *=10
    answer= answer shr 3
    /* println(answer)
     при выводе в консоль получаем значение 13 */
    exercisesSolved ++

    //задача6
    var age : Int
    /* use var типа int потому что в дальнейшем значение будет меняться*/
    exercisesSolved ++

    //задача7
    val a1: Int=46
    val b1: Int = 10
    val answer1: Int = (a1*100)+b1            //println(answer1) =4610
    val answer2:Int = (a1*100)+(b1*100)  //println(answer2) =5600
    val answer3:Int = (a1*100)+(b1/10)    //println(answer3) =4601
    exercisesSolved ++

    //задача8
    (5*3)-((4/2)*2)
    exercisesSolved ++

    //задача9
    val a: Double=17.0
    val b: Double=29.0
    val average =(a+b)/2
    exercisesSolved ++

    //задача10
    val fahrenheit: Double=220.4
    val celcius: Double= (fahrenheit-32)/1.8
    exercisesSolved ++

    //задача11
    val position: Int =55
    val row= position /8
    val column = position %8
    //шахматная доска имеет вид таблицы 8на8
    // номер строки это число из таблицы деленное на количество строк,
    // а номер столбца это остаток от деления числа на кол-во столбцов
    // для числа 55 row=6, column=7
    exercisesSolved ++

    //задача12
    val degrees: Double=245.0           //  градусы
    val radians: Double = degrees*(Math.PI / 180)
    // для числа 245 = 4.276...
    //формула перевода угла в радианы = градусы * (пи/180)
    exercisesSolved ++
}