public class Employee {
    private String empName;
    public void handleCustomer(Customer cust, Vehicle veh,boolean finance){
        if (finance){
            double loan = veh.getVehPrice()- cust.getCashOnHand();
            runCreditHistory(cust,loan);
        }
        else if (veh.getVehPrice()<=cust.getCashOnHand()) {
            processTransaction(cust,veh);
        }
        else {
            System.out.println("Customer needs more money to purchase vehicle: " + veh);
        }
    }
    public void runCreditHistory(Customer cust,double loan){
        System.out.println("Ran your credit history.");
        System.out.println("Loan Approved!!!.");
    }
    public void processTransaction(Customer cust,Vehicle veh){
        System.out.println("Purchase successful for:\n" + veh + "\nfor price: "+ veh.getVehPrice()+"\nfor: \n" + cust);
    }
}
