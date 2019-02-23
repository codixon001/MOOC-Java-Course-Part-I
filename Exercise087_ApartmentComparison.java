public class Apartment {
 
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
 
    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment otherApartment) {
        int aptPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherAptPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        if (aptPrice <= otherAptPrice) {
            return otherAptPrice - aptPrice;
        } else {
            return aptPrice - otherAptPrice;
        }
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        int aptPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherAptPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        if (aptPrice <= otherAptPrice) {
            return false;
        } else {
            return true;
        }
    }
}

public class Main {
 
    public static void main(String[] args) {
        // write testcode here
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);
        
        System.out.println(studioManhattan.moreExpensiveThan(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn));
 
    }
}
