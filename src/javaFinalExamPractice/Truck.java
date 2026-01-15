/*
Create a sub class of Vehicle class and name it as Truck. The Truck class has the following fiels and methods.
*int weight;
-Now override the double getSaleprice() method from its super class and apply the following logic-
If weight>2000, 10% discount. Otherwise no discount no regular price.
 */
package javaFinalExamPractice;

public class Truck extends Vehicle2{
    int weight;

    @Override
    double getSalePrice() {
         if(weight > 2000){
             return regularPrice * 0.1;
         } else {
             return regularPrice;
         }
    }   
}
