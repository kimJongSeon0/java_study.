package day_2024_07_31;

import java.util.ArrayList;

class CompanyHR {
    private String name;
    private int num;
    private String enterData;

    CompanyHR(String name, int num, String enterData) {
        this.name = name;
        this.num = num;
        this.enterData = enterData;
    }

    public String getName() {
        return this.name;
    }

    public int getNum() {
        return this.num;
    }

    public String getEnterData() {
        return this.enterData;
    }

    public void printData(){
        System.out.println("이름" + this.name);
        System.out.println("사번" + this.num);
        System.out.println("입사일" + this.enterData);
    }

    @Override
    public String toString() {
        return "이름" + this.name + "사번" + this.num + "입사일" + this.enterData;
    }
}

class Company {
    private ArrayList<CompanyHR> dto;

    Company() {
        dto = new ArrayList<CompanyHR>();
    }

    public void addNewPerson(CompanyHR dtos) {
        dto.add(dtos);
    }

    public void printPersonData(CompanyHR dtos){
        System.out.println(dtos.toString()) ;
    }

    public CompanyHR searchPerson(String name) {
        for (CompanyHR chr : dto) {
            if (name.equalsIgnoreCase(chr.getName())) {
                return chr;
            }
        }
        return null;
    }
}

public class Management {
    public static void main(String[] args) {
        Company cp = new Company();
        cp.addNewPerson(new CompanyHR("홍길동", 1234, "2024-05-01"));
        cp.addNewPerson(new CompanyHR("홍길동2", 5678, "2024-05-02"));
        cp.addNewPerson(new CompanyHR("홍길동3", 1011, "2024-05-03"));
        cp.addNewPerson(new CompanyHR("홍길동4", 1213, "2024-05-04"));

        cp.searchPerson("홍길동2").printData();
        cp.printPersonData(cp.searchPerson("홍길동"));


        }

    }
