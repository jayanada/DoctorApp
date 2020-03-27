/* Name - Pasindu Ruwandeniya
   Number - 0045
 */

class Doctor {  // Creating the class "Doctor"

        private String docName; // Declaring private variables
        private String address;
        private String phoneNo;
        private int regNo;


        /* We need to setup "Setters and Getters" to inject and execute above variables
        from another class because they are declared as private.
         */

    public void setDoctors(String docName, String address, String phoneNo, int regNo) { // Setter

    this.docName=docName; // "this" refers the current object in the method.
    this.address=address;
    this.phoneNo=phoneNo;
    this.regNo=regNo;

    }

    public void getDoctors() { // Getter
        System.out.println(docName);
        System.out.println(address);
        System.out.println(phoneNo);
        System.out.println(regNo);
    }

    public double totalPayment(int totalPayment) {

        return totalPayment; // Method declared as double so it returns a double value even though the declared variable is integer.
    }
}

class GeneralPractitioner extends Doctor { // Creating "GeneralPractitioner" class extending "Doctor" mother class.
    int hourlyRate;

    @Override
    public double totalPayment(int hours) { // Overriding "totalPayment" method and passing "int hours" as a parameter.
        return hourlyRate*hours;
    }
}

class Specialist extends Doctor { // Creating "Specialist" class extending "Doctor" mother class.
    int chargePerPatient;

    @Override
    public double totalPayment(int numberOfPatient) { // Overriding "totalPayment" method and passing "int numberOfPatient" as a parameter.
        return chargePerPatient*numberOfPatient;
    }
}

public class DoctorApp { // Creating "DoctorApp" class.

    public static void main(String[] args) { // Main method.

        System.out.println("Details of GeneralPractitioner: ");
        GeneralPractitioner doc1 = new GeneralPractitioner(); // Creating an object for a General Practitioner.
        doc1.setDoctors("Kalpa", "Mawanella", "0712254659", 111); // Passing data to the set method using parameters.
        doc1.getDoctors(); // Executing get method.

        System.out.println("Total payment of the General Practitioner : ");
        doc1.hourlyRate=1000; // Passing data to the variable "hourlyRate" using object property.
        System.out.println(doc1.totalPayment(3)); // Outputting "totalPayment" method and passing a data to the relevant variable; "hours".
        System.out.println(""); // Creating a whitespace.

        System.out.println("Details of Specialist: ");
        Specialist doc2 = new Specialist(); // Creating an object for a Specialist.
        doc2.setDoctors("Pasindu", "Kandy", "0715706007", 112); // Passing data to the set method using parameters.
        doc2.getDoctors(); // Executing get method.

        System.out.println("Total payment Specialist: ");
        doc2.chargePerPatient=1500; // Passing data to the variable "chargePerPatient" using object property.
        System.out.println(doc2.totalPayment(8)); // Outputting "totalPayment" method and passing a data to the relevant variable; "numberOfPatient".
    }
}