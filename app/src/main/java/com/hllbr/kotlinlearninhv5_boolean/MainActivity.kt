package com.hllbr.kotlinlearninhv5_boolean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Boolean-->True/False değerler dönen bir veri tipidir.Java C C++ gibi dillerde de bu yapı bulunmaktadır

        var myBoolean : Boolean = true

        /*
        Örnek olarak oyun yazarken karakterin devam etmek için yeteri kadar canı var mı ?
        işlemleri kullanıcı gerçekleştirirken app'i bitirmek için gerekli tuşlamalaradn yada işlemlerden herhangi birini yaptı mı ?


         */
        var isAlive = true

        /*
        Bir verinin başka bir veri ile karşılaştırılmasının sonucunu alırken bu veri tipinden yararlanıyoruz
        < > => <= == != gibi sorgulamalar sırasında bu ifadelerle karşılaştırmalar yapıyoruz
         && ||
         */
        println(3<5)

        println(6<3)

        println(3 == 3)

        println(3 != 4)





        /*Veri tiplerinin birbirlerine dönüştürülmesi ==

        toByte()
        toShort()
        toInt()
        toLong()
        toFloat()
        toDouble()
        toByte()
        toChar()
        ...
         */





        //Conversion ==

        // Örnek olarak internetten bir veri aldığımızı varsayılım bu veri bize integer olarak geliyor fakar bizim bunu long veri tipinde işlememiz ve değerlendirmemiz gerekiyor.Bir çevirme işlemi gerçekleştirerek sorunu ortadan kaldırmamız mümkün


        var myNumber = 5//integer veri tipindeyim şuan

        var myLongNumber =  myNumber.toLong()
        println("data : "+myLongNumber)


        var input2 = "10"
        //println(input2 *2)//Kotlin buna izin vermiyor fakat bir çerime işlemi yaparak String verimi İnteger veri tipine çeivirirsem buna izin verir tabi burda çeivirilecek olan veri tipi içerisinde sadece integer veri tipine uygun bir tanımlama olması önemli
       // var changeInt = input2.toIntOrNull()


        var changeInt = input2.toInt()

        println("Changed Data : "+changeInt* 2 )

    }
}