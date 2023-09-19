public class Question24 {
    public static void main(String[] args) {
        String[] cardFaces = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] cardColors = {"Clubs", "Diamonds", "Hearts", "Spades"};

        String cardFace = cardFaces[(int) (Math.random() * cardFaces.length)];
        String cardColor = cardColors[(int) (Math.random() * cardColors.length)];

        System.out.println("The card you picked is " + cardFace + " of " + cardColor);
    }
}
