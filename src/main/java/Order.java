
package com.mycompany.shoppingcenter;
import java.time.LocalDate;  
import java.util.ArrayList;
/**
 *
 * @author Doaa Said
 */
public  class Order {
 private String ID;
 private Customer customer;
private LocalDate shipping_date;
private ArrayList<Products>productslist=new ArrayList<Products>();
private double totalCostbeforeoffer=0;
private double totalCostafteroffer;
String payment;
private boolean isShipped;


    public Order(String ID,Customer customer, ArrayList<Products>productslist) {
        this.ID=ID;
        this.customer = customer;
       
        this.productslist=productslist;
        
calculate_costbeforeoffer(); 
    calculate_costafteroffer();
    }

    public String getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getShipping_date() {
         LocalDate currentDate = LocalDate.now();
          shipping_date = currentDate.plusWeeks(1);
        return shipping_date;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

  private void calculate_costbeforeoffer(){
      for(int i=0;i<productslist.size();i++){
         totalCostbeforeoffer+=productslist.get(i).getPriceAfterDiscount();
      
      }
}
  
 private void calculate_costafteroffer(Admin A){
     ArrayList<Double>offerpercentages=A.getPercentages();
     
   int index(totalCostbeforeoffer-Admin.getBase())/Admin.getStep();
   
     totalCostafteroffer=totalCostbeforeoffer-(offerpercentages.get(index)*totalCostbeforeoffer);
      }     

    public double getTotalCostbeforeoffer() {
        return totalCostbeforeoffer;
    }

    public double getTotalCostafteroffer() {
        return totalCostafteroffer;
    }
  
    public ArrayList<Products> getProductslist() {
        return productslist;
    }

    public String getPayment() {
        return payment;
    }

    public boolean isIsShipped() {
        
        return isShipped;
    }

    @Override
    public String toString() {
        return customer.toString() + "ID=" + ID +"\n"+ "shipping_date=" + shipping_date +"\n"+ " productslist=" + productslist +"\n"+ " totalCostbeforeoffer=" + totalCostbeforeoffer +"\n"+ "totalCostbeforeoffer=" + totalCostafteroffer +"\n"+" payment=" +"\n"+ payment +"\n";
    }

   

   



    
  
    
    
    
    
}

  
    
    
    
    
}
