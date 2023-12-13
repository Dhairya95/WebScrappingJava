import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        final String url =
                "https://www.wikidex.net/wiki/Lista_de_movimientos";

        try {
            Document document = Jsoup.connect(url).get();
//            System.out.println(document);
            Element content = document.getElementById("content");

            //     System.out.println(document.html());
            Elements links = document.select(".lista");//.sortable.mergetable.col2cen.col3cen.col4cen.jquery-tablesorter");
          //  System.out.println(links);
            for(Element link : links)
            {
   
       //         System.out.println(link.attr("a[href]"));
                System.out.println("\nlink : "+link.attr("td"));//  getElementById ("a[href]").text());
               System.out.println("text : "+link.text());
            }

        /*    for (Element row : document.select(
                    "table.lista.sortable.mergetable.col2cen.col3cen.col4cen.jquery-tablesorter.full tr")) {
                if (row.select("td:nth-of-type(1)").text().equals("")) {
                    continue;
                }
                else {
                    final String ticker =
                            row.select("td:nth-of-type(1)").text();
                    final String name =
                            row.select("td:nth-of-type(2)").text();
                    final String tempPrice =
                            row.select("td.right:nth-of-type(3)").text();
                    final String tempPrice1 =
                            tempPrice.replace(",", "");
//                    final double price = Double.parseDouble(tempPrice1);

                    System.out.println(ticker + " " + name + " " + tempPrice1);
                }
            }*/
        }
        catch (Exception ex) {
          //  ex.printStackTrace();
        }
    }
}