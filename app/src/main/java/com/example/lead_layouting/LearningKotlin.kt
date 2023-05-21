package com.example.lead_layouting

import android.util.Log

class LearningKotlin {
    fun sample() {
        // TODO: isinya

        // Variable
        val a = 0 // val tidak dapat berubah
        var b = 0 // var bisa berubah
        var c = "asd"

        var angka : Int = 123
        var isAvailable : Boolean = true
        var longNumber: Long = 1000000L
        var desimal : Double = 10.5

        // output
        println("message") //terminal
        Log.e("LearningKotlin","sample: error" ) //untuk logcat androidstudio
        Log.d("LearningKotlin", "sample: debug")
        Log.i("LearningKotlin", "sample: informasi")
        Log.wtf("LearningKotlin", "sample: wtf (error)" )

        // Kondisi
        val equalTo = 1 == 2 // == ---> equal to
        val greaterTo = 1>2 // > ---> greater to
        val lessTo = 1<2 // < ---> less to
        val lessOrEqualTo = 1<=2 // <= ---> less or equal to
        val and = true && true // and
        val or = true || true // or
        val not = !true // not

        // Percabangan
        if (true) {
            // TODO : do something true
        } else {
            // TODO : do something false
        }

        if (true) {
            // TODO : do something true 1
        } else if(true){
            // TODO : do something true 2
        } else {
            // TODO : do something false
        }

        val bis = 3
        when(bis) {
            0 -> println("bis 0")
            1 -> println("bis 1")
            2 -> println("bis 2")
            3 -> println("bis 3")
            else -> println("bis lainnya")
        }

        // Perulangan
        val start = 0
        val end = 100
        for (x in start..end) {
            Log.e("test", "sample: $x")
        }

        // Array / List
        val listFibonaci : ArrayList<Int> = arrayListOf()  // array list itu dapat ditambah dan dirubah
        listFibonaci.add(0)
        listFibonaci.add(1)
        listFibonaci.add(2)
        listFibonaci.add(3)
        listFibonaci.add(70)
        listFibonaci.remove(3)
        Log.e("test", "sample: ${listFibonaci[0]}")

        val listFix : List<String> = listOf("udin", "asep", "beti")
        Log.e("test", "sample: ${listFix[0]}")

        listFix.forEach {
            Log.e("TAG", "sample: $it", )
        }
        // sama
        for (x in listFix) {
            Log.e("TAG", "sample: $x", )
        }

        val mutableList = mutableListOf<Int>() // sama dengan array list (tapi beda scema)
        mutableList.add(90)
        mutableList.remove(90)
        mutableList.add(0, 100)
        val listConvert = mutableList.toList() // merubah ke list
        val mutableListConvert = listConvert.toMutableList() // merubah kembali ke mutable list

        doSomething()
        val calculateThis = calculate()
        val jumlahAngka = penjumlahan(10, 20)

        val sepeda = Bike(2, "bycyle")
        sepeda.bergerak()
        sepeda.setRoda(3)
        sepeda.getRoda()
        sepeda.something
    }

    // Fungsi tanpa return / Procedure / Method
    fun doSomething() {
        // TODO : do something
    }

    // Fungsi dengan return / fungsi
    fun calculate() : Int {
        // TODO : do Something
        return 0
    }

    fun penjumlahan(a: Int, b:Int) : Int {
        return a+b
    }


    class Bike(r : Int, m: String) {
        val something = ""
        private var roda = r
        private var merek = m

        fun bergerak() {
            Log.e("TAG", "$merek ini bergerak")
        }

        fun getRoda() : Int {
            return roda
        }

        fun setRoda(newRoda: Int){
            roda = newRoda
        }
    }


    fun Akif() {
// TODO: rubah disini
    }

    fun Syaid() {
// TODO: rubah disini

    }

    fun Zahra() {
// TODO: rubah disini

    }

    fun Zacky() {
// TODO: rubah disini

    }
}