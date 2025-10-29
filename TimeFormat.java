public class TimeFormat {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        String amPm;
        int displayHours;

        if (hours == 0) {
            displayHours = 0;
            amPm = "AM";
        } else if (hours < 12) {
            displayHours = hours;
            amPm = "AM";
        } else if (hours == 12) {
            displayHours = 12;
            amPm = "PM";
        } else {
            displayHours = hours - 12;
            amPm = "PM";
        }
        
        String minutesString;
        if (minutes < 10) {
             minutesString = "0" + minutes;
        } else {
             minutesString = "" + minutes;
        }

        System.out.println(displayHours + ":" + minutesString + " " + amPm);
    }
}