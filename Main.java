class Person { //Zulfiqar Gauhar Sap id 76579
    String name = "Zulfiqar GAuhar";
    char gender = 'M';
    long phone = 469209940;
    String email = "khan@gamil.com";
}

class Staff extends Person { //Zulfiqar Gauhar Sap id 76579
    String staffId;
    String[] qualifications;
    String[] experiences;
    int pay;
}

class MedicalStaff extends Staff {  //Zulfiqar Gauhar Sap id 76579
    String specilizations;
}

class Doctor extends MedicalStaff {  //Zulfiqar Gauhar Sap id 76579
    String patients;
    String diagnose() {
    return "Common Cold";
    }
String prescribe() {
    return "Softin";
    }
}

class Nurse extends MedicalStaff { //Zulfiqar Gauhar Sap id 76579
    String wardId;
    void treatement(){
    System.out.println("Treatment ");
    }   
}


class Patient extends Person { //Zulfiqar Gauhar Sap id 76579
    String id;
    String diagnosis;
    String prescriptions;
    String name;
    String email;
    char gender;
    long phone;

}

public class Main {  //Zulfiqar Gauhar Sap id 76579
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        Nurse nur = new Nurse();
        Patient pat = new Patient();
        
        doc.pay = 2000000;
        nur.pay = 1500000;  //Zulfiqar Gauhar Sap id 76579
        pat.diagnosis = doc.diagnose();
        pat.prescriptions = doc.prescribe();
        nur.treatement();
    
        System.out.println("Zulfiqar GAuhar");
        System.out.println('M'); //Zulfiqar Gauhar Sap id 76579
        System.out.println(469209940);
        System.out.println("Khan@gamil.com");
        System.out.println("Diagnosis: " + pat.diagnosis);
        System.out.println("Prescription: " + pat.prescriptions);
    }
}
