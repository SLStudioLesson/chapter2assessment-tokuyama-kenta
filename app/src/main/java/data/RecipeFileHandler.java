package data;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RecipeFileHandler {
    private String filePath;

    public RecipeFileHandler() {
        filePath = "app/src/main/resources/recipes.txt";
    }

    public RecipeFileHandler(String filePath) {
        this.filePath = filePath;

        
}

    /**
     * 設問1: 一覧表示機能
     *
     * @return レシピデータ
     */
    public ArrayList<String> readRecipes() {
       // String filename1 =  "app/src/main/resources/recipes.txt";

        ArrayList<String> recipe = new ArrayList<>();
         // recipes.txtからレシピデータを読み込み、それをリスト形式で返します。 <br> 
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
            recipe.add(line);
            }
        }catch (IOException e) {
            System.out.println(("<i>Error reading file: " + e.getMessage() + "</i>"));
        }
        return recipe;
    }

    /**
     * 設問2: 新規登録機能
     * 新しいレシピをrecipes.txtに追加します。<br>
     * レシピ名と材料はカンマ区切りで1行としてファイルに書き込まれます。
     *
     * @param recipeName レシピ名
     * @param ingredients 材料名
     */
     // 
    public void addRecipe(String recipeName, String ingredients) {
        String filename =  "app/src/main/resources/recipes.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            writer.write(recipeName + "," + ingredients);
            writer.newLine();
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
       // try {

       // } catch (IOException e) {

       // }
    }
}
