package example.technerd.com.carowner;

public class CoK
{
    private String  chapter;
    private String  chapterName;
    private String  background;
    private String Url;
    /*private String  content;*/


//    private String  ownerTel;

    public CoK(String chapter, String chapterName,  String background, String Url) {
        this.chapter = chapter;
        this.chapterName = chapterName;
        this.background = background;
        this.Url= Url;

    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }


}
