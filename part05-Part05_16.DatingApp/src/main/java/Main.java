
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println(date);
        date.advance();
        date.advance();
        date.advance();
        date.advance();
        date.advance();
        System.out.println(date);
        date.advance(15);
        System.out.println(date);


    System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
    //    System.out.println("Try " + date.afterNumberOfDays(790));
    }
}
