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
class emp {
    private int age,salary;
    private String name,job,phone,gender;
    public emp(String name,int age,String gender,String job,int salary,String phone)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.job=job;
        this.salary=salary;
        this.phone=phone;
    }
    public String getname()
    {return name;
    
    }
    public int getage()
    {return age;}
    public String getgender()
    {return gender;
    
    }
    public String getjob()
    {return job;}
    public int getsalary()
    {return salary;
    
    }
    public String getphone()
    {return phone;
    
    }
}
