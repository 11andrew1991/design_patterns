package htmldomapp;

import java.util.List;

public interface HtmlTag {

    String getTagName();

    void setStartTag(String tag);

    void setEndTag(String tag);

    default void setTagBody(String tagBody) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    };

    default void addChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    };

    default void removeChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    default List<HtmlTag> getChildren() {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    void generateHtml();
}
