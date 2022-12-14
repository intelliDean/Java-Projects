package chapter5.exercise;

public class TwelveDaysOdChristmas {
    public static void daysOfChristmas(int day) {
        if (day >= 1 && day <= 12) {
            System.out.print("\nšš· š½š±š® "+ day);

            switch (day) { // enhance switch case
                case 1 ->
                        System.out.print("š¼š½");
                case 2 ->
                        System.out.print("š·š­");
                case 3 ->
                        System.out.print("š»š­");
                default ->
                        System.out.print("š½š±");
            }
            System.out.println(" š­šŖš šøšÆ šš±š»š²š¼š½š¶šŖš¼,\nš¶š š½š»š¾š® šµšøšæš® š°šŖšæš® š½šø š¶š®");

            switch (day) { //normal switch case
                case 12:
                    System.out.println("š£šš®šµšæš® š­š»š¾š¶š¶š®š»š¼ š­š»š¾š¶š¶š²š·š°, ");
                case 11:
                    System.out.println("ššµš®šæš®š· š¹š²š¹š®š»š¼ š¹š²š¹š²š·š°,");
                case 10:
                    System.out.println("š£š®š· šµšøš»š­š¼ šŖ šµš®šŖš¹š²š·š°,");
                case 9:
                    System.out.println("šš²š·š® šµšŖš­š²š®š¼ š­šŖš·š¬š²š·š°,");
                case 8:
                    System.out.println("šš²š°š±š½ š¶šŖš²š­š¼ šŖ š¶š²šµš“š²š·š°,");
                case 7:
                    System.out.println("š¢š®šæš®š· š¼ššŖš·š¼ šŖ š¼šš²š¶š¶š²š·š°,");
                case 6:
                    System.out.println("š¢š²š š°š®š®š¼š® šŖ šµšŖšš²š·š°,");
                case 5:
                    System.out.println("šš²šæš® š°šøšµš­š®š· š»š²š·š°š¼,");
                case 4:
                    System.out.println("ššøš¾š» š¬šŖšµšµš²š·š° š«š²š»š­š¼,");
                case 3:
                    System.out.println("š£š±š»š®š® šš»š®š·š¬š± š±š®š·š¼,");
                case 2:
                    System.out.println("š£ššø š½š¾š»š½šµš® š­šøšæš®š¼, šŖš·š­");
                default:
                    System.out.println("šŖ š¹šŖš»š½š»š²š­š°š® š²š· šŖ š¹š®šŖš» š½š»š®š®.");
            }
                System.out.println();
        } else {
            System.out.printf("%nOde, there's no %d day of Christmas%nChoose between 1 & 12%n%n", day);
        }
    }
}

