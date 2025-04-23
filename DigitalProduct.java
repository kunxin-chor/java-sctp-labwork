import java.util.Scanner;

public class DigitalProduct extends Product {
    private String format; // mp3, mp4, .3ds
    private String downloadLink; // where to download

    // a default constructor has no parameter
    public DigitalProduct() {
        super(); // calls the product class (to setup the parent class)
        format = "Undefined";
        downloadLink = "";
    }

    // The overloaded constructor must have the information
    // to construct the parent class and the child class
    public DigitalProduct(String name,
            String sku,
            double price,
            String format,
            String downloadLink) {
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

    public void display() {
        super.display();
        System.out.println("File format: " + getFormat());
        System.out.println("Download Link " + getDownloadLink());   
    }

    @Override
    public void editDetails(Scanner sc) {
        super.editDetails(sc);
        System.out.print("Enter new file format (Or press ENTER to skip): ");
        String newFileFormat = sc.nextLine();
        if (! newFileFormat.equals("")) {
            setFormat(newFileFormat);
        }

        System.out.print("Enter new download link (or press ENTER to skip): ");
        String newDownloadLink = sc.nextLine();
        if (! newDownloadLink.equals("")) {
            setDownloadLink(newDownloadLink);
        }
    }

}
