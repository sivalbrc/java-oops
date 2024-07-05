package com.oops;

public class Main {
    public static void main(String[] args) {
//        object
//        Customer customer ;   reference variable
//        int x; normal variable
       Customer customer =  new Customer();      // new customer object
        int x;
        x = 100;


        customer.id = 111;
        customer.name = "SiVA";
        customer.email = "SiVA@gmail.com";
        customer.contactNo = "+91-234567890";
        customer.salary = 2342345;
        customer.age = 33;
customer.displayCustomerDetails();



        Customer customer1;
        customer1 = new Customer();
        customer1.id = 222;
        customer1.name = "SAI";
        customer1.email = "SAI@Imail.com";
        customer1.contactNo = "+91-098765432";
        customer1.salary = 9876543;
        customer1.age = 44;
customer1.displayCustomerDetails();


     Customer customer2 =  new Customer();

     customer2.id = 333;
     customer2.name = "hai";
     customer2.email = "hai@Imail.com";
     customer2.contactNo = "+91-456787654567";
     customer2.salary = 3456543;
        customer2.age = 22;
     customer2.displayCustomerDetails();

//byte discountPercentage = customer1.discountPercentageByAge();
//        System.out.println(customer1.name+"s discount Percentage is:"+discountPercentage);
        System.out.println(customer1.name + " s discount percentage is : "+customer1.discountPercentageByAge());
        System.out.println(customer2.name + " s discount percentage is : "+customer2.discountPercentageByAge());
        System.out.println("final product price for "+customer2.name + " is $ :" + customer2.finalproductPriceAfterDiscount(23));
        System.out.println("final product price for "+customer.name + " is $ :" + customer.finalproductPriceAfterDiscount(23));
        System.out.println("final product price for "+customer1.name + " is $ :" + customer1.finalproductPriceAfterDiscount(23));




    }
}
