fun main() {
    val firstNames = mutableListOf<String>()
    val lastNames = mutableListOf<String>()
    val nationalCodes = mutableListOf<String>()
    val classes = mutableListOf<Byte>()

    while (true) {
        println("به سامانه استعلام دانش آموزان خوش آمدید!")
        println("[1] -> جهت ثبت دانش آموز جدید")
        println("[2] -> جهت استعلام دانش آموز")
        println("[0] -> جهت خروج از سامانه")
        when(readln().toInt()) {
            0 -> {
                println("خدانگهدار")
                break
            }

            1 -> {
               println(" نام دانش آموزش را وارد کنید :")
               firstNames.add(readln())
                println(" نام خانوادگی دانش آموزش را وارد کنید :")
                lastNames.add(readln())
                println(" کد ملی دانش آموزش را وارد کنید :")
                nationalCodes.add(readln())
                println(" شماره کلاس دانش آموزش را وارد کنید(بین عدد 1 تا 6) :")
                classes.add(readln().toByte())
                println("ثبت نام دانش آموز با موفقیت انجام شد!")
            }

            2 -> {
                println("لطفا کد ملی دانش آموزش مورد نظر را وارد کنید")
                val  studentCode = readln()
                var found = false
                for ((index,code) in nationalCodes.withIndex()){
                    if (code == studentCode) {
                        found = true
                        println("مشخصات دانش آموزش مورد نظر:")
                        println("${firstNames[index]} ${lastNames[index]} کلاس ${classes[index]}")
                        break
                    }

                }
                if (!found) {
                    println("هیچ دانش آموزی با این کد ملی در مدرسه ثبت نام نکرده است!")
                }
            }
        }
    }

}