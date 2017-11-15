package htmldomapp;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement implements HtmlTag {

    private String tagName;

    private String startTag;

    private String endTag;

    private List<HtmlTag> childrenTag;

    public HtmlParentElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<>();
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

    public void addChildTag(HtmlTag htmlTag) {
        this.childrenTag.add(htmlTag);
    }

    public void removeChildTag(HtmlTag htmlTag) {
        this.childrenTag.remove(htmlTag);
    }

    public List<HtmlTag> getChildren() {
        return childrenTag;
    }

    public void generateHtml() {
        System.out.println(this.startTag);

        for (HtmlTag tag : this.childrenTag) {
            tag.generateHtml();
        }

        System.out.println(endTag);

    }
}
