package implicit_esc

object EnrichString2 {

    implicit class RichString(val src: String) {
        def smile: String = src + ":-)"
    }

    def main(args: Array[String]): Unit = {
        println("Hi, ".smile)
    }
}

/**
  * EnrichString1.scala の定義は、Scala 2.10以降では、上記の形で書きなおすことができます。
  * implicit classはpimp my libraryパターン専用の機能であり、implicit defで既存型への変換した場合などによる混乱がないため、
  * Scala 2.10以降でpimp my libraryパターンを使うときは基本的に後者の形式にすべきですが、
  * サードパーティのライブラリや標準ライブラリでも前者の形式になっていることがあるので、そのようなコードも読めるようにしておきましょう。
  */