package Entity;



/**
 *
 * @author caspergrosslarsen
 */
public class QuotesEntity {
    
    private int id;
    private String quote;

    public QuotesEntity(int id, String quote) {
        this.id = id;
        this.quote = quote;
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
    
}
