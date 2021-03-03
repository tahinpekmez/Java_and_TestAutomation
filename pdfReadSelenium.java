// imports which require
	import org.apache.pdfbox.pdmodel.PDDocument;
	import org.apache.pdfbox.text.PDFTextStripper;
	import java.io.InputStream;
	import java.io.BufferedInputStream;
	import java.io.IOException;
	import java.net.MalformedURLException;
	import java.net.URL;
// imports which require
	

    public void verifyContentInPDf(String orderID) {
        //specify the url of the pdf file
        String url ="url adress"+orderID;
        driver.get(url);
        try {
            String pdfContent = readPdfContent(url);
            Assert.assertTrue(pdfContent.contains("Onaylandı"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


	public int getPageCount(PDDocument doc){
        int pageCount = doc.getNumberOfPages();
        return pageCount;
    }


    public String pdfReading(String url) throws IOException{
        URL pdfUrl = new URL(url);
        InputStream in = pdfUrl.openStream();
        BufferedInputStream bf = new BufferedInputStream(in);
        PDDocument doc = PDDocument.load(bf);
        int numberOfPages = getPageCount(doc);
        String content = new PDFTextStripper().getText(doc);
        return content;

    }
