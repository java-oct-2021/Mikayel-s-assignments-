import java.util.Date;


public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }


    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. How are you?", dayPeriod, name);
    }
    
    public String dateAnnouncement() { 
        return String.format("Today's date is %s", new Date());
    }


    public String respondBeforeAlexis(String phrase) {

        if(phrase.indexOf("Alexis") > -1) {
            return "Alexis";
        }

        if (phrase.indexOf("Alfred") > -1) {
            return "Alfred";
        }

        return "Either are not correct";
    }

}