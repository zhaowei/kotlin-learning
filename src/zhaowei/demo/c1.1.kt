package zhaowei.demo

fun sum(a: Int, b:Int): Int {
    return a + b;
}

//表达式作为函数体， 返回值类型自动推断函数
fun sum2(a: Int, b:Int) = a + b

//函数返回无意义的值， Unit 类型可省略
fun printSum(a: Int, b:Int): Unit {
    println("sum of $a and $b is ${a + b}")

}

fun maxOf(a: Int, b:Int) : Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun parseInt(str: String) : Int? {
    return str.toIntOrNull();
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y!= null) {
        println(x * y)
    } else {
        println("either '$arg1' or '$arg2' is not a number")

    }
}

fun main(args: Array<String>) {

    println(sum(3, 5))
    println("sum of 19 and 23 is ${sum2(19, 23)}")
    printSum(1, 2)

    //定义变量
    val a: Int = 1 //立即赋值
    val b=2
    val c: Int
    c=3

    println("max of 0 and 42 is ${maxOf(0, 42)}")

    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")

}