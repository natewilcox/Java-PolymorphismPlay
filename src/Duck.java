public class Duck extends Bird {

    public Duck() {
        super();

        this.talkBehavior = new QuackBehavior();
    }
}
