package CarDealership;

public class Customer {

    private String name;
    private String address;
    private float cashOnHand;

    public Customer(String name, String address, float cashOnHand) {
        this.name = name;
        this.address = address;
        this.cashOnHand = cashOnHand;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getAddress() {
        return address;
    }

//    public void setAddress(String address) {
//        this.address = address;
//    }

    public float getCashOnHand() {
        cashOnHand += 500;
        return cashOnHand;
    }

//    public void setCashOnHand(float cashOnHand) {
//        cashOnHand += 500;
//        this.cashOnHand = cashOnHand;
//    }


    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + name + '\'' +
                ", Address='" + address + '\'' +
                '}';
    }

    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance){
        emp.handleCustomer(this,vehicle,finance);
    }
}
