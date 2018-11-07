package error_handling

object MapAndFlatten {
    val v1: Option[Int] = Some(2)
    val v2: Option[Int] = Some(3)
    val v3: Option[Int] = Some(5)
    val v4: Option[Int] = Some(7)
    val v5: Option[Int] = Some(11)

    def main(args: Array[String]): Unit = {
        val r6: Option[Int] = v1.map{ i1 =>
                                  v2.map{i2 => i1 * i2}
                              }.flatten
        println(r6)

        val r30 = v1.map{ i1 =>
                      v2.map{ i2 =>
                          v3.map{ i3 => i1 * i2 * i3 }
                      }.flatten
                  }.flatten
        println(r30)

        val r210 = v1.map{ i1 =>
                       v2.map{ i2 =>
                           v3.map{ i3 =>
                                v4.map{ i4 => i1 * i2 * i3 * i4}
                           }.flatten
                       }.flatten
                   }.flatten
        println(r210)

        val r2310 = v1.map{ i1 =>
                        v2.map{ i2 =>
                            v3.map{ i3 =>
                                v4.map{ i4 =>
                                    v5.map{ i5 => i1 * i2 * i3 * i4 * i5}
                                }.flatten
                            }flatten
                        }.flatten
                    }.flatten
        println(r2310)
  }
}
