/**
 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
 *
 * We define the rating for Alice's challenge to be the triplet A = (a0,a1,a2) , and the rating for Bob's challenge to be the triplet B = (b0,b1,b2).
 *
 * Your task is to find their comparison points by comparing  a0 with b0, a1 with b1, and a2 with b2.
 *
 * If ai > bi, then Alice is awarded 1 point.
 * If ai < bi , then Bob is awarded 1 point.
 * If ai = bi, then neither person receives a point.
 * Comparison points is the total points a person earned.
 *
 * Given A and B, can you compare the two challenges and print their respective comparison points?
 *
 * Input Format
 *
 * The first line contains 3  space-separated integers a0,a1,a2 describing the respective values in triplet A.
 * The second line contains 3 space-separated integers b0,b1,b2 describing the respective values in triplet B.
 *
 * Constraints
 *  => 1 <= ai <= 100
 *  => a <= bi <= 100
 *
 * Output Format
 *
 * Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.
 *
 * Sample Input
 *
 * 5 6 7
 * 3 6 10
 * Sample Output
 *
 * 1 1
 * Explanation
 *
 * In this example:
 *
 * A = (a0,a1,a2) = (5,6,7)
 * B = (b0,b1,b2) = (3,6,10)
 *
 * Now, let's compare each individual score:
 *
 * a0 > b0, so Alice receives 1 point.
 * a1 = b1, so nobody receives a point.
 * a2 < b2, so Bob receives  point.
 * Alice's comparison score is 1, and Bob's comparison score is 1. Thus, we print 1 1 (Alice's comparison score followed by Bob's comparison score) on a single line.
 *
 * @author kedar.parikh
 */

object CompareTheTriplets {

  def main(args: Array[String]) {

    val sc = new java.util.Scanner(System.in);
    var a0 = sc.nextInt();
    var a1 = sc.nextInt();
    var a2 = sc.nextInt();
    var b0 = sc.nextInt();
    var b1 = sc.nextInt();
    var b2 = sc.nextInt();

    val aliceChallengeTriplet = Array(a0, a1, a2)
    val BobChallengeTriplet = Array(b0, b1, b2)

    val finalScore = aliceChallengeTriplet.zip(BobChallengeTriplet).foldLeft(Tuple2(0, 0)) { (a, b) =>
      if (b._1 > b._2) Tuple2(a._1 + 1, a._2) else if (b._2 > b._1) Tuple2(a._1, a._2 + 1) else a
    }
    print(s"${finalScore._1} ${finalScore._2}")

  }

}