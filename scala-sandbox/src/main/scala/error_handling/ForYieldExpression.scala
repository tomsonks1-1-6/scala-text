object ForYieldExpression {
    val v1: Option[Int] = Some(2)
    val v2: Option[Int] = Some(3)
    val v3: Option[Int] = Some(5)
    val v4: Option[Int] = Some(7)
    val v5: Option[Int] = Some(11)

    def main(args: Array[String]): Unit = {
        val r2310 = for { i1 <- v1
                          i2 <- v2
                          i3 <- v3
                          i4 <- v4
                          i5 <- v5 } yield i1 * i2 * i3 * i4 * i5

        println(r2310)
    }
}
