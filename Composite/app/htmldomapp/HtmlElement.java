package htmldomapp;

public class HtmlElement implements HtmlTag {

    private String tagName;

    private String startTag;

    private String endTag;

    private String tagBody;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
        this.tagBody = "";
        this.startTag = "";
        this.endTag = "";
    }

    public String getTagName() {
        return tagName;
    }

    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    public void generateHtml() {
        System.out.println(startTag + " " + tagBody + " " + endTag);
    }
}
