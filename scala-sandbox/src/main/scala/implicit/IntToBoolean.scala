object IntToBoolean {

    implicit def intToBoolean(arg: Int): Boolean = arg != 0

    def main(args: Array[String]): Unit = {
        if(1) {
            println("1は真なり")
        }
    }
}

/**
implicit conversion（暗黙の型変換）
  implicit conversionは暗黙の型変換機能をユーザが定義できるようにする機能です。
  implicit conversionでは、引数の型と返り値の型に重要な意味があります。
  なぜなら、引数の型の式が現れたときに返り値の型を暗黙の変換候補として登録するからです。
  上記の例では、本来 Boolean しか渡せないはずのif式に Int を渡すことができています。
**/
