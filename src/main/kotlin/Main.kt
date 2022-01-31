import solutions.easy.maximumWealth
import solutions.easy.maximumWealth2
import kotlin.concurrent.timer
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime


fun main() {
    val test1 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 1, 2, 3),
        intArrayOf(3, 2, 1, 5, 4),
        intArrayOf(3, 3, 3, 3, 3),
        intArrayOf(2, 1, 2, 1, 2),
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(1, 2, 3, 4, 5),
    )

    val timeTaken2 = measureTimeMillis {
        maximumWealth2(test1)
    }

    val timeTaken = measureTimeMillis {
        maximumWealth(test1)
    }


    println(" Time1 taken: $timeTaken ms")
    println(" Time2 taken: $timeTaken2 ms")

}