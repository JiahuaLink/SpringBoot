package com.wdjr.springboot.dao;

import com.wdjr.springboot.entities.Company;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CompanyDao {

    private static  Map<Integer, Company> companies = null;
    static {
        companies = new HashMap<Integer, Company>();
        companies.put(101,new Company(101,"C-AA"));
        companies.put(102,new Company(102,"C-BB"));
    }
    public Collection<Company> getCompanies(){
        return companies.values();
    }
    public  Company getCompany(Integer id){
        return companies.get(id);
    }
}

