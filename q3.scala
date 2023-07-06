object FormatString{
    def main(args: Array[String]): Unit={
        var names: List[String] = List("Benny" , "Niroshan" , "Saman" , "Kumara") 
        formatName(names)
    }

    def toUpper(str: String): String = { str.toUpperCase()}
    def toLower(str: String): String = { str.toLowerCase()}
    def formatName(name : List[String]): Unit={
        var str1 = toUpper(name(0))
        var str2 = name(1).head+toUpper(name(1).slice(1,2)) + name(1).slice(2,8)
        var str3 = toLower(name(2))
        var str4 = name(3).slice(0,5) + toUpper(name(3).slice(5,6))
        println(str1)
        println(str2)
        println(str3)
        println(str4)

    }
}