package edu.lernia.labb3;

public class Patient {
    private String name;
    private String sickness;
    private boolean isSick = true;

public Patient(String string, String skickness){
        this.name = string;
        this.sickness = skickness;
        if(sickness == null){
        this.sickness = "healthy";    
        }

}


public Boolean isSick() {
    if(this.sickness != "healthy") {
        return true;
    } else {
        return false;
    }
}

public String getSickness() {
    return sickness;
}

public String getName() {
    return name;
}

public void takeMedication(Medicine medicine) {
    if (sickness.equals(medicine.getTreatmentName())) {
      isSick = !isSick;
        }  
     }
  }