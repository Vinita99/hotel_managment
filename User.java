/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

/**
 *
 * @author KOTRESHA
 */
class User {
    private int number,price;
    private String availability,status,type;
    
    public User(int number,String availability,String status,int price,String type)
    {
        this.number=number;
        this.price=price;
        this.availability=availability;
        this.status=status;
        this.type=type;
    }
    public int getnumber()
    {
        return number;
    }
    public int getprice()
    {
        return price;
    }

    public String getavailability()
    {
        return availability;
    }

    public String getstatus()
    {
        return status;
    }

    public String gettype()
    {
        return type;
    }

    
}
