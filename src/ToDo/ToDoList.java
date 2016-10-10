package ToDo;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Created by christiancampbell on 10/10/16.
 */
public class ToDoList {
    public static void toDo() {

        ArrayList<String> main = new ArrayList<>();
        ArrayList<String> groceries = new ArrayList<>();
        ArrayList<String> personal = new ArrayList<>();
        ArrayList<String> chores = new ArrayList<>();
        while (true) {
            System.out.println("Please Select 1 to list all item" + "\n" + "Please select 2 to add an item." + "\n" + "Please select 3 to remove items" + "\n" + "Please select 4 to display a help menu" + "\n" + "Please select 5 to quit");


            Scanner response = new Scanner(System.in);
            String choice = response.nextLine();



            if (choice.equals("1")) {
                while(true){
                System.out.println("Groceries: " + groceries + "\n" + "Personal: " + personal + "\n" + "Chores: " + chores);

                break;}
            }
            else if (choice.equals("4")){
                System.out.println("Use this list to enter things into a To Do list, remove things, and show all things");
            }
            else if (choice.equals("5")){
                System.out.println("Thank you for using this app!");
                break;
            }

            else if (choice.equals("3")) {
                    while(true) {

                    System.out.print("What section would you like to delete an item from? (Type none to escape)");
                    Scanner delete = new Scanner(System.in);
                    String removeSection = delete.nextLine();

                    if (removeSection.equals("Grocery")) {
                        System.out.print("What item would you like to delete ");
                        Scanner delete1 = new Scanner(System.in);
                        String removeSections = delete1.nextLine();
                        groceries.remove(removeSections);
                        System.out.println(groceries);
                    }
                    else if (removeSection.equals("Personal")) {
                        System.out.print("What item would you like to delete ");
                        Scanner delete2 = new Scanner(System.in);
                        String removeSections1 = delete2.nextLine();
                        personal.remove(removeSections1);
                        System.out.println(personal);
                    }
                    else if (removeSection.equals("Chores")) {
                        System.out.print("What item would you like to delete ");
                        Scanner delete3 = new Scanner(System.in);
                        String removeSections2 = delete3.nextLine();
                        chores.remove(removeSections2);
                        System.out.println(chores);
                    }

                    else{
                        break;
                    }


                }
            }



            else if (choice.equals("2")) {
                    while (true) {
                    System.out.print("Which section do you want to add to (Grocery, Personal, Chores (Type none to escape)");
                    Scanner section = new Scanner(System.in);
                    String section1 = section.nextLine();


                    if (section1.equals("Grocery") || section1.equals("grocery")) {
                        System.out.print("Which do you want to add to groceries ");
                        Scanner grocery = new Scanner(System.in);
                        String grocery1 = grocery.nextLine();

                        groceries.add(grocery1);
                        System.out.println(" Groceries:" + groceries);

                    } else if (section1.equals("Personal") || section1.equals("personal")) {
                        System.out.print("Which do you want to add to personal ");
                        Scanner personal1 = new Scanner(System.in);
                        String personal2 = personal1.nextLine();

                        personal.add(personal2);
                        System.out.println("Personal: " + personal);

                    } else if (section1.equals("Chores") || section1.equals("chores")) {
                        System.out.print("Which do you want to add to chores ");
                        Scanner chores1 = new Scanner(System.in);
                        String chores2 = chores1.nextLine();

                        chores.add(chores2);
                        System.out.println("Chores" + chores);

                    } else {
                        break;
                    }


                }


            }



        }
    }
}