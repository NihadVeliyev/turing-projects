package manager;

import model.Appointment;
import model.Doctor;
import model.Patient;
import model.Room;

import java.util.ArrayList;
import java.util.List;

public class HospitalManager {
    public static List<Patient> patients = new ArrayList<>();
    public static List<Doctor> doctors = new ArrayList<>();
    public static List<Appointment> appointments = new ArrayList<>();
    public static List<Room> rooms = new ArrayList<>();
    void addPatient(Patient patient){
        patients.add(patient);

    }
    void listAllPatients(){
        for(int i=0;i<patients.size();i++){
            System.out.println(patients.get(i)+" ");
        }
    }
}

