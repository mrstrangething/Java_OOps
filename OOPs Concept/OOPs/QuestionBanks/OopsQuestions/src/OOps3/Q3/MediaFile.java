package OOps3.Q3;
 
public abstract class MediaFile {
    protected String title;
    protected String fileName;

    public MediaFile(String title, String fileName) {
        this.title = title;
        this.fileName = fileName;
    }

    public abstract void play();

    public String getDetails() {
        return "Title: " + title + ", File: " + fileName;
    }
}
