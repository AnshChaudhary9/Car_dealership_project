package CarDealership;

public class Vehicle {
    private String vehBrand;
    private String vehModel;
    private int vehPrice;


    public Vehicle(String vehBrand, String vehModel, int vehPrice) {
        this.vehBrand = vehBrand;
        this.vehModel = vehModel;
        this.vehPrice = vehPrice;
    }

    public String getVehBrand() {
        return vehBrand;
    }

    public void setVehBrand(String vehBrand) {
        this.vehBrand = vehBrand;
    }



    public String getVehModel() {
        return vehModel;
    }

    public void setVehModel(String vehModel) {
        this.vehModel = vehModel;
    }

    public void setVehPrice(int vehPrice) {
        this.vehPrice = vehPrice;
    }

    public int getVehPrice() {
        return vehPrice;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Brand='" + vehBrand + '\'' +
                ", Model='" + vehModel + '\'' +
                ", Price=" + vehPrice +
                '}';
    }
}
