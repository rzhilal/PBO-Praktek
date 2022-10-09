package studi_kasus_3;

class Salesperson implements Comparable<Salesperson>

{

    private String firstName, lastName;

    private int totalSales;

    //------------------------------------------------------

    //  Constructor:  Sets up the sales person object with

    //                the given data.

    //------------------------------------------------------

    public Salesperson (String first, String last, int sales)

    {

        firstName = first;

        lastName = last;

        totalSales = sales;

    }

    public String toString()

    {

        return lastName + ", " + firstName + ": \t" + totalSales;

    }

    public boolean equals (Salesperson s)

    {

        return (lastName.equals(s.getLastName()) &&

                firstName.equals(s.getFirstName()));

    }

    public int compareTo(Salesperson s)

    {

        int result=-200;
        
        if(s.totalSales==this.totalSales)
        {
        if(equals(s))
        result=0;
        else
        {
        if(s.firstName!=firstName)
        {
            result=(s.firstName).compareTo(firstName);
            if(result>0)
            result=-1;
        }
        else
        {
            result=(s.lastName).compareTo(lastName);
            if(result>0)
            result=-1;
        }
        }
        }
        else
        if(s.totalSales<this.totalSales)
        result= 1;
        else
        result= -1;

        return result;

    }

    public String getFirstName()

    {

        return firstName;

    }

    public String getLastName()

    {

        return lastName;

    }

    public int getSales()

    {

        return totalSales;

    }

}