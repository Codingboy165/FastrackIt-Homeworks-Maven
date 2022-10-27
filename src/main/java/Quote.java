import java.util.Objects;

public class Quote {
    private final int id;
    private final String author;
    private final String quote;
    private boolean favorite;

    public Quote(int id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
    }

    public int id() {
        return id;
    }

    public String author() {
        return author;
    }

    public String quote() {
        return quote;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Quote) obj;
        return this.id == that.id &&
                Objects.equals(this.author, that.author) &&
                Objects.equals(this.quote, that.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, quote);
    }

    @Override
    public String toString() {
        return "Quote[" +
                "Id=" + id + ", " +
                "Author=" + author + ", " +
                "Quote=" + quote + ']';
    }
}
