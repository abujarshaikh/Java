The compnay.java@
package empPack;

import javax.annotation.processing.Generated;

class company {
    String compName;
    String compAddress;
    Employee e;

    public company(String c, String a) {
        compName = c;
        compAddress = a;
    }

public void dispCompInfo(Employee temp){
    e=temp;
    e.displayEmpInfo;
    System.out.println("Company Ddetailes:");
    System.out.println("Company Name: "+compName);
    System.out.println("Company Address: "+compAddress);
}
} 