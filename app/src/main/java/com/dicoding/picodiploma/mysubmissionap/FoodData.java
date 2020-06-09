package com.dicoding.picodiploma.mysubmissionap;

import java.util.ArrayList;

public class FoodData {
    private static String[] foodNames = {
            "Blendung",
            "Bubur Ayam Mang Hardi",
            "Es Lontrong",
            "Gulali",
            "Tahu Upil",
            "Kupat Glabed",
            "Lontong Cap Go Meh",
            "Rujak Teplak",
            "Tahu Hasan",
            "Nasi Ponggol"
    };

    private static String[] foodDetails = {
            "Blendung umumnya dijual di pasar tradisional. Terbuat dari jagung yang direbus hingga lunak lalu diberi sedikit bumbu dan parutan kelapa. Rasanya gurih dan sedikit ada rasa asinnya. Selain itu, manisnya jagung juga menambah kelezatan dari blendung ini. Biasanya jajanan tradisional di Tegal tersebut disajikan dengan menu lainnya.",
            "Bubur Ayam ini bisa jadi pilihan untuk sarapan atau makan siang di Tegal. Harganya murah meriah dengan porsi melimpah. Yang menggiurkan selain ayamnya adalah tambahan kerupuk gurih. Untuk menikmatinya, datang ke lokasi Bubur Mang Hardi di Jalan Merpati No. 70.",
            "Hanya dengan uang sebesar Rp4.000 kamu sudah bisa melegakan tenggorokan dengan es lontrong. Minuman legendaris di Tegal tersebut berisi kacang hijau dan cincau. Kemudian juga ditambah dengan gula merah dan santan. Ajak teman-temanmu untuk menikmati kuliner ini di Jalan Mayjend Sutoyo, Slawi. Tepatnya di dekat Telkom.",
            "Jika beruntung, kamu bisa menemukan salah satu penjual jajanan jadul yaitu gulali di Tegal. Tepatnya di lapangan kota ada seorang wanita yang sudah berumur. Nenek tersebut menawarkan gulali yang dibalut dengan tepung. Menikmati kuliner seperti ini mungkin akan mengingatkanmu pada kenangan masa kecil.",
            "Tahu Upil adalah sebutan unik untuk kuliner khas Tegal yang sekarang banyak dijadikan sebagai oleh-oleh. Bentuknya tidak begitu besar dan dibuat dengan mengkombinasikan tahu dengan aci. Paling nikmat jika menyantapnya dengan cabai rawit. Salah satu penjualnya adalah toko Tahu Murni Putra.",
            "Kupat Glabed bisa banget membuat perutmu kenyang. Lidah juga sudah pasti puas sekali. Kamu bisa mencoba potongan ketupat yang disajikan bersama tempa dan disiram dengan kuah glabed. Semakin lezat apabila disantap dengan sate ayam atau kerang. Kalau kamu belinya di sekitaran bundaran patung obor Slawi harganya sekitar Rp5.000 sedangkan satenya sekitar Rp2.500.",
            "Sesuai namanya, kuliner Tegal ini cocok banget disantap saat perayaan Imlek. Tampilannya memang seperti lontong sayur pada umumnya. Baru setelah masuk ke dalam mulut, kamu akan menemukan rasa istimewa. Di dalamnya ada isian berupa telur hingga suwiran ayam. Lalu di mana kamu bisa menemukan hidangan khas ini? Mari langsung menuju ke Warung Ibu Wing di Jalan Jenderal Sudirman, Slawi. Satu porsinya hanya dihargai sekitar Rp15.000.",
            "Rujak teplak adalah kuliner khas Tegal dengan cita rasa unik. Berbeda dari kuliner serupa pada umumnya, rujak teplak memiliki sambal khas yang dipadukan dengan berbagai macam sayuran. Sekarang ini tidak banyak tempat makan yang menjualnya. Bila ingin coba kamu bisa mencari penjual rujak teplak di sekitar Pasar Banjaran.",
            "Jika kamu berkunjung ke Tegal, cobalah mencicipi Tahu Hasan yang lumayan terkenal. Ada isian yang dibuat dengan bumbu spesial. Jadi semakin melengkapi rasa gurih dari tahu tersebut. Letaknya sendiri ada di dekat Toserba Basa atau sebelah selatan Koramil Tembok Luwung. Pemiliknya berjualan dengan gerobak warna kuning dari siang hingga sore.",
            "Nasi Ponggol ini biasa dijadikan menu sarapan pagi oleh masyarakat Tegal. Isiannya ada nasi dengan beberapa lauk seperti sambal goreng tempe. Kemudian dibungkus dengan daun pisang dalam porsi yang tidak begitu banyak.  Karena kepopulerannya, saat ini nasi ponggol tidak hanya dijual saat pagi, tapi juga malam hari"
    };

    private static  int[] foodImages = {
            R.drawable.blendung,
            R.drawable.bubur_ayam,
            R.drawable.es_lontrong,
            R.drawable.gulali,
            R.drawable.tahu_upil,
            R.drawable.kupat_glabed,
            R.drawable.lontong,
            R.drawable.rujak_teplak,
            R.drawable.tahu_hasan,
            R.drawable.nasi_ponggol
    };

    public static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++) {
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodImages[position]);
            list.add(food);
        }
        return list;
    }
}
