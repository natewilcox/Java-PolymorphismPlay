public class Animal {
    
    ITalkBehavior talkBehavior;

    public void setTalkBehavior(ITalkBehavior talkBehavior) {
        this.talkBehavior = talkBehavior;
    }

    public void talk() {

        if(talkBehavior == null) {
            System.out.println("I don't know how to talk!");
            return;
        }
        
        talkBehavior.talk();
    }
}
