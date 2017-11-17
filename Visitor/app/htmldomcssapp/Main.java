package htmldomcssapp;

public class Main {

    public static void main(String[] args) {
        System.out.println("Before visitor.........");
        HtmlTag html = new HtmlParentElement("<html>");
        html.setStartTag("<html>");
        html.setEndTag("</html>");

        HtmlTag body = new HtmlParentElement("<body>");
        body.setStartTag("<body>");
        body.setEndTag("</body>");

        html.addChildTag(body);

        HtmlTag p = new HtmlElement("<P>");
        p.setStartTag("<P>");
        p.setEndTag("</P>");
        p.setTagBody("Testing html tag library");

        body.addChildTag(p);

        p = new HtmlElement("<P>");
        p.setStartTag("<P>");
        p.setEndTag("</P>");
        p.setTagBody("Paragraph 2");

        body.addChildTag(p);

        html.generateHtml();

        System.out.println("\nAfter visitor.......");
        Visitor cssClass = new CssClassVisitor();
        Visitor style = new StyleVisitor();

        html = new HtmlParentElement("<html>");
        html.setStartTag("<html>");
        html.setEndTag("</html>");
        html.accept(style);
        html.accept(cssClass);

        body = new HtmlParentElement("<body>");
        body.setStartTag("<body>");
        body.setEndTag("</body>");
        body.accept(style);
        body.accept(cssClass);

        html.addChildTag(body);

        p = new HtmlElement("<P>");
        p.setStartTag("<P>");
        p.setEndTag("</P>");
        p.setTagBody("Testing html tag library");
        p.accept(style);
        p.accept(cssClass);

        body.addChildTag(p);

        p = new HtmlElement("<P>");
        p.setStartTag("<P>");
        p.setEndTag("</P>");
        p.setTagBody("Paragraph 2");
        p.accept(style);
        p.accept(cssClass);

        body.addChildTag(p);

        html.generateHtml();
    }
}
