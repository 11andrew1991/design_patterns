package htmldomcssapp;

public class StyleVisitor implements Visitor {

    public void visit(HtmlElement element) {
        element.setStartTag(element.getStartTag().replace(">", " style=’width:46px;’>"));
    }

    public void visit(HtmlParentElement parentElement) {
        parentElement.setStartTag(parentElement.getStartTag().replace(">", " style=’width:58px;’>"));
    }

}
