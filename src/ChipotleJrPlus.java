/****************************************** Pseudo-code **********************
 * input: ingredients
 * output: 25 burritos including their ingredients and price
 * process: import Random class
 *          initialize multidimensional String array for ingredients
 *          assign the inner arrays to a single dimension category of array
 *
 *          create a for loop to iterate 25 times
 *
 *
 *
 *          generate random picks from ingredients list
 *          generate random boolean picks for some ingredients
 *          calculate price from number of ingredients
 *          display the result
 *
 ***************************************** Test case *****************************
 *case 1:
 * Burrito 1 : all rice, carnidas , all beans, all salsa, lettuce , chees , Queso  $6.0
 * Burrito 2 : white rice, chorizo , pinto beans, no salsa, fajita veggies  $5.0
 * Burrito 3 : all rice, no , black beans, mild salsa, fajita veggies , chees , Guac , Queso  $6.0
 * Burrito 4 : brown rice, no , no beans, hot salsa, lettuce , Sour cream  $5.0
 * Burrito 5 : all rice, chorizo , pinto beans, hot salsa, no , chees , Guac , Queso , Sour cream  $6.0
 * Burrito 6 : no rice, carnidas , pinto beans, no salsa, no , chees , Guac , Queso  $5.0
 * Burrito 7 : all rice, all meat , black beans, mild salsa, fajita veggies , Guac , Sour cream  $6.0
 * Burrito 8 : brown rice, veggie meat , no beans, mild salsa, lettuce , Queso , Sour cream  $6.0
 * Burrito 9 : no rice, chorizo , all beans, no salsa, fajita veggies , chees , Queso  $5.0
 * Burrito 10 : white rice, steak , all beans, mild salsa, fajita veggies , Guac , Queso , Sour cream  $6.0
 * Burrito 11 : brown rice, sofritas , pinto beans, mild salsa, lettuce , Queso  $6.0
 * Burrito 12 : no rice, all meat , no beans, medium salsa, no , Guac , Queso  $4.0
 * Burrito 13 : no rice, all meat , no beans, all salsa, no , Guac , Queso  $4.0
 * Burrito 14 : no rice, veggie meat , all beans, all salsa, fajita veggies  $5.0
 * Burrito 15 : no rice, sofritas , black beans, no salsa, all veggies , chees , Guac , Queso  $5.0
 * Burrito 16 : all rice, carnidas , pinto beans, no salsa, lettuce , Guac  $5.0
 * Burrito 17 : all rice, all meat , pinto beans, hot salsa, fajita veggies , Guac , Queso  $6.0
 * Burrito 18 : no rice, sofritas , no beans, mild salsa, lettuce , chees , Queso , Sour cream  $6.0
 * Burrito 19 : brown rice, steak , black beans, hot salsa, lettuce , Guac , Sour cream  $6.0
 * Burrito 20 : white rice, carnidas , pinto beans, no salsa, fajita veggies , Guac , Queso  $5.0
 * Burrito 21 : brown rice, veggie meat , all beans, medium salsa, fajita veggies , Guac , Queso , Sour cream  $6.0
 * Burrito 22 : no rice, chicken , no beans, medium salsa, lettuce , chees , Queso  $5.0
 * Burrito 23 : white rice, no , pinto beans, all salsa, lettuce , Guac , Sour cream  $6.0
 * Burrito 24 : white rice, carnidas , pinto beans, no salsa, all veggies , Guac , Queso , Sour cream  $6.0
 * Burrito 25 : brown rice, steak , black beans, all salsa, no , chees , Guac , Sour cream  $6.0
 *
 * Process finished with exit code 0
 *
 * case 2:
 * Burrito 1 : brown rice, chorizo , no beans, mild salsa, all veggies , Guac  $5.0
 * Burrito 2 : brown rice, chicken , black beans, medium salsa, no , chees , Queso , Sour cream  $6.0
 * Burrito 3 : all rice, veggie meat , black beans, mild salsa, lettuce , chees , Guac , Sour cream  $7.0
 * Burrito 4 : white rice, chorizo , all beans, no salsa, lettuce , chees , Guac , Queso , Sour cream  $6.0
 * Burrito 5 : no rice, no , black beans, mild salsa, lettuce  $5.0
 * Burrito 6 : all rice, no , all beans, mild salsa, fajita veggies , Queso , Sour cream  $6.0
 * Burrito 7 : all rice, chicken , no beans, hot salsa, fajita veggies , chees , Queso , Sour cream  $6.0
 * Burrito 8 : white rice, veggie meat , pinto beans, no salsa, lettuce , chees , Queso , Sour cream  $6.0
 * Burrito 9 : all rice, all meat , pinto beans, mild salsa, no , Guac , Queso  $5.0
 * Burrito 10 : white rice, veggie meat , all beans, medium salsa, all veggies , chees , Sour cream  $7.0
 * Burrito 11 : no rice, steak , all beans, hot salsa, fajita veggies  $5.0
 * Burrito 12 : no rice, no , no beans, mild salsa, fajita veggies , Queso  $4.0
 * Burrito 13 : white rice, all meat , all beans, hot salsa, fajita veggies , chees , Queso , Sour cream  $7.0
 * Burrito 14 : all rice, carnidas , black beans, all salsa, lettuce , Guac , Queso , Sour cream  $6.0
 * Burrito 15 : no rice, sofritas , pinto beans, mild salsa, fajita veggies , Guac  $5.0
 * Burrito 16 : all rice, all meat , pinto beans, all salsa, no , chees , Guac , Queso  $6.0
 * Burrito 17 : no rice, steak , black beans, hot salsa, lettuce , Guac , Queso  $5.0
 * Burrito 18 : all rice, all meat , black beans, all salsa, all veggies , Guac  $6.0
 * Burrito 19 : all rice, all meat , black beans, mild salsa, all veggies , Guac , Queso  $6.0
 * Burrito 20 : all rice, carnidas , no beans, no salsa, no , chees , Queso  $5.0
 * Burrito 21 : brown rice, chorizo , all beans, hot salsa, lettuce , chees , Guac , Sour cream  $7.0
 * Burrito 22 : white rice, veggie meat , all beans, mild salsa, lettuce , Queso  $6.0
 * Burrito 23 : brown rice, sofritas , pinto beans, all salsa, lettuce  $6.0
 * Burrito 24 : white rice, sofritas , all beans, mild salsa, no , Queso  $5.0
 * Burrito 25 : brown rice, steak , pinto beans, all salsa, lettuce , Guac , Queso , Sour cream  $6.0
 *
 * Process finished with exit code 0
 *
 */

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Random;

public class ChipotleJrPlus {
    public static void main(String [] args) {

        //ingredients multidimensional array
        String [][] ingredients = {
                {"white", "brown", "no", "all"},
                {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggie meat", "no", "all meat"},
                {"pinto", "black", "no", "all"},
                {"mild", "medium", "hot", "no", "all"},
                {"lettuce", "fajita veggies", "no", "all veggies"}
        };


        String [] rice = ingredients[0];
        String [] meat = ingredients[1];
        String [] beans = ingredients[2];
        String [] salsa = ingredients[3];
        String [] veggies = ingredients[4];

        //for extra challenge
        ArrayList<String> ingredientList = new ArrayList<String>();

        ArrayList<String> meatList = new ArrayList<String>();
        ArrayList<String> beansList = new ArrayList<String>();
        ArrayList<String> salsaList = new ArrayList<String>();
        ArrayList<String> veggiesList = new ArrayList<String>();



        // make 25 burritos
        double totalPrice = 0;
        for(int i = 1; i <= 25; i++) {
            double price = 3;
            double ingrdCount = 0;

            String riceChoice = randomIngredient(rice);
                if(!riceChoice.equals("no")) {
                    ingrdCount++;
                    ingredientList.add(riceChoice);
                }
            String meatChoice = randomIngredient(meat);
                if(!meatChoice.equals("no")){
                    ingrdCount++;
                    ingredientList.add(meatChoice);
                }
            String beansChoice = randomIngredient(beans);
                if(!beansChoice.equals("no")){
                    ingrdCount++;
                    ingredientList.add(beansChoice);
                }
            String salsaChoice = randomIngredient(salsa);
                if(!salsaChoice.equals("no")){
                    ingrdCount++;
                    ingredientList.add(salsaChoice);
                }
            String veggiesChoice = randomIngredient(veggies);
                if(!veggiesChoice.equals("no")){
                    ingrdCount++;
                    ingredientList.add(veggiesChoice);
                }

            //booleans
            String chees = randomBool(" , chees");
                if(chees.equals(" , chees")){
                    ingrdCount++;
                    ingredientList.add(chees);
                }
            String guac = randomBool(" , Guac");
                if(guac.equals(" , Guac")){
                    ingrdCount++;
                    ingredientList.add(guac);
                }
            String queso = randomBool(" , Queso");
                if(queso.equals(" , Queso")){
                    ingrdCount++;
                    ingredientList.add(queso);
                }
            String sourCream = randomBool(" , Sour cream");
                if(sourCream.equals(" , Sour cream")) {
                    ingrdCount++;
                    ingredientList.add(sourCream);
                }

            System.out.println("Burrito " + i + " : " + riceChoice + " rice, " +
                    meatChoice + " , " + beansChoice + " beans, " + salsaChoice + " salsa, " +
                    veggiesChoice + chees + guac + queso + sourCream + "  $" + (price + ingrdCount/2) + " == " + ingrdCount);

                totalPrice += price + ingrdCount/2;
        }

        //3 challenge
        int whiteNum = 0;
        int brownNum = 0;
        int allNum = 0;

        int chicken = 0, steak = 0, carnidas = 0, chorizo = 0 , sofritas = 0, veggieMeat = 0, allMeat = 0;
        int pinto = 0, black = 0, allBeans = 0;
        int mild = 0, medium = 0, hot = 0, allSalsa = 0;
        int lettuce = 0, fajitaVeggies = 0, allVeggie = 0;
        for (String str: ingredientList) {
            switch (str) {
                case "white":
                    whiteNum++;
                    break;
                case "brown":
                    brownNum++;
                    break;
                case "all":
                    allNum++;
                    break;
                case "checken":
                    chicken++;
                    break;
                case "steak":
                    steak++;
                    break;
                case "carnidas":
                    carnidas++;
                    break;
                case "chorizo":
                    chorizo++;
                    break;
                case "sofritas":
                    sofritas++;
                    break;
                case "veggie meat":
                    veggieMeat++;
                    break;
                case "all meat":
                    allMeat++;
                    break;
                case "pinto":
                    pinto++;
                    break;
                case "black":
                    black++;
                    break;
                case "all beans":
                    allBeans++;
                    break;
                case "mild":
                    mild++;
                    break;
                case "medium":
                    medium++;
                    break;
                case "hot":
                    hot++;
                    break;
                case "all salsa":
                    allSalsa++;
                    break;
                case "lettuce":
                    lettuce++;
                    break;
                case "fajita veggies":
                    fajitaVeggies++;
                    break;
                case "all veggies":
                    allVeggie++;
                    break;
            }


        }
        System.out.println("\nThis order has " + whiteNum + " white rice " + brownNum + " brown rice " + allNum + " both rice " +
                chicken + " chicken " + steak + " steak " + carnidas + " carnidas " + chorizo +" chorizo " + sofritas +" sofritas " +
                veggieMeat + " veggieMeat " + allMeat +" allMeat " + pinto + " pinto " + black + " black " + allBeans +" allBeans" +
                mild + " mild " + medium + " medium " + hot + " hot " + allSalsa + " allSalsa " + lettuce + " lettuce " +
                fajitaVeggies +" fajitaVeggies " + allVeggie + " allVeggie " + " total price is " + totalPrice);

    }
    //method for random generation
    public static String randomIngredient(String [] strArr) {
        Random r = new Random();
        //String chosenStr = strArr[r.nextInt(strArr.length )];



        return strArr[r.nextInt(strArr.length )];
    }
    // random boolean generator
    public static String randomBool(String str){
        Random r = new Random();
        if (r.nextBoolean())
            return str;
        else
            return "";
    }
}
