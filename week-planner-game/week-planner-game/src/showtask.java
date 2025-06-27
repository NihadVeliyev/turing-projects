private static String showtask(String day, String[][] weekDays) {
    switch (day.toLowerCase()) {
        case "monday":
            return "Your task for Monday: " + weekDays[0][1];
        case "tuesday":
            return "Your task for Tuesday: " + weekDays[1][1];
        case "wednesday":
            return "Your task for Wednesday: " + weekDays[2][1];
        case "thursday":
            return "Your task for Thursday: " + weekDays[3][1];
        case "friday":
            return "Your task for Friday: " + weekDays[4][1];
        case "saturday":
            return "Your task for Saturday: " + weekDays[5][1];
        case "sunday":
            return "Your task for Sunday: " + weekDays[6][1];
        default:
            return "Sorry, I don't understand you, please try again.";
    }
}