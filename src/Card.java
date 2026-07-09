public class Card {
    private final int number;
    private final String kind;

    public Card(int number, String kind){
        this.number = number;
        this.kind = kind;
    }

    public Card(){
        this(1,"SPADE");
    }

    @Override
    public String toString(){
        return kind + ":" + number;
    }
}
