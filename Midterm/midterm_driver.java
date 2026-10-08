package Midterm;

import java.util.Scanner;

public class midterm_driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Welcome to the Computer Building Program!");

            String repeat;
            do {
                System.out.print("Please enter your name: ");
                String name = input.nextLine();

                int typeChoice;
                do {
                    System.out.print("1. Desktop\n2. Laptop\nChoose computer type: ");
                    typeChoice = input.nextInt();
                } while(typeChoice != 1 && typeChoice != 2);
                input.nextLine();

                int brandChoice;
                do {
                    System.out.print("Choose Brand:\n1. Dell ($500)\n2. HP ($450)\n3. Lenovo ($400)\nChoice: ");
                    brandChoice = input.nextInt();
                } while(brandChoice < 1 || brandChoice > 3);
                input.nextLine();

                String brand = (brandChoice == 1) ? "Dell" : (brandChoice == 2) ? "HP" : "Lenovo";

                int cpuChoice;
                do {
                    System.out.print("CPU:\n1. AMD ($200)\n2. Intel ($250)\nChoice: ");
                    cpuChoice = input.nextInt();
                } while(cpuChoice != 1 && cpuChoice != 2);

                String cpu = (cpuChoice == 1) ? "AMD" : "Intel";
                double cpuPrice = (cpuChoice == 1) ? 200 : 250;

                if(typeChoice == 1){ 
                    Desktop d = new Desktop(name, brand);
                    d.setCpu(cpu, cpuPrice);

                    int caseChoice;
                    do {
                        System.out.print("Case:\n1. Full Tower ($150)\n2. Mini Tower ($100)\nChoice: ");
                        caseChoice = input.nextInt();
                    } while(caseChoice != 1 && caseChoice != 2);
                    d.setCase((caseChoice == 1)?"Full Tower":"Mini Tower", (caseChoice == 1)?150:100);

                    int hdChoice;
                    do {
                        System.out.print("Hard Drive:\n1. 512GB ($80)\n2. 1TB ($120)\nChoice: ");
                        hdChoice = input.nextInt();
                    } while(hdChoice != 1 && hdChoice != 2);
                    d.setHardDrive((hdChoice==1)?"512GB":"1TB", (hdChoice==1)?80:120);

                    int monitorChoice;
                    do {
                        System.out.print("Monitor:\n1. 24 inch ($150)\n2. 27 inch ($200)\nChoice: ");
                        monitorChoice = input.nextInt();
                    } while(monitorChoice !=1 && monitorChoice!=2);
                    d.setMonitor((monitorChoice==1)?"24 inch":"27 inch", (monitorChoice==1)?150:200);

                    d.display();

                } else { 
                    Laptop l = new Laptop(name, brand);
                    l.setCpu(cpu, cpuPrice);

                    int hdChoice;
                    do {
                        System.out.print("Hard Drive:\n1. 512GB ($80)\n2. 1TB ($120)\nChoice: ");
                        hdChoice = input.nextInt();
                    } while(hdChoice != 1 && hdChoice != 2);
                    l.setHardDrive((hdChoice==1)?"512GB":"1TB", (hdChoice==1)?80:120);

                    int displayChoice;
                    do {
                        System.out.print("Display:\n1. 13 inch ($150)\n2. 15 inch ($200)\nChoice: ");
                        displayChoice = input.nextInt();
                    } while(displayChoice !=1 && displayChoice!=2);
                    l.setDisplay((displayChoice==1)?"13 inch":"15 inch", (displayChoice==1)?150:200);

                    l.display();
                }

                input.nextLine(); 
                System.out.print("Would you like to build another computer? (yes/no): ");
                repeat = input.nextLine().trim().toLowerCase();
            } while(repeat.equals("yes") || repeat.equals("y"));

            System.out.println("Thank you for using the Computer Building Program! Goodbye!");
        }
      

        }


