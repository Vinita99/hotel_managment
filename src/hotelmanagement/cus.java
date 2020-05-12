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
class cus {
    private int number,room,deposit,days;
    private String id,name,gender,country,checkedin;
    public cus(String id,int number,String name,String gender,String country,int room,String checkedin,int deposit,int days)
    {
        this.id=id;
        this.number=number;
        this.name=name;
        this.gender=gender;
        this.country=country;
        this.room=room;
        this.checkedin=checkedin;
        this.deposit=deposit;
        this.days=days;
    }
    public String getid()
    {return id;}
    public int getnumber()
    {return number;}
    public String getname()
    {return name;}
    public String getgender()
    {return gender;}
    public String getcountry()
    {return country;}
    public int getroom()
    {return room;}
    public String check()
    {return checkedin;}
    public int getdeposit()
    {return deposit;}
    public int getdays()
    {return days;}
    
    
}
