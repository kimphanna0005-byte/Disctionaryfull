
package distionary;
public class Data {
    private String en_text;
    private String kh_text;

    // Constructor
    public Data(String en_text, String kh_text) {
        this.en_text = en_text;
        this.kh_text = kh_text;
    }

    public String getEn_text() {
        return en_text;
    }

    public String getKh_text() {
        return kh_text;
    }
}
