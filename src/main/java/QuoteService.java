import lombok.RequiredArgsConstructor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

@RequiredArgsConstructor
public class QuoteService {
    private final List<Quote> quotes;

    //Get all quotes to a list
    public List<String> getAllQuotes() throws IOException {
        List<String> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("quotes.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            result.add(quoteFromLine(line));
        }
        return result;
    }

    private static String quoteFromLine(String line) {
        String[] tokens = line.split(Pattern.quote("~"));
        return tokens[1];
    }

    //Print out the list

    public void printOutAllQuotesInDifferentLine() throws IOException {
        List<String> justQuotes = getAllQuotes();
        for (String justQuote : justQuotes) {
            System.out.println(justQuote);
        }
    }

    //Get all quotes for one specified author

    public List<Quote> getQuotesForAuthor(String author) {
        List<Quote> result = new ArrayList<>();
        for (Quote quote : quotes) {
            if (quote.author().equals(author)) {
                result.add(quote);
            }
        }
        return result;
    }

    //Get all authors from the list bust just once everyone
    public List<String> getAuthors() {
        Set<String> result = new TreeSet<>();
        for (Quote quote : quotes) {
            result.add(quote.author());
        }
        return new ArrayList<>(result);
    }

    //Print out the authors
    public void printOutTheAuthorsInDifferentLines() {
        List<String> authors = getAuthors();
        for (String author : authors) {
            System.out.println(author);
        }
    }

    //Set Favourite a quotes

    public void setFavourite(int id) {
        for (Quote quote : quotes) {
            if (quote.id() == id) {
                quote.setFavorite(true);
                return;
            }
        }
    }

    //Get all Favourites to a list

    public List<Quote> getFavourites() {
        List<Quote> result = new ArrayList<>();
        for (Quote quote : quotes) {
            if (quote.isFavorite()) {
                result.add(quote);
            }
        }
        return result;
    }

    //Print them out
    public void printOutTheFavoritesInDifferentLines() {
        List<Quote> favorites = getFavourites();
        for (Quote favorite : favorites) {
            System.out.println("Favorite-" + favorite);
        }
    }

    public String getRandomQuote() {
        Random random = new Random();
        int aRandomNumber = random.nextInt(5421);
        for (Quote quote : quotes) {
            if (quote.id() == aRandomNumber) {
                return "-" + quote.quote() + "- by " + quote.author();
            }
        }
        return "This id doesn't exist";
    }
}
