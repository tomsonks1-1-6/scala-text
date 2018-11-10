object EnrichString1 {

    class RichString(val src: String) {
        def smile: String = src + ":-)"
    }

    implicit def enrichString(arg: String): RichString = new RichString(arg)

    def main(args: Array[String]): Unit = {
        println("Hi, ".smile)
    }
}

/**
  * 上記の暗黙の型変換の使い方は、pimp my libraryパターンと呼ばれ、
  * 既存のクラスにメソッドを追加して拡張する（ようにみせかける）使い方です。
  *
  * コンパイラは、ある型に対するメソッド呼び出しを見つけたとき、
  * そのメソッドを定義した型がimplicit conversionの返り値の型にないか探索し、
  * 型が合ったらimplicit conversion の呼び出しを挿入するのです。
  *
  * この使い方の場合、implicit conversionの返り値の型が他で使われるものでなければ安全に implicit conversionを利用することができます。
  */
