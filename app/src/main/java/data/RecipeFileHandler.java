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
        ArrayList<String> recipe = new ArrayList<>();
         // recipes.txtからレシピデータを読み込み、それをリスト形式で返します。 <br> 
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            } if (!line.trim().isEmpty()) {
                recipe.add(line.trim()); 
            }
        }
             // IOExceptionが発生したときは<i>Error reading file: 例外のメッセージ</i>とコンソールに表示します。
            catch (IOException e) {
            System.out.println(("<i>Error reading file: " + e.getMessage() + "</i>"));
        }
    
        // try {

        // } catch (IOException e) {
        //     System.out.println("Error reading file:" + e.getMessage());
        // }
        return null;
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
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String recipe2 = reader.readLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            writer.write(recipe2);
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
        // try {

        // } catch (IOException e) {

        // }
    }
}
