public class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    /**
     * Checks whether there is a parking space of carType available for a car. A car can only park in a parking space of its carType.
     * @param carType - can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively
     * @return boolean - whether parking space of carType is available
     */
    public boolean addCar(int carType) {
        if ((carType == 1 && this.big == 0) || (carType == 2 && this.medium == 0) || (carType == 3 && this.small == 0)) {
            return false;
        }

        switch (carType) {
            case 1:
                this.big--;
                break;
            case 2:
                this.medium--;
                break;
            case 3:
                this.small--;
                break;
        }
        return true;
    }
}
