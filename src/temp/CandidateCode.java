package temp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class CandidateCode {

    private static Map<Integer,Integer> ingredients = new HashMap<Integer, Integer>();

    private static void init(String[] quantityOfEachIngredientRequired, String[] quantityOfEachIngredientPresent) {
        if (quantityOfEachIngredientRequired != null && quantityOfEachIngredientPresent != null &&
                quantityOfEachIngredientRequired.length == quantityOfEachIngredientPresent.length) {
            for(int i = 0; i < quantityOfEachIngredientRequired.length; i++) {
                ingredients.put(Integer.parseInt(quantityOfEachIngredientRequired[i]), Integer.parseInt(quantityOfEachIngredientPresent[i]));
            }
        }
    }

    private static int makeGirls(){
        int least = 0;
        int counter = 0;
        for(int key : ingredients.keySet()){
            if(counter == 0) {
                least = ingredients.get(key) / key;
                counter++;
            } else if(least > (ingredients.get(key) / key)){
                least = ingredients.get(key) / key;
            }
        }
        return least;
    }

    public static void main(String args[] ) throws Exception {
        int totalNoOfPowerPuffGirl = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfIngredients = Integer.parseInt(br.readLine());
        String[] quantityOfEachIngredientRequired = br.readLine().split(" ");
        String[] quantityOfEachIngredientPresent = br.readLine().split(" ");
        if(noOfIngredients > 0 && noOfIngredients == quantityOfEachIngredientRequired.length
                && noOfIngredients == quantityOfEachIngredientPresent.length) {
            init(quantityOfEachIngredientRequired, quantityOfEachIngredientPresent);
            totalNoOfPowerPuffGirl = makeGirls();
            System.out.println(totalNoOfPowerPuffGirl);
        }
   }
}
