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

fun main(args: Array<String>) {

    println(sum(3, 5))
    println("sum of 19 and 23 is ${sum2(19, 23)}")
    printSum(1, 2)

    //定义变量
    val a: Int = 1 //立即赋值
    val b=2
    val c: Int
    c=3


}