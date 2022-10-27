import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Quote> quotes = new ArrayList<>();
        quotes = quotesListTransformator();
        QuoteService quoteService = new QuoteService(quotes);

        quoteService.setFavourite(1);
        quoteService.setFavourite(3);
        quoteService.setFavourite(4);
        quoteService.setFavourite(7);

        System.out.println(quoteService.getQuotesForAuthor("Napoleon Hill"));

        List<String> justQuotes = quoteService.getAllQuotes();

        List<String> authors = quoteService.getAuthors();

        quoteService.printOutTheAuthorsInDifferentLines();

        quoteService.printOutAllQuotesInDifferentLine();

        quoteService.printOutTheFavoritesInDifferentLines();

        System.out.println(quoteService.getRandomQuote());

    }

    public static List<Quote> quotesListTransformator() throws IOException {
        List<Quote> result = new ArrayList<>();
        int i = 0;
        BufferedReader reader = new BufferedReader(new FileReader("quotes.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            result.add(quoteFromLine(line, i));
            i++;
        }
        return result;
    }

    private static Quote quoteFromLine(String line, int i) {
        String[] tokens = line.split(Pattern.quote("~"));
        return new Quote(i, tokens[0], tokens[1]);
    }

}
