package carstuff;


import java.util.Scanner;

public class cisCDapp
{

    public static void main(String[] args) {


        Dealership dealership = new Dealership();
        System.out.println("Welcome to CIS department’s Car Dealership!\n" +
                "To view a list of commands, enter Commands");

        Scanner sc = new Scanner(System.in);
        while(true){
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            switch(parts[0]){
                case "Commands":
                    System.out.println("Commands: shows a list of all available commands\n" +
                            "List: lists the inventory of cars\n" +
                            "Compare [n1] [n2]: compares two cars\n" +
                            "Select [n]: selects car No. n and shows the details\n" +
                            "Engine: shows the details of the engine of the selected car\n" +
                            "Interior: Show the details of the interior of the selected car\n" +
                            "Trunk: Show the items in the trunk of the selected car\n" +
                            "Options: show the details of options installed on the selected car\n" +
                            "Quit: terminate the program");
                    break;
                case "Compare":
                    int index1, index2;
                    index1 = Integer.parseInt(parts[1]);
                    index2 = Integer.parseInt(parts[2]);
                    System.out.println(dealership.Compare(index1, index2));
                    break;
                case "List":
                    String list = dealership.ListAllCars();
                    System.out.println(list);
                    break;
                case "Select":
                    int index;
                    try {
                        index = Integer.parseInt(parts[1]);
                    }catch (NumberFormatException e){
                        if (parts[1].length()==1){
                            index = parts[1].charAt(0)-'A'+1;
                        }else {
                            break;
                        }
                    }
                    if (index < 0 || index > 10){
                        System.out.println("Please enter a number between 1 and 10. ie: \"Select 7\"");
                        break;
                    }
                    String details = dealership.SelectCar(index);
                    System.out.println("This " + details + " is great! You can view engine, interior, and trunk of the car");
                    break;
                case "Engine":
                    System.out.println(dealership.CheckEngine());
                    break;
                case "Interior":
                    System.out.println(dealership.CheckInterior());
                    break;
                case "Trunk":
                    String tlist = dealership.OpenTrunk();
                    System.out.println(tlist);
                    break;
                case "Options":
                    String optList = dealership.ShowOptions();
                    System.out.println(optList);
                    break;
                case "Quit":
                    System.exit(0);

            }
        }
    }

}
