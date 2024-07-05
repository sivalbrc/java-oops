package com.oops;

public class Customer {
//    state (data)
//    behavior
    int id;
    String name;
    String email;
    String contactNo;
    int salary;
    int age;

    Customer(){
        System.out.println("Customer() is called ....");
        id = 111;
        name = "customer1";
        email = "Customer1@gamil.com";
        contactNo = "+91-2345678";
        salary = 234567;
        age = 23;

    }


// behavior not but methods
    /*
    1.without returntype without parameters
     */
    void displayCustomerDetails(){
        System.out.println("Id : "+id);
        System.out.println("name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Contact No "+contactNo);
        System.out.println("Salary : "+salary);
        System.out.println("AGE :"+age);
    }
/*
2.without returntype with parameters
 */
    void displayProducts(String membershipType){
//        business logic
        System.out.println("Displaying Products for membership"+membershipType);
    }
    /*
    3.with returntype without parameters
    age >=60 discountPercentage = 30;
    40-60 ,20
    20-15,15
     */
    byte discountPercentageByAge(){
        System.out.println("discountPercentage () is called ");
        byte discountPercentage = 0;
        if(age >=60)
            discountPercentage = 30;
        else if (age >=50 && age< 60)
            discountPercentage = 20;
        else if(age>=20 && age < 40)
            discountPercentage = 15;
        else
            discountPercentage = 5;

return  discountPercentage;
    }
    /*
    4. with returnType and with parameters
    finalprice after discount
    1.product price(parameter)
    2.discount perecentage
    3.calculate Final price (productprice - productPrice * discountpercentage /100
    4.return the final price
     */
    double finalproductPriceAfterDiscount(double productPrice){
        byte discountpercentage = discountPercentageByAge();
        return productPrice-(productPrice*discountpercentage)/100;
    }

}
