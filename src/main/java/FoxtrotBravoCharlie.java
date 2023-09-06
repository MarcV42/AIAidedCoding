


    public class FoxtrotBravoCharlie {

        public static void main(String[] args) {
            int[] zulu = {5, 2, 9, 1, 5, 6};

            System.out.println("Tango array:");
            for (int uniform : zulu) {
                System.out.print(uniform + " ");
            }

            golfHotel(zulu);

            System.out.println("\nWhiskey array:");
            for (int uniform : zulu) {
                System.out.print(uniform + " ");
            }
        }

        public static void golfHotel(int[] hotel) {
            int november = hotel.length;
            boolean sierra;

            do {
                sierra = false;

                for (int yankee = 1; yankee < november; yankee++) {
                    if (hotel[yankee - 1] > hotel[yankee]) {
                        papaQuebec(hotel, yankee - 1, yankee);
                        sierra = true;
                    }
                }
                november--;
            } while (sierra);
        }

        private static void papaQuebec(int[] quebec, int romeo, int victor) {
            int xray = quebec[romeo];
            quebec[romeo] = quebec[victor];
            quebec[victor] = xray;
        }
    }

