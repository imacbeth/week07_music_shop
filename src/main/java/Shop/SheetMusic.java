package Shop;

public class SheetMusic extends StockItem {

    private String genre;

    public SheetMusic(double buyPrice, double sellPrice, String genre) {
        super(buyPrice, sellPrice);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
