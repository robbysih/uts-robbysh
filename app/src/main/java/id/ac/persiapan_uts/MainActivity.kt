package id.ac.persiapan_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.ahp,"ahp","agribisnis hasil pengolahan","agribisnis hasil pengolahan pertanian" +
                "adalah kompetensi keahlian yang meliputi kemampuan mengenal komoditas hasil pertanian, menerapkan dasar pengolahan dan pengawetan bahan hasil pertanian hingga mengolah bahan hasil pertanian menjadi produk olahan. " +
                "SMK N 2 SLAWI"))

        data?.add(DataModel(R.drawable.aptn,"aptn","agribisnis pertanian tanaman pangan", "aptn adalah " +
                "merupakan bidang kejuruan sekolah menengah kejuruan yang mempelajari wacana agribisnis dalam kaitannya dengan tanaman pangan dan hortikultura.  " +
                "Objek agribisnis dapat berupa tumbuhan , hewan , ataupun organisme lainnya."))

        data?.add(DataModel(R.drawable.mp,"mp","mekanisasi pertanian", "mp adalah " +
                "Teknik pertanian atau keteknikan pertanian adalah penerapan dasar-dasar teknik dalam bidang pertanian mencakup bidang teknik mesin budidaya pertanian, teknik sumber daya alam pertanian, " +
                "Penggunaan alat dan mesin juga dimaksudkan untuk meningkat- kan efisiensi, efektivitas, produktivitas, kualitas hasil, dan mengurangi beban kerja petani."))

        data?.add(DataModel(R.drawable.ternak,"ternak","perternakan", "perternakan adalah " +
                "Peternakan adalah kegiatan mengembangbiakkan dan pemeliharaan hewan ternak untuk mendapatkan manfaat dan hasil dari kegiatan tersebut. " +
                "hewan yang diternakan pada jurusan ini ayam, hasil yang diperternakan telur."))

        data?.add(DataModel(R.drawable.tm,"tm","teknik mesin", "teknik mesin adalah " +
                "adalah ilmu teknik mengenai aplikasi dari prinsip fisika untuk analisis, desain, manufaktur dan pemeliharaan sebuah sistem mekanik." +
                "Ilmu ini membutuhkan pengertian mendalam atas konsep utama dari cabang ilmu mekanika, kinematika, teknik material, termodinamika dan energi."))

        data?.add(DataModel(R.drawable.to,"to","teknik otomotif", "teknik otomotif adalah" +
                "salah satu cabang ilmu teknik mesin yang mempelajari tentang bagaimana merancang, membuat dan mengembangkan alat-alat transportasi darat yang menggunakan mesin, " +
                "terutama sepeda motor, mobil, bis dan truk."))


        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.jurusan)
                intent.putExtra("harga", item?.nama_jurusan)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }
        })
    }
}