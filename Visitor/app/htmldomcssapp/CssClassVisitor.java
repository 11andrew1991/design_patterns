package htmldomcssapp;

public class CssClassVisitor implements Visitor {

    public void visit(HtmlElement element) {
        element.setStartTag(element.getStartTag().replace(">", " class=’visitor’>"));
    }

    public void visit(HtmlParentElement parentElement) {
        parentElement.setStartTag(parentElement.getStartTag().replace(">", " class=’visitor’>"));
    }
}
