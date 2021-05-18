package com.sercem.getirodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.sercem.getirodev.databinding.FragmentUrunlerAnasayfaBinding

class UrunlerAnasayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentUrunlerAnasayfaBinding
    private lateinit var urunlerListesi:ArrayList<Urunler>
    private lateinit var adapter:UrunlerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_urunler_anasayfa, container, false)

        tasarim.rvurun.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)

        val u1 = Urunler(1, "Yeni Ürünler", "yeni", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u2 = Urunler(2, "İndirimler", "indirim", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u3 = Urunler(3, "Damacana", "damacana", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u4 = Urunler(4, "Su & İçecek", "suicecek", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u5 = Urunler(5, "Meyve Sebze", "meyvesebze", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u6 = Urunler(6, "Fırından", "firindan", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u7 = Urunler(7, "Temel Gıda", "temelgida", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u8 = Urunler(8, "Atıştırmalık", "atistirmalik", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u9 = Urunler(9, "Dondurma", "dondurma", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u10 = Urunler(10, "Yiyecek", "yiyecek", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u11 = Urunler(11, "Süt & Kahvaltı", "sutkahvalti", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u12 = Urunler(12, "Fit & Form", "fitform", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u13 = Urunler(13, "Kişisel Bakım", "kisiselbakim", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u14 = Urunler(14, "Ev Bakımı", "evbakim", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u15 = Urunler(15, "Ev & Yaşam", "evyasam", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u16 = Urunler(16, "Teknoloji", "teknoloji", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u17 = Urunler(17, "Evcil Hayvan", "evcilhayvan", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u18 = Urunler(18, "Bebek", "bebek", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u19 = Urunler(19, "Cinsel Sağlık", "cinselsaglik", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")
        val u20 = Urunler(20, "Giyim", "giyim", "Yepyeni ürünleri sayfamızda bulabilirsiniz.")

        urunlerListesi = ArrayList()

        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)
        urunlerListesi.add(u5)
        urunlerListesi.add(u6)
        urunlerListesi.add(u7)
        urunlerListesi.add(u8)
        urunlerListesi.add(u9)
        urunlerListesi.add(u10)
        urunlerListesi.add(u11)
        urunlerListesi.add(u12)
        urunlerListesi.add(u13)
        urunlerListesi.add(u14)
        urunlerListesi.add(u15)
        urunlerListesi.add(u16)
        urunlerListesi.add(u17)
        urunlerListesi.add(u18)
        urunlerListesi.add(u19)
        urunlerListesi.add(u20)

        adapter = UrunlerAdapter(requireContext(), urunlerListesi)
        tasarim.rvurun.adapter=adapter

        return tasarim.root
    }

}