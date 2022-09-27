package com.example.mybelineapp.utils

import com.example.mybelineapp.Myinfo.Myinfo

object MyDate {

    val listTarif = ArrayList<Myinfo>()
    val listDaqiqa = ArrayList<Myinfo>()
    val listInternet=ArrayList<Myinfo>()
    val listSms=ArrayList<Myinfo>()
    val listYangiliklar=ArrayList<Myinfo>()
    val listXizmatlar=ArrayList<Myinfo>()

    fun loadData() {

        listTarif.add(Myinfo("Hammasi Zo'r 1", "oyiga 20000 so'm","1500 daqiqa","3GB kunduzgi","9 Gb tungi" ))
        listTarif.add(Myinfo("Hammasi Zo'r 2 ", "oyiga 30000 so'm ","2500 daqiqa","5 Gb kunduzgi","15 Gb tungi"))
        listTarif.add(Myinfo("Hammasi Zo'r 3 ", "oyiga 40000 so'm ","Cheksiz daqiqa","8 Gb kunduzgi","24 GB tungi"))
        listTarif.add(Myinfo("Hammasi Zo'r 4 ", "oyiga 60000 so'm ","Cheksiz daqiqa","15 GB kunduzgi","45 Gb tungi"))
        listTarif.add(Myinfo("Status Silver ", "oyiga 90000 so'm ","Cheksiz  daqiqa","30 Gb kunduzgi","90 Gb tungi "))

        listDaqiqa.add(Myinfo("oddiy 10", "Oyiga 10 000 so'","1500 daqiqa","3GB","ugug"))
        listDaqiqa.add(Myinfo("oddiy 10", "Oyiga 10 000 so'm","2500","5GB","ugu"))
        listInternet.add(Myinfo("Internet-Paket 1 GB","10000 so'm ","Ulanish *101*2","30 kunga","Ulanish uchun hisobda minimal mablag' 10200"))
        listInternet.add(Myinfo("Internet-Paket 2 GB","15000 so'm ","Ulanish *101*2","30 kunga","Ulanish uchun hisobda minimal mablag' 15200"))
        listInternet.add(Myinfo("Internet-Paket 5 GB","25000 so'm ","Ulanish *101*2","30 kunga","Ulanish uchun hisobda minimal mablag' 25200"))
        listInternet.add(Myinfo("Internet-Paket 10 GB","45000 so'm ","Ulanish *101*2","30 kunga","Ulanish uchun hisobda minimal mablag' 45200"))
        listInternet.add(Myinfo("Internet-Paket 20 GB","10000 so'm ","Ulanish *101*2","30 kunga","Ulanish uchun hisobda minimal mablag' 65200"))
        listInternet.add(Myinfo("Internet-Paket 30 GB","10000 so'm ","Ulanish *101*2","30 kunga","Ulanish uchun hisobda minimal mablag' 75200"))
        listInternet.add(Myinfo("Internet-Paket 50 GB","10000 so'm ","Ulanish *101*2","30 kunga","Ulanish uchun hisobda minimal mablag' 90200"))


    }
}