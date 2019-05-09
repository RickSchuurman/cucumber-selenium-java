package nl.joyoftesting.cucumber.pageObjects;

public class IsItFriday {
    public String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }

}
