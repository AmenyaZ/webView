package example.technerd.com.carowner;

import java.util.ArrayList;

public class SwahiliAppClass extends  ApplicationClass {

    public static ArrayList<KyK> kyKS;

    @Override
    public void onCreate() {
        super.onCreate();

        kyKS = new ArrayList<>();
        kyKS.add(new KyK("UTANGULIZI ","","","file:///android_asset/utangulizi.html"));
        kyKS.add(new KyK("SURA YA KWANZA","","chapter01","file:///android_asset/sura1.html"));
        kyKS.add(new KyK("SURA YA PILI","","chapter02","file:///android_asset/sura2.html"));
        kyKS.add(new KyK("SURA YA TATU","","chapter03","file:///android_asset/sura3.html"));
        kyKS.add(new KyK("SURA YA NNE","","chapter04","file:///android_asset/sura4.html"));
        kyKS.add(new KyK("SURA YA TANO","","chapter05","file:///android_asset/sura5.html"));
        kyKS.add(new KyK("SURA YA SITA","","chapter06",""));
        kyKS.add(new KyK("SURA YA SABA","","chapter07",""));
        kyKS.add(new KyK("SURA YA NANE","","chapter08",""));
        kyKS.add(new KyK("SURA YA TISA","","chapter09",""));
        kyKS.add(new KyK("SURA YA KUMI","","chapter10",""));
        kyKS.add(new KyK("SURA YA KUMI NA MOJA","chapter11","",""));
        kyKS.add(new KyK("SURA YA KUMI NA MBILI","chapter12","",""));
        kyKS.add(new KyK("SURA YA KUMI NA TATU","chapter13","",""));
        kyKS.add(new KyK("SURA YA KUMI NA NNE","chapter14","",""));
        kyKS.add(new KyK("SURA YA KUMI NA TANO","chapter15","",""));
        kyKS.add(new KyK("SURA YA KUMI NA SITA","chapter16","",""));
        kyKS.add(new KyK("SURA YA KUMI NA SABA","chapter17","",""));
        kyKS.add(new KyK("SURA YA KUMI NA NANE","chapter18","",""));
        kyKS.add(new KyK("SURA YA ","","",""));
        kyKS.add(new KyK("SURA YA ","","",""));
        kyKS.add(new KyK("SURA YA ","","",""));

    }
}
