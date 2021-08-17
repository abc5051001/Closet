import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

/**
 * @author Shawn
 * @version 1.0
 */

public class InsideCloset {
    protected boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    } // I did this to get to the last number since last number is always size in the
      // descriptions but actually there are more empty strings seperated in comma
      // after the number

    private ArrayList<Label<String, Clothing>> myCloset = new ArrayList<Label<String, Clothing>>();

    // this is the arraylist that has all the labels of string name, and different
    // types of clothing.
    public InsideCloset(String filename) {

        try {
            File file = new File(filename);
            if (!file.exists()) {
                throw new FileNotFoundException("File not found");
            } // so I first try to open the file and if I can't then exception happens here
            Scanner sc = new Scanner(file);
            // get a scanner
            while (sc.hasNext()) {
                String x = sc.nextLine();
                String[] filelist = x.split(",");
                // when there is more line each time i take the next line and split it by comma
                // x will be the line and file list will have all the items after split
                ArrayList<String> fl = new ArrayList<String>();
                for (int i = 0; i < filelist.length; i++) {
                    fl.add(filelist[i]);
                    if (isNumeric(filelist[i])) {
                        break;
                    }
                } // this right here i take all the items in filelist and put into fl arraylist
                  // then i called my own method which will return true if i get to size number
                  // and I break right here so I make sure I dont get the extra empty string

                if (x.contains("Graphic T-Shirt")) {
                    // since x is the String of the whole line i take from the scanner
                    // the first item is always the name of the product and it is unique
                    // so I check for all of them
                    Graphic g = new Graphic(fl.get(1), fl.get(2));
                    // Graphic T-Shirt constructor takes graphic,size,and color so i need graphic
                    // and graphic info are located at index 1,2
                    String colors = "";
                    boolean add = false;
                    for (int i = 0; i < fl.size(); i++) {
                        if (i >= 3 && i < fl.size() - 1 && !fl.get(i).equals("")) {
                            if (add == false) {
                                colors += fl.get(i);
                                add = true;
                            } else {
                                colors = colors + " " + fl.get(i);
                            }
                        }
                    } // so since there can be multiple colors from index 3 to the end
                      // I just added all of them together so that way I have a string with all colors
                    int size = Integer.parseInt(fl.get(fl.size() - 1));
                    // and the last always gonna be size becuz I did my method previously
                    GraphicTshirt gt = new GraphicTshirt(g, size, colors);
                    String type1 = "Graphic T-Shirt";
                    Label<String, Clothing> l = new Label<String, Clothing>(type1, gt);
                    this.myCloset.add(l);
                    // finally I created the graphic t-shirt and put in label and add to arraylist
                } else if (x.contains("Tank Top")) {
                    String colors = "";
                    boolean add = false;
                    for (int i = 0; i < fl.size(); i++) {
                        if (i >= 2 && i < fl.size() - 1 && !fl.get(i).equals("")) {
                            if (add == false) {
                                colors += fl.get(i);
                                add = true;
                            } else {
                                colors = colors + " " + fl.get(i);
                            }
                        }
                    }
                    int size = Integer.parseInt(fl.get(fl.size() - 1));
                    TankTop t = new TankTop(fl.get(1), size, colors);
                    String type1 = "Tank Top";
                    Label<String, Clothing> l = new Label<String, Clothing>(type1, t);
                    this.myCloset.add(l);
                    // same as previous one
                } else if (x.contains("Jeans")) {
                    String z = fl.get(1);
                    String type1 = "Jeans";
                    if (z.equals(JEANFIT.Bootcut.name().toLowerCase())) {
                        // check which name is this jeans and use the corresponding enum
                        int size = Integer.parseInt(fl.get(fl.size() - 1));
                        Jeans j = new Jeans(size, fl.get(2), JEANFIT.Bootcut);
                        Label<String, Clothing> l = new Label<String, Clothing>(type1, j);
                        this.myCloset.add(l);
                    } else if (z.equals(JEANFIT.Skinny.name().toLowerCase())) {
                        int size = Integer.parseInt(fl.get(fl.size() - 1));
                        Jeans j = new Jeans(size, fl.get(2), JEANFIT.Skinny);
                        Label<String, Clothing> l = new Label<String, Clothing>(type1, j);
                        this.myCloset.add(l);
                    } else if (z.equals(JEANFIT.Straight.name().toLowerCase())) {
                        int size = Integer.parseInt(fl.get(fl.size() - 1));
                        Jeans j = new Jeans(size, fl.get(2), JEANFIT.Straight);
                        Label<String, Clothing> l = new Label<String, Clothing>(type1, j);
                        this.myCloset.add(l);
                    }
                    // this is a little bit different, jeans constructor takes JEANFIT enum
                    // so I need to figure out which enum value I need to put in
                    // also there will only be one color for jeans so I dont need to do the loop
                } else if (x.contains("Legging")) {
                    String colors = "";
                    boolean add = false;
                    for (int i = 0; i < fl.size(); i++) {
                        if (i >= 2 && i < fl.size() - 1 && !fl.get(i).equals("")) {
                            if (add == false) {
                                colors += fl.get(i);
                                add = true;
                            } else {
                                colors = colors + " " + fl.get(i);
                            }
                        }
                    }
                    int size = Integer.parseInt(fl.get(fl.size() - 1));
                    Legging leg = new Legging(size, colors, fl.get(1));
                    String type1 = "Legging";
                    Label<String, Clothing> l = new Label<String, Clothing>(type1, leg);
                    this.myCloset.add(l);
                    // same as the first two
                } else if (x.contains("Shorts")) {
                    String colors = "";
                    boolean add = false;
                    for (int i = 0; i < fl.size(); i++) {
                        if (i >= 2 && i < fl.size() - 1 && !fl.get(i).equals("")) {
                            if (add == false) {
                                colors += fl.get(i);
                                add = true;
                            } else {
                                colors = colors + " " + fl.get(i);
                            }
                        }
                    }
                    int size = Integer.parseInt(fl.get(fl.size() - 1));
                    Shorts st = new Shorts(size, colors, fl.get(1));
                    String type1 = "Shorts";
                    Label<String, Clothing> l = new Label<String, Clothing>(type1, st);
                    this.myCloset.add(l);
                    // same thing again
                } else if (x.contains("Sweater")) {
                    String colors = "";
                    boolean add = false;
                    for (int i = 0; i < fl.size(); i++) {
                        if (i >= 2 && i < fl.size() - 1 && !fl.get(i).equals("")) {
                            if (add == false) {
                                colors += fl.get(i);
                                add = true;
                            } else {
                                colors = colors + " " + fl.get(i);
                            }
                        }
                    }
                    int size = Integer.parseInt(fl.get(fl.size() - 1));
                    String sw = fl.get(1);
                    String type1 = "Sweater";
                    if (sw.equals(SWEATERTYPE.Cardigan.name().toLowerCase())) {
                        Sweater s = new Sweater(SWEATERTYPE.Cardigan, size, colors);
                        Label<String, Clothing> l = new Label<String, Clothing>(type1, s);
                        this.myCloset.add(l);
                    } else if (sw.equals(SWEATERTYPE.Pullover.name().toLowerCase())) {
                        Sweater s = new Sweater(SWEATERTYPE.Pullover, size, colors);
                        Label<String, Clothing> l = new Label<String, Clothing>(type1, s);
                        this.myCloset.add(l);
                    } else if (sw.equals(SWEATERTYPE.Shrug.name().toLowerCase())) {
                        Sweater s = new Sweater(SWEATERTYPE.Shrug, size, colors);
                        Label<String, Clothing> l = new Label<String, Clothing>(type1, s);
                        this.myCloset.add(l);
                    }
                    // similar to jeans i have to get the enum
                } else {
                    throw new ClothingException("invalid item");
                    // if the type is none of the above we throw exception
                }
            }
            sc.close();
        } catch (Exception e) {
            System.err.println(e);
        } // filenotfoundexception goes here
    }

    public void printWholeCloset() {
        for (int i = 0; i < myCloset.size(); i++) {
            String x = "";
            x = myCloset.get(i).getValue().toString();
            System.out.println(x);
        }
    } // print the closet using the tostring method by each class

    public void printSpecificClothing(String s) throws ClothingException {
        boolean correct = false;
        // set a checking boolean
        for (int i = 0; i < myCloset.size(); i++) {

            if (myCloset.get(i).getKey().equals(s)) {
                correct = true;
                System.out.println(myCloset.get(i).getValue().toString());
            } // when we find the name of the clothing then we use its to string method
        }
        if (correct == false) {
            throw new ClothingException("invalid item");
            // if not found this exception will happen
        }
    }

    public ArrayList<Clothing> organizedCloset() {
        ArrayList<Integer> order = new ArrayList<Integer>();
        ArrayList<Clothing> ans = new ArrayList<Clothing>();
        for (int i = 0; i < myCloset.size(); i++) {
            if (myCloset.get(i).getKey().equals("Graphic T-Shirt")) {
                order.add(i);
            }
        }
        for (int i = 0; i < myCloset.size(); i++) {
            if (myCloset.get(i).getKey().equals("Jeans")) {
                order.add(i);
            }
        }
        for (int i = 0; i < myCloset.size(); i++) {
            if (myCloset.get(i).getKey().equals("Legging")) {
                order.add(i);
            }
        }
        for (int i = 0; i < myCloset.size(); i++) {
            if (myCloset.get(i).getKey().equals("Shorts")) {
                order.add(i);
            }
        }
        for (int i = 0; i < myCloset.size(); i++) {
            if (myCloset.get(i).getKey().equals("Sweater")) {
                order.add(i);
            }
        }
        for (int i = 0; i < myCloset.size(); i++) {
            if (myCloset.get(i).getKey().equals("Tank Top")) {
                order.add(i);
            }
        }
        // I did this to make order arraylist get the index of the items in order
        for (int i = 0; i < order.size(); i++) {
            ans.add(myCloset.get(order.get(i)).getValue());
        } // this arraylist will get the clothing in order
        return (ans);
    }

    public ArrayList<Clothing> colorCoordinate(String item, String color) throws ClothingException {
        ArrayList<Clothing> ans = new ArrayList<Clothing>();
        boolean found = false;
        if (item.equals("Jeans") || item.equals("Legging") || item.equals("Shorts")) {
            for (int i = 0; i < myCloset.size(); i++) {
                String x = myCloset.get(i).getKey();
                if (x.equals("Tank Top") || x.equals("Sweater") || x.equals("Graphic T-Shirt")) {
                    if (myCloset.get(i).getValue().getColor().contains(color)) {
                        ans.add(myCloset.get(i).getValue());
                        found = true;
                    }
                }
            }
            if (found) {
                return (ans);
            } else {
                throw new ClothingException("nothing of that color in your closet");
            } // so if our item is an object of bottoms
              // then i look for the top that has the same color
              // and if the closet doesn't have the same color top, exception happens
        } else if (item.equals("Tank Top") || item.equals("Sweater") || item.equals("Graphic T-Shirt")) {
            for (int i = 0; i < myCloset.size(); i++) {
                String x = myCloset.get(i).getKey();
                if (x.equals("Jeans") || x.equals("Legging") || x.equals("Shorts")) {
                    if (myCloset.get(i).getValue().getColor().contains(color)) {
                        ans.add(myCloset.get(i).getValue());
                        found = true;
                    }
                }
            }
            if (found) {
                return (ans);
            } else {
                throw new ClothingException("nothing of that color in your closet");
            } // same for tops
        } else {
            throw new ClothingException("invalid item"); // so if not tops and bottoms then this exception happens
        }

    }

}
