package example.technerd.com.carowner;

public class KyK {
    private String  sura;
    private String  jina_la_sura;
    private String pazia_nyuma;
    private String linki;

    public KyK(String sura, String jina_la_sura, String pazia_nyuma, String linki) {
        this.sura = sura;
        this.jina_la_sura = jina_la_sura;
        this.pazia_nyuma = pazia_nyuma;
        this.linki = linki;

    }

    public String getSura() {
        return sura;
    }

    public void setSura(String sura) {
        this.sura = sura;
    }

    public String getJina_la_sura() {
        return jina_la_sura;
    }

    public void setJina_la_sura(String jina_la_sura) {
        this.jina_la_sura = jina_la_sura;
    }

    public String getPazia_nyuma() {
        return pazia_nyuma;
    }

    public void setPazia_nyuma(String pazia_nyuma) {
        this.pazia_nyuma = pazia_nyuma;
    }

    public String getLinki() {
        return linki;
    }

    public void setLinki(String linki) {
        this.linki = linki;
    }
}
