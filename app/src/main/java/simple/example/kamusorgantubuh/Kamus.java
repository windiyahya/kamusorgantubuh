package simple.example.kamusorgantubuh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Kamus extends AppCompatActivity {
    String jenisOrgan;
    TextView txJudul;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_kamus);
        Intent intent = getIntent();
        jenisOrgan = intent.getStringExtra(MainActivity.KEY);
        inisialisai ();
        if(jenisOrgan.equalsIgnoreCase ("Darah")){
            tampil ("cairan terdiri atas plasma, sel-sel merah dan putih yang mengalir dalam pembuluh darah manusia atau binatang\n" +
                    "contoh: 'dahinya yang terluka berlumuran darah \n Darah manusia berfungsi untuk mengangkut oksigen yang diperlukan oleh sel-sel di seluruh tubuh. Darah juga menyuplai jaringan tubuh dengan nutrisi, mengangkut zat-zat sisa metabolisme, dan mengandung berbagai bahan penyusun sistem imun yang bertujuan mempertahankan tubuh dari berbagai penyakit. Hormon-hormon dari sistem endokrin juga diedarkan melalui darah.");
        }else if(jenisOrgan.equalsIgnoreCase ("Esofagus")){
            tampil ("Esofagus atau kerongkongan adalah bagian saluran cerna yang tersusun atas otot dan dilalui makanan yang berasal dari mulut menuju lambung. Esofagus dilalui makanan yang terdorong oleh proses peristaltik.\n" +
                    "\n" +
                    "Esofagus bersama faring menghubungkan esofagus dengan rongga mulut – pada ruas ke-6 tulang belakang. Esofagus dibagi menjadi tiga lapisan bagian superior (sebagian besar adalah otot rangka), bagian tengah (campuran otot rangka dan otot polos), serta bagian inferior (terutama terdiri dari otot polos). Pembuluh darah pada esofagus bisa mengalami pelebaran yang di sebut varises esofagus pada beberapa penyakit kronis seperti pada Sirosis Hati.\n" +
                    "\n");
        }else if(jenisOrgan.equalsIgnoreCase ("Jantung")){
            tampil ("Jantung adalah organ yang berperan dalam sistem peredaran darah, terletak di rongga dada agak sebelah kiri. Jantung manusia terbagi menjadi empat ruas: atrium atas kanan dan kiri; dan ventrikel bawah kanan dan kiri. Pada umumnya atrium dan ventrikel kanan disebut jantung kanan, dan sisanya disebut jantung kiri. Ikan hanya memiliki dua ruas, sebuah atrium dan sebuah ventrikel, sementara reptil memiliki tiga ruas. Pada jantung yang sehat darah mengalir satu arah melalui pembuluh darah. Terdapat sebuah kantung pembungkus myang melindungi jantung, perikardium, yang juga mengandung sedikit cairan. Dinding jantung tersusun atas tiga lapisan yang meliput epikardium, miokardium, dan endokardium.");
        }else if(jenisOrgan.equalsIgnoreCase ("kelenjar getah bening")){
            tampil ("Kelenjar getah bening merupakan organ tubuh yang menjalankan fungsi sistem pertahanan tubuh manusia. Manusia memiliki kurang lebih sekitar 600 kelenjar getah bening, namun hanya di daerah submandibular (bagian bawah rahang bawah, ketiak atau lipat paha yang teraba normal pada orang sehat. Kelenjar getah bening terbungkus kapsul fibrosa yang berisi kumpulan sel-sel pembentuk pertahanan tubuh dan merupakan tempat penyaringan antigen (protein asing) dari pembuluh-pembuluh getah bening yang melewatinya.\n" +
                    "\n" +
                    "Pembuluh-pembuluh limfe akan mengalir ke kelenjar getah bening sehingga dari lokasi kelenjar getah bening akan diketahui aliran pembuluh limfa yang melewatinya. Dengan mengetahui lokasi pembesaran kelenjar getah bening maka kita dapat mengerahkan kepada lokasi kemungkinan terjadinya infeksi atau penyebab pembesaran kelenjar getah bening. Oleh karena dilewati oleh aliran pembuluh getah bening yang dapat membawa antigen (mikroba, zat asing) dan memiliki sel pertahanan tubuh maka apabila ada antigen yang menginfeksi maka kelenjar getah bening dapat menghasilkan sel-sel pertahanan tubuh yang lebih banyak untuk mengatasi antigen tersebut sehingga kelenjar getah bening membesar.");
        }else if(jenisOrgan.equalsIgnoreCase ("Mata")){
            tampil ("Mata merupakan organ sensorik utama pendeteksi cahaya yang mengirimkan informasi dalam bentuk visual ke otak dengan kemampuan untuk membedakan antara warna dan kedalaman. Oleh sebab itu, sekitar 75% informasi yang Anda terima berasal dari mata. \n" +
                    "\n" +
                    "Meski berukuran kecil, mata adalah organ yang sangat kompleks. Umumnya, mata memiliki lebar sekitar 1 inci, kedalaman 1 inci, dan tinggi 0,9 inci. Indra penglihatan ini memiliki kemampuan sudut pandang 200 derajat dan dapat melihat 10 juta warna serta nuansa. \n" +
                    "\n");
        }else if(jenisOrgan.equalsIgnoreCase ("Otak")){
            tampil ("Otak manusia bertanggung jawab terhadap pengaturan seluruh badan dan pemikiran manusia. Oleh karena itu terdapat kaitan erat antara otak dan pemikiran. Otak dan sel saraf di dalamnya dipercayai dapat memengaruhi kognisi manusia. Pengetahuan mengenai otak memengaruhi perkembangan psikologi kognitif. Otak juga bertanggung jawab atas fungsi seperti pengenalan, emosi. ingatan, pembelajaran motorik dan segala bentuk pembelajaran lainnya.\n" +
                    "\n" +
                    "Otak terbentuk dari dua jenis sel: glia dan neuron. Glia berfungsi untuk menunjang dan melindungi neuron, sedangkan neuron membawa informasi dalam bentuk pulsa listrik yang dikenal sebagai potensi aksi. Mereka berkomunikasi dengan neuron yang lain dan keseluruh tubuh dengan mengirimkan berbagai macam bahan kimia yang disebut neurotransmiter. Neurotransmiter ini dikirimkan pada celah yang dikenal sebagai sinapsis. Avertebrata seperti serangga mungkin mempunyai jutaan neuron pada otaknya, vertebrata besar bisa mempunyai hingga seratus miliar neuron.\n" +
                    "\n" +
                    "Neuron otak mengandung dua jenis asam lemak PUFA (bahasa Inggris: polyunsaturated fatty acids), yaitu asam arakidonat (AA) dan asam dokosaheksaenoat (DHA) yang terletak pada posisi sn2 dari molekul fosfogliserida dalam membran sel neuron, PUFA dapat terlepas dari fosfogliserida oleh stimulasi fosfolipase PLA-2. Molekul AA yang terlepas akan diproses oleh enzim siklo oksigenase menjadi prostaglandin dan tromboksana, atau diproses oleh enzim 5-lipo oksigenase menjadi lipoksin. Baik AA maupun DHA dapat diproses oleh enzim lipo oksigenase guna membentuk senyawa turunan hidroksi dan leukotriena.\n" +
                    "\n");
        }else if(jenisOrgan.equalsIgnoreCase ("Payudara")){
            tampil ("Payudara adalah bagian tubuh atas yang terdiri dari lemak dan jaringan ikat, selain itu terdapat lobus, lobulus, saluran ASI, pembuluh darah, dan kelenjar getah bening di dalamnya. Lobus adalah bagian dari payudara yang terbagi lagi menjadi beberapa lobulus. Kelenjar-kelenjar kecil atau lobulus inilah yang akan menghasilkan ASI.\n" +
                    "\n" +
                    "Jaringan payudara terbentuk sejak awal kehidupan janin, yaitu pada minggu ke-4. Jaringan tersebut berkembang bersama dengan dua saluran susu yang berawal dari ketiak.\n" +
                    "\n" +
                    "Payudara tidak memiliki jaringan otot. Bentuk dan ukuran payudara ditentukan oleh seberapa banyak jaringan lemak yang terdapat pada payudara. Jaringan ikat dan ligamen pada payudara berperan untuk mempertahankan struktur anatomi payudara. Saraf yang terdapat di dalamnya berfungsi memberikan sensasi pada payudara.");
        }
    }

    private void tampil(String text2){
        txJudul.setText(text2);
    }

    private void inisialisai() {
        txJudul = findViewById(R.id.text2);
    }
}