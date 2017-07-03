
/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 *
 * Input Format
 *
 * A single line of five space-separated integers.
 *
 * Constraints
 *
 * Each integer is in the inclusive range [1,10^9].
 * Output Format
 *
 * Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)
 *
 * Sample Input
 *
 * 1 2 3 4 5
 * Sample Output
 *
 * 10 14
 *
 * @author kedar.parikh
 */
object MinMaxSum {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var arr = new Array[Long](5);
    for (arr_i <- 0 to 5 - 1) {
      arr(arr_i) = sc.nextInt();
    }

    val zipIndex = arr.zipWithIndex
    val sumSummary = (for (a <- zipIndex) yield {
      zipIndex.filter(p => p._2 != a._2).foldLeft(0l)((z, b) => z + b._1) -> a._2
    }).toMap

    print(s"${sumSummary.min._1} ${sumSummary.max._1}")
  }
}