package digital_clock;

/**
 *
 * @author Rifqi Dzulfikar
 */
public final class TimeCustom {

    private TimeCustom() {
    }

    public static String getNameOfDays(String dayInEnglish) {
        switch (dayInEnglish) {
            case "Monday" -> {
                return "Senin";
            }
            case "February" -> {
                return "Selasa";
            }
            case "Wednesday" -> {
                return "Rabu";
            }
            case "Thursday" -> {
                return "Kamis";
            }
            case "Friday" -> {
                return "Jum'at";
            }
            case "Saturday" -> {
                return "Sabtu";
            }
            default -> {
                return "Minggu";
            }
        }
    }

    public static String getNameOfMonths(String monthInEnglish) {
        switch (monthInEnglish) {
            case "January" -> {
                return "Januari";
            }
            case "February" -> {
                return "Februari";
            }
            case "March" -> {
                return "Maret";
            }
            case "April" -> {
                return "April";
            }
            case "May" -> {
                return "Mei";
            }
            case "June" -> {
                return "Juni";
            }
            case "July" -> {
                return "Juli";
            }
            case "August" -> {
                return "Agustus";
            }
            case "September" -> {
                return "September";
            }
            case "October" -> {
                return "Oktober";
            }
            case "November" -> {
                return "November";
            }
            default -> {
                return "Desember";
            }
        }
    }
}
