package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<String[]> customerData = Arrays.asList(
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","-7500","01-10-2022"},
            new String[] {"1","Wayne Enterprises","18000","12-22-2021"},
            new String[] {"3","Ace Chemical","-48000","01-10-2022"},
            new String[] {"3","Ace Chemical","-95000","12-15-2021"},
            new String[] {"1","Wayne Enterprises","175000","01-01-2022"},
            new String[] {"1","Wayne Enterprises","-35000","12-09-2021"},
            new String[] {"1","Wayne Enterprises","-64000","01-17-2022"},
            new String[] {"3","Ace Chemical","70000","12-29-2022"},
            new String[] {"2","Daily Planet","56000","12-13-2022"},
            new String[] {"2","Daily Planet","-33000","01-07-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","33000","01-17-2022"},
            new String[] {"3","Ace Chemical","140000","01-25-2022"},
            new String[] {"2","Daily Planet","5000","12-12-2022"},
            new String[] {"3","Ace Chemical","-82000","01-03-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"}
    );
    public static void main(String[] args) {
        //Update this
        List<Customer> customers = new ArrayList<>();

        for(String[] currentData: customerData)
        {
            int i = 0;
            Customer customer = null;
            Customer inCustomer = null;
            AccountRecord record = null;
            for(String data : currentData)
            {
                if(i == 0)
                {
                    inCustomer = getCustomer(Integer.parseInt(data), customers);

                    if(inCustomer == null)
                        customer = new Customer();
                }
                if(inCustomer != null)
                {
                    if(i == 2)
                    {
                        record = new AccountRecord();
                        record.setCharge(Integer.parseInt(data));
                    }
                    else if(i == 3)
                    {
                        record.setChargeDate(data);
                        List<AccountRecord> charges = inCustomer.getCharges();
                        charges.add(record);
                    }
                }else
                {
                    if(i == 0)
                        customer.setId(Integer.parseInt(data));
                    else if(i == 1)
                        customer.setName(data);
                    else if(i == 2)
                    {
                        record = new AccountRecord();
                        record.setCharge(Integer.parseInt(data));
                    }
                    else if(i == 3)
                    {
                        record.setChargeDate(data);
                        List<AccountRecord> charges = customer.getCharges();
                        charges.add(record);
                        customers.add(customer);
                    }}
                i++;
            }}
        System.out.println("Positive accounts:");
        for(Customer customer : customers)
            if(customer.getBalance() > 0)
                System.out.println(customer);

        System.out.println("Negative accounts:");
        for(Customer customer : customers)
            if(customer.getBalance() < 0)
                System.out.println(customer);
    }
    private static Customer getCustomer(int customerId, List<Customer> customers)
    {
        for (Customer customerInList : customers) {
            if(customerId == customerInList.getId())
                return customerInList;
        }
        return null;
    }


}
