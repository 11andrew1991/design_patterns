package htmldomapp;

public class Main {

    public static void main(String[] args) {
        HtmlTag html = new HtmlParentElement("<html>");
        html.setStartTag("<html>");
        html.setEndTag("</html>");

        HtmlTag body = new HtmlParentElement("<body>");
        body.setStartTag("<body>");
        body.setEndTag("</body>");

        html.addChildTag(body);

        HtmlTag p = new HtmlElement("<p>");
        p.setStartTag("<p>");
        p.setEndTag("</p>");
        p.setTagBody("Testing html P tag.");
        body.addChildTag(p);

        p = new HtmlElement("<p>");
        p.setStartTag("<p>");
        p.setEndTag("</p>");
        p.setTagBody("Paragraph 2");
        body.addChildTag(p);

        html.generateHtml();
    }
}
