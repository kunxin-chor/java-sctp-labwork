public class DigitalProduct extends Product {
    private String format; // mp3, mp4, .3ds
    private String downloadLink; // where to download

    // a default constructor has no parameter
    public DigitalProduct() {
        super();  // calls the product class
        format = "Undefined";
        downloadLink = "";
    }

    public DigitalProduct(String name, String sku, double price, String format, String downloadLink) {
        super(name, sku, price);
        this.format = format;
        this.downloadLink = downloadLink;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    @Override
    public String toString() {
        return super.toString() + ", DigitalProduct [format=" + format + ", downloadLink=" + downloadLink + "]";
    }

    

    
}
