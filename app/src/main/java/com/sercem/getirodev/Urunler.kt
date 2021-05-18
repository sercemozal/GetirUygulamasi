package com.sercem.getirodev

import java.io.Serializable

data class Urunler(var urun_id:Int,
                   var urun_adi:String,
                   var urun_resim_adi:String,
                   var urun_bilgi:String):Serializable {
}