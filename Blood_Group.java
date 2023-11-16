import java.util.*;
import java.util.stream.*;
class Patients{
    String pname;
    int priority;
    String bloodGrp;
    int bloodL;

    Patients(String pname,String bloodGrp,int priority,int bloodL){
        this.pname=pname;
        this.bloodGrp = bloodGrp;
        this.priority = priority;
        this.bloodL = bloodL;
    }
}
class Donor{
    String dname;
    int phn_no;
    String dgroup;
    ArrayList<Donor> donorsList = new ArrayList<>();

    public Donor() {
    }

    public Donor(String dname,int phn_no,String dgroup){
        this.dname=dname;
        this.phn_no=phn_no;
        this.dgroup=dgroup;
    }
    public void check(int phn_no) {
        if (donorsList.contains(phn_no)) {
            throw new IllegalArgumentException("User already exists!");
        }
    }

    public void addDonor(String dname,int phn_no,String dgroup){
        check(phn_no);
        donorsList.add(new Donor(dname,phn_no,dgroup));
    }

    public List getDonors(){
        return this.donorsList;
    }
}
class Blood_Group{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Donor d = new Donor();
        ArrayList<Patients> patientsList = new ArrayList<>();
        Map<String,Integer> BloodBank = new HashMap<String,Integer>();
        BloodBank.put("A",5);
        BloodBank.put("AB",3);
        BloodBank.put("B",1);
        BloodBank.put("O",4);
        System.out.println("Do you wanna add the details of the patients:");
        String n = sc.nextLine();
        while(!n.equalsIgnoreCase("no")){
            System.out.println("\n\tEnter patient details : ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Blood : ");
            String bldgrp = sc.nextLine();
            System.out.print("Priority from 1 to 10, 1 is highest: ");
            int prty = sc.nextInt();
            System.out.println("Enter required units of blood: ");
            int bl = sc.nextInt();
            patientsList.add(new Patients(name,bldgrp,prty, bl));
            sc.nextLine();
            System.out.println("Do you wanna continue adding the details of the patients:");
            n = sc.nextLine();
        }
        System.out.println("Do you wanna add the details of the donors:");
        String m = sc.nextLine();
        while(!m.equalsIgnoreCase("no")){
            System.out.println("\n\tEnter donor details : ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Phone Number: ");
            int phoneNo = sc.nextInt();
            System.out.print("Blood Group: ");
            String bldgrp = sc.nextLine();
            d.addDonor(name,phoneNo,bldgrp);
            sc.nextLine();
            System.out.println("Do you wanna continue adding the details of the donors:");
            m = sc.nextLine();
        }
        List<Integer> PL= patientsList.stream().map(s->s.priority).sorted().collect(Collectors.toList());
        System.out.println(PL);
        for (int i = 0; i < PL.size() ; i++) {
            if(BloodBank.containsKey(patientsList.get(i).bloodGrp)){
                if((BloodBank.get(patientsList.get(i).bloodGrp))>=patientsList.get(i).bloodL){
                    System.out.println("The patient "+patientsList.get(i).pname+" has been matched with a donor.");
                    BloodBank.replace(patientsList.get(i).bloodGrp,(BloodBank.get(patientsList.get(i).bloodGrp)) - (patientsList.get(i).bloodL));
                }
                else if(d.getDonors().contains(patientsList.get(i).bloodGrp)){
                    System.out.println("Match found!");
                    break;
                }
                else{
                    System.out.println("Not enough blood available in "+patientsList.get(i).bloodGrp+" group.");
                    System.out.println("No match found!");
                }
            }
            else{
                    System.out.println("Sorry! "+patientsList.get(i).pname+"'s request cannot be fulfilled.");
                }
        }
    }
}